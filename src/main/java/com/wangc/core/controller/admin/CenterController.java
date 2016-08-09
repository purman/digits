package com.wangc.core.controller.admin;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理
 * 
 * @author wangchao
 *
 */
@Controller
public class CenterController {

    @RequestMapping(value = "/test/springmvc.do")
    public String test(String name, Date birthday) {
        System.out.println("1:" + name);
        System.out.println("2:" + birthday);
        return "";
    }
    
    @RequestMapping(value = "/control/index.do")
    public String index(){
        return "index";
    }
    
    @RequestMapping(value = "/control/top.do")
    public String top(){
        return "top";
    }
    
    @RequestMapping(value = "/control/main.do")
    public String main(){
        return "main";
    }
    
    @RequestMapping(value = "/control/left.do")
    public String left(){
        return "left";
    }
    
    @RequestMapping(value = "/control/right.do")
    public String right(){
        return "right";
    }
}
