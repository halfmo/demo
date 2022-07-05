package com.example.demo.entity;/**
 * @author half_m
 * @Package com.example.demo.entity
 * @Classname Student
 * @Description TODO
 * @date 2022/7/4 13:25
 * @version 1.0
 */

import lombok.Data;

import java.util.Date;

/**
 *
 * @author half_m
 * @date 2022/07/041325
 **/

@Data
public class Student {
  private String code;
  private String name;
  private Integer age;
  private Date birthday;
}
