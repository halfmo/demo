package com.example.demo.api;/**
 * @author half_m
 * @Package com.example.demo.api
 * @Classname TestController
 * @Description TODO
 * @date 2022/7/4 11:13
 * @version 1.0
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author half_m
 * @date 2022/07/041113
 **/

/*
RestController 把返回值转换为json格式输出由servelet转出去
 */
@RestController
public class TestController {
  //添加了一个/hello 地址
  @GetMapping("/hello")
  public String hello(){
    return "你好，Spring Boot！";
  }
}
