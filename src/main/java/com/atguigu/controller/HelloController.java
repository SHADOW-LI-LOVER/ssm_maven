package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
  
  @RequestMapping("/show")
  public String show(){
    return "hei hei hei";
  }
}
