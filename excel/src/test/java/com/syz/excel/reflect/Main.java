package com.syz.excel.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class Main {
	
	@Test
	public void test1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Student student=new Student();
		Field[] fields = student.getClass().getDeclaredFields();
		Method[] methods = student.getClass().getDeclaredMethods();
		for (Method method : methods) {
			String name = method.getName();
			method.invoke(student, "222");
			System.out.println(name);
		}
		String string = JSON.toJSONString(student);
		System.out.println(string);
		/*for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			String name = field.getName();
			System.out.println(name);
		}*/
		
	}

}
