package com.wangc.core.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangc.core.dto.user.User;
import com.wangc.core.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/showUser", produces = "text/html;charset=UTF-8") 
    public String toIndex(HttpServletRequest request, Model model) {
        Long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.getById(userId);
        System.out.println("name:"+user.getUserName());
        model.addAttribute("user", user);
        return "showUser";
    }

}
