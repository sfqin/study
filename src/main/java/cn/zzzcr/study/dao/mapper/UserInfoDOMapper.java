package cn.zzzcr.study.dao.mapper;

import cn.zzzcr.study.dao.model.UserInfoDO;

import java.util.List;

public interface UserInfoDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoDO record);

    int insertSelective(UserInfoDO record);

    UserInfoDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfoDO record);

    int updateByPrimaryKey(UserInfoDO record);

    List<UserInfoDO> selectUser();
}