package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Stubber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
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



  @Test
  public void insertTest() {
    Student student = new Student();
    student.setCode("1234567");
    student.setName("李四");
    student.setAge(20);
    student.setBirthday(new Date());

    int count = dao.insert(student);
    System.out.println(count);
  }

  @Test
  public void updateTest(){
    Student student = new Student();
    student.setCode("1234567");
    student.setName("mgq");
    student.setAge(28);
    student.setBirthday(new Date());

    int count = dao.update(student);
    System.out.println(count);
  }

  @Test
  public void deleteTest() {
    int count = dao.delete("12345");
    System.out.println(count);
  }

}