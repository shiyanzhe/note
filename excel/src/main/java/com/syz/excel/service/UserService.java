package com.syz.excel.service;

import java.util.List;

import com.syz.excel.pojo.User;

public interface UserService<T> {
	
	public List<T> findAllUser();

}
