package com.sq.project.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_results") //new table
public class Result {
    String userId;
    String answerD1Q1;
    //c1_q1_responseTime
    String answerD1Q2;
    String answerD1Q3;
    int answerD1R1;
    int answerD1R2;
    int answerD1R3;

}
