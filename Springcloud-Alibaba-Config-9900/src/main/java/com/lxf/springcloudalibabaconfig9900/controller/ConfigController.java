package com.lxf.springcloudalibabaconfig9900.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiXiaoFeng
 * @date 2022年02月22日 15:05
 */

@RefreshScope
@RestController
public class ConfigController {


    @Value("${name}")
    private String name;

    @GetMapping(value = "/getConfig")
    public String getConfig() {
        return "get Message:"+name;
    }
}
