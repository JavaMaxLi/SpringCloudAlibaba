package com.lxf.springcloudalibabasentinel9005.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping(value = "/getTestA")
    public String getTestA(@RequestParam(value = "param") String name) {
        return "TestA-----"+name;
    }

    @GetMapping(value = "/getTestB")
    public String getTestB(String param) {
        return "TestB-----"+param;
    }
}
