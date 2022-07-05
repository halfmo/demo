package com.example.demo.dao;


import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author half_m
 * @version 1.0
 * @Package com.example.demo.dao
 * @Classname StudentDao
 * @Description TODO
 * @date 2022/7/5 13:53
 */

@Repository
public interface StudentDao {

  @Select("SELECT * FROM mystudent")
  public List<Map> selectAll();

  @Insert("INSERT INTO mystudent VALUES (#{code},#{name},#{age},#{birthday})")
  public Integer insert(Student student);

  @Update("UPDATE mystudent SET name=#{name}, age=#{age}, birthday=#{birthday} WHERE code=#{code} ")
  public Integer update(Student student);

  @Delete("DELETE FROM mystudent WHERE code=#{code}")
  public Integer delete(@Param("code") String id);
}
