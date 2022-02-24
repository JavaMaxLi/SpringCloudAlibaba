package com.lxf.springcloudalibabasentinel9005.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LiXiaoFeng
 * @date 2022年02月24日 17:01
 */
public class CustomerHandler {

    public static String handlerException(String param, String param2, BlockException e) {
        return "CustomerHandler.handlerException"+e.fillInStackTrace().getMessage();
    }

    public static String handlerException2(String param,String param2,BlockException e) {
        return "CustomerHandler.handlerException2"+e.fillInStackTrace().getMessage();
    }
}
