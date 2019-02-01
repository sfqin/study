package cn.zzzcr.study.dao.impl;

import cn.zzzcr.study.dao.UserDao;
import cn.zzzcr.study.dao.mapper.UserInfoDOMapper;
import cn.zzzcr.study.dao.model.UserInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private UserInfoDOMapper userInfoDOMapper;

    public List<UserInfoDO> selectUser() {

        List<UserInfoDO> userInfoDOS = userInfoDOMapper.selectUser();
        return userInfoDOS == null ? new ArrayList<UserInfoDO>() : userInfoDOS;
    }
}
