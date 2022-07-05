package com.example.demo.api;/**
 * @author half_m
 * @Package com.example.demo.api
 * @Classname TestController2
 * @Description TODO
 * @date 2022/7/4 11:37
 * @version 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author half_m
 * @date 2022/07/041137
 **/
@Controller
public class TestController2 {
  @GetMapping("/hello2")
  @ResponseBody
  public String hello(){
    return "你好，Spring Boot22！";
  }
}
