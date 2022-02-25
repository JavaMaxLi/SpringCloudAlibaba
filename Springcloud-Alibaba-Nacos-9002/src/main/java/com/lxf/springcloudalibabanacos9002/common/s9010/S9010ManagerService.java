package com.lxf.springcloudalibabanacos9002.common.s9010;

import java.util.List;

/**
 * @author LiXiaoFeng
 * @date 2022年01月14日 15:48
 */
public interface S9010ManagerService {

    List<S9010ManagerDBO> doSelectList(S9010ManagerDBO param);

    S9010ManagerDBO doRead(S9010ManagerDBO param);

    boolean doUpdate(S9010ManagerDBO param);

    boolean doDelete(S9010ManagerDBO param);

    boolean doInsert(S9010ManagerDBO param);
}
