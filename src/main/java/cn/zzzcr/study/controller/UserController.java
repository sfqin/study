package cn.zzzcr.study.controller;

import cn.zzzcr.study.dao.model.UserInfoDO;
import cn.zzzcr.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<UserInfoDO> selectUser(){

        List<UserInfoDO> userInfoDOS = userService.selectUser();

        return userInfoDOS;
    }
}
