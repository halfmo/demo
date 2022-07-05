package com.example.demo.api;/**
 * @author half_m
 * @Package com.example.demo.api
 * @Classname StudentApi
 * @Description TODO
 * @date 2022/7/4 13:11
 * @version 1.0
 */

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.form.Insert;
import com.example.demo.form.StudentForm;
import com.example.demo.form.Update;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author half_m
 * @date 2022/07/041311
 **/

@Validated        //单参数校验、类上必须加入Validated注解
@RestController
@RequestMapping(value = "/student")  //类上的地址会成为所有方法的根域 ，不在类上添加就要在每个方法上加
public class StudentApi {
  /*
  学生：编号、姓名、年龄、生日
  完成如下api
  1.查询：按照Id主键查询一条数据
  2.查询：依照条件查询多条数据
  3-5：insert、update、delete
   */

  @Autowired
  private StudentDao dao;

  @GetMapping("queryall")
  public List<Map> queryAll(){
    return dao.selectAll();
  }


  /**
   * 按照Id主键查询一条数据
   * @param id
   * @return Student
   */
  @GetMapping("/querybyid")   //第一种：直接对函数的参数
  public Student queryById(@RequestParam("code")
                             //@NotBlank(message = "id not null")
                             @Length(min = 6, max = 6)
                             String id){
    //@RequestParam有两个作用：     1.在request请求中必须传入对应的参数
    //                            2.可以修改映射的规则，讲id改名为code

    Student student = new Student();
    student.setCode(id);
    student.setName("aa");
    student.setAge(21);
    student.setBirthday(new Date());
    return student;
  }

  //使用pathvalue方式解析参数,一般一个值
  @GetMapping("/querybyid2/{id}")   //第二种：pathvalue {id}占位符
  public Student queryById2(@PathVariable("id") String id){

    Student student = new Student();
    student.setCode(id);
    student.setName("aa");
    student.setAge(21);
    student.setBirthday(new Date());
    return student;
  }

  //使用封装的对象接受整体参数（Form对象）
  @PostMapping("/insert")
  public String insert(StudentForm studentForm){
    System.out.println(studentForm.toString());
    System.out.println(studentForm.getName());
    return "ok";
  }

  @PostMapping("/insert2")
  public String insert2(@RequestBody @Validated(value = Insert.class) StudentForm studentForm){
    //@RequestBody 从reques中解析json格式的数据，用的是postman中的body中的raw（值得注意的是raw和之前的urlencoded的日期格式的区别——
    System.out.println(studentForm.toString());
    System.out.println(studentForm.getName());
    return "ok";
  }

  @PostMapping("/update")
  public String update(@RequestBody @Validated(value = Update.class) StudentForm studentForm){
    System.out.println(studentForm.toString());
    return "ok";
  }






}
