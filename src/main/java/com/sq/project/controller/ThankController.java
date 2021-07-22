package com.sq.project.controller;


import com.sq.project.bean.Result;
import com.sq.project.bean.Result2;
import com.sq.project.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ThankController {

    @Autowired
    TrainingService trainingService;


    @RequestMapping("/to_submit_page/{a}/{t}")
    public String indexToTrainingSubmit(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("dataset2_answer_5_3",answer);
        session.setAttribute("dataset2_reaction_5_3",reactionTime);
        return "redirect:/training_demo_submit";
    }

    @RequestMapping("/to_thanks")
    public String indexToThanks(HttpSession session){
        Result2 result = new Result2();
        result.setUserId((String)session.getAttribute("userId"));
        String answer_1_1 = (String)session.getAttribute("dataset2_answer_1_1");
        result.setAnswerD1Q1(answer_1_1);
        int reaction_1_1 = (int)session.getAttribute("dataset2_reaction_1_1");
        result.setAnswerD1R1(reaction_1_1);
        String answer_1_2 = (String)session.getAttribute("dataset2_answer_1_2");
        result.setAnswerD1Q2(answer_1_2);
        int reaction_1_2 = (int)session.getAttribute("dataset2_reaction_1_2");
        result.setAnswerD1R2(reaction_1_2);
        String answer_1_3 = (String)session.getAttribute("dataset2_answer_1_3");
        result.setAnswerD1Q3(answer_1_3);
        int reaction_1_3 = (int)session.getAttribute("dataset2_reaction_1_3");
        result.setAnswerD1R3(reaction_1_3);
        String answer_2_1 = (String)session.getAttribute("dataset2_answer_2_1");
        result.setAnswerD2Q1(answer_2_1);
        int reaction_2_1 = (int)session.getAttribute("dataset2_reaction_2_1");
        result.setAnswerD2R1(reaction_2_1);
        String answer_2_2 = (String)session.getAttribute("dataset2_answer_2_2");
        result.setAnswerD2Q2(answer_2_2);
        int reaction_2_2 = (int)session.getAttribute("dataset2_reaction_2_2");
        result.setAnswerD2R2(reaction_2_2);
        String answer_2_3 = (String)session.getAttribute("dataset2_answer_2_3");
        result.setAnswerD2Q3(answer_2_3);
        int reaction_2_3 = (int)session.getAttribute("dataset2_reaction_2_3");
        result.setAnswerD2R3(reaction_2_3);
        String answer_3_1 = (String)session.getAttribute("dataset2_answer_3_1");
        result.setAnswerD3Q1(answer_3_1);
        int reaction_3_1 = (int)session.getAttribute("dataset2_reaction_3_1");
        result.setAnswerD3R1(reaction_3_1);
        String answer_3_2 = (String)session.getAttribute("dataset2_answer_3_2");
        result.setAnswerD3Q2(answer_3_2);
        int reaction_3_2 = (int)session.getAttribute("dataset2_reaction_3_2");
        result.setAnswerD3R2(reaction_3_2);
        String answer_3_3 = (String)session.getAttribute("dataset2_answer_3_3");
        result.setAnswerD3Q3(answer_3_3);
        int reaction_3_3 = (int)session.getAttribute("dataset2_reaction_3_3");
        result.setAnswerD3R3(reaction_3_3);
        String answer_4_1 = (String)session.getAttribute("dataset2_answer_4_1");
        result.setAnswerD4Q1(answer_4_1);
        int reaction_4_1 = (int)session.getAttribute("dataset2_reaction_4_1");
        result.setAnswerD4R1(reaction_4_1);
        String answer_4_2 = (String)session.getAttribute("dataset2_answer_4_2");
        result.setAnswerD4Q2(answer_4_2);
        int reaction_4_2 = (int)session.getAttribute("dataset2_reaction_4_2");
        result.setAnswerD4R2(reaction_4_2);
        String answer_4_3 = (String)session.getAttribute("dataset2_answer_4_3");
        result.setAnswerD4Q3(answer_4_3);
        int reaction_4_3 = (int)session.getAttribute("dataset2_reaction_4_3");
        result.setAnswerD4R3(reaction_4_3);
        String answer_5_1 = (String)session.getAttribute("dataset2_answer_5_1");
        result.setAnswerD5Q1(answer_5_1);
        int reaction_5_1 = (int)session.getAttribute("dataset2_reaction_5_1");
        result.setAnswerD5R1(reaction_5_1);
        String answer_5_2 = (String)session.getAttribute("dataset2_answer_5_2");
        result.setAnswerD5Q2(answer_5_2);
        int reaction_5_2 = (int)session.getAttribute("dataset2_reaction_5_2");
        result.setAnswerD5R2(reaction_5_2);
        String answer_5_3 = (String)session.getAttribute("dataset2_answer_5_3");
        result.setAnswerD5Q3(answer_5_3);
        int reaction_5_3 = (int)session.getAttribute("dataset2_reaction_5_3");
        result.setAnswerD5R3(reaction_5_3);
        trainingService.saveDataset2Result(result);
        return "thankspage";
    }
}
