package com.syz.excel.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.syz.excel.pojo.User;
import com.syz.excel.service.UserService;
import com.syz.excel.util.DownExcel;

@Controller
public class UserController {
	@Autowired
	UserService<User> userService;
	@RequestMapping("/user")
	@ResponseBody
	public void getAllUser(HttpServletResponse response) {
		List<User> findAllUser = userService.findAllUser();
		DownExcel<User> ee= new DownExcel<User>();  
        String[] headers = {"姓名", "年龄" };  
        String fileName = "用户信息表";  
        ee.exportExcel(headers,findAllUser,fileName,response);
//		String string = JSON.toJSONString(findAllUser);
//		return string;
	}
}
