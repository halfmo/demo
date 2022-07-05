package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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
  List<Map> selectAll();
}
