package com.wangc.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模块身体加载
 * 
 * @author wangchao
 *
 */
@Controller
public class FrameController {

    @RequestMapping(value = "control/frame/product_main.do")
    public String productMain() {
        return "frame/product_main";
    }
    
    @RequestMapping(value = "control/frame/product_left.do")
    public String productLeft() {
        return "frame/product_left";
    }
    
    @RequestMapping(value = "control/frame/order_main.do")
    public String orderMain() {
        return "frame/order_main";
    }
    
    @RequestMapping(value = "control/frame/order_left.do")
    public String orderLeft() {
        return "frame/order_left";
    }
    

}
