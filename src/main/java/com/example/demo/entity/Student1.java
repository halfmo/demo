package com.example.demo.entity;/**
 * @author half_m
 * @Package com.example.demo.entity
 * @Classname Student1
 * @Description TODO
 * @date 2022/7/6 10:54
 * @version 1.0
 */

import lombok.Data;

import java.util.Date;

/**
 *
 * @author half_m
 * @date 2022/07/061054
 **/
@Data
public class Student1 {
  private String myCode;
  private String myName;
  private Integer myAge;
  private Date myBirthday;
}
