package cn.zzzcr.study.service;


import cn.zzzcr.study.dao.model.UserInfoDO;

import java.util.List;

public interface UserService {


    List<UserInfoDO> selectUser();

}
