package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author half_m
 * @version 1.0
 * @Package com.example.demo.dao
 * @Classname StudentMapper
 * @Description TODO
 * @date 2022/7/6 9:43
 */

@Repository
public interface StudentMapper {
  public List<Map> selectAll();

  //数据库列名和对象属性名是一致时，自动映射
  public List<Map> selectAll1();

  //改了别名后不能直接映射
  public List<Map> selectAll2();

  //可以映射驼峰命名，并且在yml文件中开启驼峰映射
  public List<Map> selectAll3();

  public List<Student> selectByCondition(@Param("name") String name,
                                         @Param("age") Integer age,
                                         @Param("birthday") Date birthday

                                         );

  public Integer insert(Student student);

  public Integer delete(@Param("code") String id);
}
