package cn.zzzcr.study.dao;

import cn.zzzcr.study.dao.model.UserInfoDO;


import java.util.List;


public interface UserDao {

    List<UserInfoDO> selectUser();

}
