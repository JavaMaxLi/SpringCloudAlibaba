package com.lxf.springcloudalibabaconsumer9003.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lxf.springcloudalibabaconsumer9003.RESTResultBean;
import com.lxf.springcloudalibabaconsumer9003.common.s9010.S9010ManagerDBO;
import com.lxf.springcloudalibabaconsumer9003.service.UserService;
import io.netty.handler.codec.EmptyHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LiXiaoFeng
 * @date 2022年02月22日 10:10
 */
@RestController
@RefreshScope
public class NacosController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserService userService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Value("${spring.application.name}")
    private String appName;

    //Nacos配置中心获取属性
    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private int userAge;

    @GetMapping("/echo/app-name")
    public String echoAppName(String name){
        //Access through the combination of LoadBalanceClient and RestTemplate
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String path = String.format("http://%s:%s/hello/getValue?name=%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        System.out.println("request path:" +path+"====userName:"+userName+"====userAge"+userAge);
        return restTemplate.getForObject(path,String.class)+"====userName:"+userName+"====userAge"+userAge;
    }

    @GetMapping("/getManagerLists")
    public List<S9010ManagerDBO> getManagerLists(String name){
        //Access through the combination of LoadBalanceClient and RestTemplate
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String path = String.format("http://%s:%s/hello/getManagerLists?name=%s",serviceInstance.getHost(),serviceInstance.getPort(),name);
        List<S9010ManagerDBO> list = new ArrayList<>();
        List forEntity = restTemplate.getForObject(path, list.getClass());

        return forEntity;
    }

    @GetMapping(value = "/getManager")
    @SentinelResource(value = "getManager", fallback = "getManagerFallBack")
    public RESTResultBean getManager(String puk) {
        RESTResultBean resultBean = new RESTResultBean();
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String path = String.format("http://%s:%s/hello/getManager?puk=%s",serviceInstance.getHost(),serviceInstance.getPort(),puk);
        System.out.println(path);
        S9010ManagerDBO forObject = restTemplate.getForObject(path, S9010ManagerDBO.class);
        if (forObject == null) {
            throw new NullPointerException("传入错误puk，查询不到对应信息");
        }
        resultBean.setData(forObject);
        return resultBean;
    }

    public RESTResultBean getManagerFallBack(String puk, Throwable e) {
        RESTResultBean resultBean = new RESTResultBean();
        resultBean.setData(e.getMessage());
        return resultBean;
    }

    @GetMapping(value = "/getManagerWithInterface")
    public RESTResultBean getManagerWithInterface(S9010ManagerDBO param) {
        RESTResultBean manager = userService.getManager(param);
        return manager;
    }

    @GetMapping(value = "/getManagerWithPuk")
    public RESTResultBean getManagerWithInterfacePuk(String puk) {
        RESTResultBean manager = userService.getManagerPuk(puk);
        return manager;
    }

}
