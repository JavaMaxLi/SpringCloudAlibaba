package com.lxf.springcloudalibabanacos9002.common.s9010;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiXiaoFeng
 * @date 2022年01月14日 15:48
 */
@Service
public class S9010ManagerImpl implements S9010ManagerService{

    @Resource
    S9010ManagerDao s9010ManagerDao;


    @Override
    public List<S9010ManagerDBO> doSelectList(S9010ManagerDBO param) {
        System.out.println("s9010ManagerDao.doSelectList(param)");
        return s9010ManagerDao.doSelectList(param);
    }

    @Override
    public S9010ManagerDBO doRead(S9010ManagerDBO param) {
        return s9010ManagerDao.doRead(param);
    }

    @Override
    public boolean doUpdate(S9010ManagerDBO param) {
        return s9010ManagerDao.doUpdate(param);
    }

    @Override
    public boolean doDelete(S9010ManagerDBO param) {
        return s9010ManagerDao.doDelete(param);
    }

    @Override
    public boolean doInsert(S9010ManagerDBO param) {
        return s9010ManagerDao.doInsert(param);
    }
}
