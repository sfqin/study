package cn.zzzcr.study.service.impl;

import cn.zzzcr.study.dao.UserDao;
import cn.zzzcr.study.dao.model.UserInfoDO;
import cn.zzzcr.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<UserInfoDO> selectUser() {

        List<UserInfoDO> userInfoDOS = userDao.selectUser();

        return userInfoDOS;
    }
}
