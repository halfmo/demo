package com.example.demo.common;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author half_m
 * @version 1.0
 * @Package com.example.demo.common
 * @Classname TestHandlerInterceptor
 * @Description TODO
 * @date 2022/7/5 11:50
 */
public class TestHandlerInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    return HandlerInterceptor.super.preHandle(request, response, handler);
  }
}
