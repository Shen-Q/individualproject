package com.sq.project.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_infos") //new table
public class User {
//    int id; // Primary Key
    String userId;
    String userIsTested;
    String userDevice;
    String userGender;
    String userAge;
    String userEducation;
    String userWork;
    String userChildhood;
    String userFrom;
  //  @DateTimeFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    LocalDateTime userCreateTime;

}
