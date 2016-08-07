package com.wangc.core.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

@Controller
public class CenterController {

	@RequestMapping(value="/test/springmvc.do")
	public String test(String name,Date birthday){
		
		System.out.println("1:"+name);
		System.out.println("2:"+birthday);
		return "";
	}

	/**
	 * 日期转换器，后面写在配置文件中
	 */
//	@InitBinder
//	public void initBinder(WebDataBinder binder, WebRequest request) {
//		//转换日期格式
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//	}
}
