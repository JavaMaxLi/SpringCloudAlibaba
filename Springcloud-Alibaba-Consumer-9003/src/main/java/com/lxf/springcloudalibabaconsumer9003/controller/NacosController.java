package com.lxf.springcloudalibabaconsumer9003.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
}
