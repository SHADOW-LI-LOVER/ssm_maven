package com.atguigu.controller;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public String getList(Map<String,Object> map){
        map.put("users",userService.queryUsers());
        return "forward:/index.jsp";
    }
}
