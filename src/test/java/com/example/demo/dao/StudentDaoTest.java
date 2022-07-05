package com.example.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;


/**
 * @author half_m
 * @version 1.0
 * @Package com.example.demo.dao
 * @Classname StudentDaoTest
 * @Description TODO
 * @date 2022/7/5 14:56
 */
@SpringBootTest
class StudentDaoTest {

  @Autowired
  StudentDao dao;

  @Test
  void selectAll() {
    List<Map> list = dao.selectAll();
    System.out.println(list);
  }
}