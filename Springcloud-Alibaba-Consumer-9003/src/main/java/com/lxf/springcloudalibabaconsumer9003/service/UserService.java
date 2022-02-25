package com.lxf.springcloudalibabaconsumer9003.service;

import com.lxf.springcloudalibabaconsumer9003.RESTResultBean;
import com.lxf.springcloudalibabaconsumer9003.common.s9010.S9010ManagerDBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LiXiaoFeng
 * @date 2022年02月25日 15:22
 */
@FeignClient(value = "nacos-provider",fallback = UserServiceFallBack.class)
@Component
public interface UserService {

    @GetMapping(value = "/hello/getManager")
    public RESTResultBean getManager(S9010ManagerDBO param);

    @GetMapping(value = "/hello/getManagerPuk")
    RESTResultBean getManagerPuk(@RequestParam(value = "puk") String puk);
}
