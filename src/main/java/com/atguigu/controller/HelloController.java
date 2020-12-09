package com.atguigu.controller;

@Controller
@RequestMapping("/hello")
public class HelloController {
  
  @RequestMapping("/show")
  public String show(){
    return "hei hei hei";
  }
}
