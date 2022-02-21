package com.lxf.springcloudalibabanacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiXiaoFeng
 * @date 2022年02月21日 13:57
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping(value = "/getValue")
    public String getValue(@RequestParam(value = "name")String names) {
        return names + "你好！";
    }
}
