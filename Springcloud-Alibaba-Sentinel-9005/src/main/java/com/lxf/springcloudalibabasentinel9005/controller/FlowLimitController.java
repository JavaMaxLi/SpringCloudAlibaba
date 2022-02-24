package com.lxf.springcloudalibabasentinel9005.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lxf.springcloudalibabasentinel9005.handler.CustomerHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping(value = "/getTestA")
    public String getTestA(@RequestParam(value = "param") String name) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(2000);
        return "TestA-----"+name;
    }

    @GetMapping(value = "/getTestB")
    public String getTestB(String param) throws InterruptedException {
        log.info(Thread.currentThread().getName()+"===/getTestB");
        return "TestB-----"+param;
    }

    @GetMapping(value = "/getTestRT")
    public String getTestRT(String param) throws InterruptedException {
        log.info(Thread.currentThread().getName()+"===/getTestRT");
        if ("1".equals(param)) {
            int a = 10/0;
        }
        return "TestRT-----"+param;
    }

    @GetMapping(value = "/hotKeyTest")
    @SentinelResource(value = "hotKeyTest",blockHandler = "hotKeyTestError",fallback = "hotKeyTestFallBack")//热点key限流
    public String hotKeyTest(@RequestParam(value = "param1",required = false)String param, @RequestParam(value = "param2",required = false)String param2) {
        return "hotKeyTest======"+param+"====="+param2;
    }

    /**
     * blockHandlerClass使用同一类进行处理方法必须是static静态方法
     * @param param
     * @param param2
     * @return
     */
    @GetMapping(value = "/customerHandler")
    @SentinelResource(value = "customerHandler",blockHandlerClass = CustomerHandler.class,blockHandler = "handlerException")//热点key限流
    public String customerHandler(@RequestParam(value = "param1",required = false)String param, @RequestParam(value = "param2",required = false)String param2) {
        return "customerHandler======"+param+"====="+param2;
    }

    /**
     * 热点key限流调用方法
     * @param param
     * @param param2
     * @param e
     * @return
     */
    public String hotKeyTestError(String param, String param2, BlockException e) {
        return "Sorry！hotKeyTestError";
    }

    /**
     * 代码异常调用返回方法
     * @param param
     * @param param2
     * @return
     */
    public String hotKeyTestFallBack(String param, String param2) {
        log.info("Sorry！hotKeyTestFallBack");
        return "Sorry！hotKeyTestFallBack";
    }
}
