package com.syz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pay")
public class TestController {
	private Log log=LogFactory.getLog(TestController.class);
	@RequestMapping("test")
	public ModelAndView login(Student student,HttpServletResponse response,HttpServletRequest request){
		student.setAge("摆摆熊");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/viewjsp/NewFile.jsp");
		log.info(request.getContextPath());
		System.out.println(request.getContextPath()+"一响贪欢");
		modelAndView.addObject(student);
//		HttpClientUtil.doPost(new HashMap(), "http://localhost:9080/pay/test2");
		return modelAndView;
	}
	
	@RequestMapping("test2")
	public String test2(){
		return "/WEB-INF/viewjsp/NewFile2.jsp";
	}
}
