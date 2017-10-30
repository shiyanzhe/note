package com.syz.excel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.syz.excel.pojo.User;
import com.syz.excel.pojo.UserExample;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);
    
    List<User> selectAllUser();

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}