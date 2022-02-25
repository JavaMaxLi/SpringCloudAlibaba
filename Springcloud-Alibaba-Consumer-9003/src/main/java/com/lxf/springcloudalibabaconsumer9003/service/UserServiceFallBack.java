package com.lxf.springcloudalibabaconsumer9003.service;

import com.lxf.springcloudalibabaconsumer9003.RESTResultBean;
import com.lxf.springcloudalibabaconsumer9003.common.s9010.S9010ManagerDBO;
import org.springframework.stereotype.Component;

/**
 * @author LiXiaoFeng
 * @date 2022年02月25日 15:28
 */
@Component
public class UserServiceFallBack implements UserService{
    @Override
    public RESTResultBean getManager(S9010ManagerDBO param) {
        RESTResultBean resultBean = new RESTResultBean();
        resultBean.setMessage("UserService.getManager(S9010ManagerDBO param)方法调用出现异常");
        resultBean.setCode("10001");
        return resultBean;
    }

    @Override
    public RESTResultBean getManagerPuk(String puk) {
        RESTResultBean resultBean = new RESTResultBean();
        resultBean.setMessage("UserService.getManager(S9010ManagerDBO param)方法调用出现异常");
        resultBean.setCode("10001");
        return resultBean;
    }
}
