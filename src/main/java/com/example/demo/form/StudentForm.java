package com.example.demo.form;
/**
 * @author half_m
 * @Package com.example.demo.form
 * @Classname StudentForm
 * @Description TODO
 * @date 2022/7/4 14:28
 * @version 1.0
 */

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 *
 * @author half_m
 * @date 2022/07/041428
 **/

//用于接收add参数和update参数合并了
@Data
public class StudentForm {

  @NotNull(groups = {Update.class})
  @Length(min = 6, max = 6, groups = {Update.class})
  private String code;

  @NotBlank(groups = {Update.class, Insert.class})
  @Length(min = 1, max = 20, groups = {Update.class, Insert.class})
  @Pattern(regexp = "[a-zA-Z]{1,20}", groups = {Update.class, Insert.class})
  private String name;

  @NotNull(groups = {Update.class, Insert.class})
  @Range(min = 1, max = 100, groups = {Update.class, Insert.class})
  private Integer age;
  private Date birthday;
}
