package com.lxf.springcloudalibabanacos.common.s9010;



import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/** 系统用户*/
@Mapper
public interface S9010ManagerDao{

    List<S9010ManagerDBO> doSelectList(S9010ManagerDBO param);

    S9010ManagerDBO doRead(S9010ManagerDBO param);

    boolean doUpdate(S9010ManagerDBO param);

    boolean doDelete(S9010ManagerDBO param);

    boolean doInsert(S9010ManagerDBO param);
}
