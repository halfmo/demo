package com.example.demo.dao;/**
 * @author half_m
 * @Package com.example.demo.dao
 * @Classname StudentMapperTests
 * @Description TODO
 * @date 2022/7/6 10:28
 * @version 1.0
 */

import com.example.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author half_m
 * @date 2022/07/061028
 **/
@SpringBootTest
public class StudentMapperTests {
  @Autowired
  StudentMapper studentMapper;

  @Test
  void selectAll() {
    List<Map> list = studentMapper.selectAll();
    System.out.println(list);
  }


  @Test
  void selectAll1() {
    List<Map> list = studentMapper.selectAll1();
    System.out.println(list);
  }

  @Test
  void selectAll2() {
    List<Map> list = studentMapper.selectAll2();
    System.out.println(list);
  }
  @Test
  void selectAll3() {
    List<Map> list = studentMapper.selectAll3();
    System.out.println(list);
  }

  @Test
  void selectByCondition() throws ParseException {
    List<Student> list = studentMapper.selectByCondition("王五",null,null);
    System.out.println(list);

    list = studentMapper.selectByCondition(null, 20,null);
    System.out.println(list);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    list = studentMapper.selectByCondition(null, null,sdf.parse("2001/11/11"));
    System.out.println(list);
  }


  @Test
  public void insertTest() {
    Student student = new Student();
    student.setCode("1234567");
    student.setName("李四");
    student.setAge(20);
    student.setBirthday(new Date());

    int count = studentMapper.insert(student);
    System.out.println(count);
  }

  @Test
  public void deleteTest() {
    int count = studentMapper.delete("1234567");
    System.out.println(count);
  }
}
