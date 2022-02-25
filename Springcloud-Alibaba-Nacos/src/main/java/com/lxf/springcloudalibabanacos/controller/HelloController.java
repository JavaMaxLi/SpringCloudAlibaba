package com.lxf.springcloudalibabanacos.controller;

import com.lxf.springcloudalibabanacos.RESTResultBean;
import com.lxf.springcloudalibabanacos.common.s9010.S9010ManagerDBO;
import com.lxf.springcloudalibabanacos.common.s9010.S9010ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LiXiaoFeng
 * @date 2022年02月21日 13:57
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @Autowired
    S9010ManagerService s9010ManagerService;


    @GetMapping(value = "/getValue")
    public String getValue(@RequestParam(value = "name")String names) {
        return names + "你好！";
    }

    @GetMapping(value = "/getManager")
    public RESTResultBean getManager(S9010ManagerDBO param) {
        RESTResultBean result = new RESTResultBean();
        result.setData(s9010ManagerService.doRead(param));

        return result;
    }

    @GetMapping(value = "/getManagerPuk")
    public RESTResultBean getManagerPuk(String puk) {
        RESTResultBean result = new RESTResultBean();
        S9010ManagerDBO s9010ManagerDBO = new S9010ManagerDBO();
        s9010ManagerDBO.setPuk(puk);
        result.setData(s9010ManagerService.doRead(s9010ManagerDBO));

        return result;
    }

    @GetMapping(value = "/getManagerLists")
    public List<S9010ManagerDBO> getManagerLists(@RequestBody S9010ManagerDBO param) {
        List<S9010ManagerDBO> s9010ManagerDBOS = s9010ManagerService.doSelectList(param);
        return s9010ManagerDBOS;
    }
    

}
