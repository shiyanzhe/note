package com.syz.excel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syz.excel.mapper.UserMapper;
import com.syz.excel.pojo.User;
import com.syz.excel.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	public List<User> findAllUser() {
		List<User> user = userMapper.selectAllUser();
		return user;
	}
	

}
