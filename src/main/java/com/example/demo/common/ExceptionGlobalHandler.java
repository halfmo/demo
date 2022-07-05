package com.example.demo.common;/**
 * @author half_m
 * @Package com.example.demo.common
 * @Classname ExceptionGlobalHandler
 * @Description TODO
 * @date 2022/7/5 11:38
 * @version 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author half_m
 * @date 2022/07/051138
 **/

@ControllerAdvice
public class ExceptionGlobalHandler {
  @ExceptionHandler(Exception.class)
  @ResponseBody
  public Map<String, String> handler(Exception ex) {
    Map<String, String> result = new HashMap<>();
    result.put("code", "500");
    result.put("msg", ex.getMessage());
    return result;
  }
}
