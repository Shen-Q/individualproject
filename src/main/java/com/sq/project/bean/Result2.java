package com.sq.project.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_results_2") //new table
public class Result2 {
    String userId;
    String answerD1Q1;
    String answerD1Q2;
    String answerD1Q3;
    String answerD2Q1;
    String answerD2Q2;
    String answerD2Q3;
    String answerD3Q1;
    String answerD3Q2;
    String answerD3Q3;
    String answerD4Q1;
    String answerD4Q2;
    String answerD4Q3;
    String answerD5Q1;
    String answerD5Q2;
    String answerD5Q3;
    int answerD1R1;
    int answerD1R2;
    int answerD1R3;
    int answerD2R1;
    int answerD2R2;
    int answerD2R3;
    int answerD3R1;
    int answerD3R2;
    int answerD3R3;
    int answerD4R1;
    int answerD4R2;
    int answerD4R3;
    int answerD5R1;
    int answerD5R2;
    int answerD5R3;

}
