package com.wangc.core.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {

	@RequestMapping(value="/test/springmvc.do")
	public String test(String name,Date birthday){
		
		System.out.println("1:"+name);
		System.out.println("2:"+birthday);
		return "";
	}

}
