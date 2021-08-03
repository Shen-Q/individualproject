package com.sq.project.controller;


import com.sq.project.bean.Result1;
import com.sq.project.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DataTwoController {

    @Autowired
    TrainingService trainingService;

    @RequestMapping({"/to_data2_demo_1/{a}/{t}"})
    public String indexToData2Demo1(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_3_3", answer);
        session.setAttribute("dataset1_reaction_3_3", reactionTime);
        //        Result1 result = new Result1();
//        result.setUserId((String)session.getAttribute("userId"));
//        String answer_1_1 = (String)session.getAttribute("dataset1_answer_1_1");
//        result.setAnswerD1Q1(answer_1_1);
//        int reaction_1_1 = (Integer)session.getAttribute("dataset1_reaction_1_1");
//        result.setAnswerD1R1(reaction_1_1);
//        String answer_1_2 = (String)session.getAttribute("dataset1_answer_1_2");
//        result.setAnswerD1Q2(answer_1_2);
//        int reaction_1_2 = (Integer)session.getAttribute("dataset1_reaction_1_2");
//        result.setAnswerD1R2(reaction_1_2);
//        String answer_1_3 = (String)session.getAttribute("dataset1_answer_1_3");
//        result.setAnswerD1Q3(answer_1_3);
//        int reaction_1_3 = (Integer)session.getAttribute("dataset1_reaction_1_3");
//        result.setAnswerD1R3(reaction_1_3);
//        String answer_2_1 = (String)session.getAttribute("dataset1_answer_2_1");
//        result.setAnswerD2Q1(answer_2_1);
//        int reaction_2_1 = (Integer)session.getAttribute("dataset1_reaction_2_1");
//        result.setAnswerD2R1(reaction_2_1);
//        String answer_2_2 = (String)session.getAttribute("dataset1_answer_2_2");
//        result.setAnswerD2Q2(answer_2_2);
//        int reaction_2_2 = (Integer)session.getAttribute("dataset1_reaction_2_2");
//        result.setAnswerD2R2(reaction_2_2);
//        String answer_2_3 = (String)session.getAttribute("dataset1_answer_2_3");
//        result.setAnswerD2Q3(answer_2_3);
//        int reaction_2_3 = (Integer)session.getAttribute("dataset1_reaction_2_3");
//        result.setAnswerD2R3(reaction_2_3);
//        String answer_3_1 = (String)session.getAttribute("dataset1_answer_3_1");
//        result.setAnswerD3Q1(answer_3_1);
//        int reaction_3_1 = (Integer)session.getAttribute("dataset1_reaction_3_1");
//        result.setAnswerD3R1(reaction_3_1);
//        String answer_3_2 = (String)session.getAttribute("dataset1_answer_3_2");
//        result.setAnswerD3Q2(answer_3_2);
//        int reaction_3_2 = (Integer)session.getAttribute("dataset1_reaction_3_2");
//        result.setAnswerD3R2(reaction_3_2);
//        String answer_3_3 = (String)session.getAttribute("dataset1_answer_3_3");
//        result.setAnswerD3Q3(answer_3_3);
//        int reaction_3_3 = (Integer)session.getAttribute("dataset1_reaction_3_3");
//        result.setAnswerD3R3(reaction_3_3);
//        String answer_4_1 = (String)session.getAttribute("dataset1_answer_4_1");
//        result.setAnswerD4Q1(answer_4_1);
//        int reaction_4_1 = (Integer)session.getAttribute("dataset1_reaction_4_1");
//        result.setAnswerD4R1(reaction_4_1);
//        String answer_4_2 = (String)session.getAttribute("dataset1_answer_4_2");
//        result.setAnswerD4Q2(answer_4_2);
//        int reaction_4_2 = (Integer)session.getAttribute("dataset1_reaction_4_2");
//        result.setAnswerD4R2(reaction_4_2);
//        String answer_4_3 = (String)session.getAttribute("dataset1_answer_4_3");
//        result.setAnswerD4Q3(answer_4_3);
//        int reaction_4_3 = (Integer)session.getAttribute("dataset1_reaction_4_3");
//        result.setAnswerD4R3(reaction_4_3);
//        String answer_5_1 = (String)session.getAttribute("dataset1_answer_5_1");
//        result.setAnswerD5Q1(answer_5_1);
//        int reaction_5_1 = (Integer)session.getAttribute("dataset1_reaction_5_1");
//        result.setAnswerD5R1(reaction_5_1);
//        String answer_5_2 = (String)session.getAttribute("dataset1_answer_5_2");
//        result.setAnswerD5Q2(answer_5_2);
//        int reaction_5_2 = (Integer)session.getAttribute("dataset1_reaction_5_2");
//        result.setAnswerD5R2(reaction_5_2);
//        result.setAnswerD5Q3(answer);
//        result.setAnswerD5R3(reactionTime);
//        this.trainingService.saveDataset1Result(result);
        return "redirect:/data2_demo_1";
    }

    @RequestMapping({"/to_data2_demo_2/{a}/{t}"})
    public String indexToData2Demo2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
//        session.setAttribute("dataset2_answer_1_3", answer);
//        session.setAttribute("dataset2_reaction_1_3", reactionTime);
        session.setAttribute("dataset1_answer_4_3", answer);
        session.setAttribute("dataset1_reaction_4_3", reactionTime);
        return "redirect:/data2_demo_2";
    }

    @RequestMapping({"/to_data2_demo_3/{a}/{t}"})
    public String indexToData2Demo3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_2_3", answer);
        session.setAttribute("dataset2_reaction_2_3", reactionTime);
        return "redirect:/data2_demo_3";
    }

    @RequestMapping({"/to_data2_demo_4/{a}/{t}"})
    public String indexToData2Demo4(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_1_3", answer);
        session.setAttribute("dataset2_reaction_1_3", reactionTime);
        return "redirect:/data2_demo_4";
    }

    @RequestMapping({"/to_data2_demo_5/{a}/{t}"})
    public String indexToData2Demo5(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        //添加改动之后的 result 的结果

        Result1 result = new Result1();
        result.setUserId((String)session.getAttribute("userId"));
        String answer_1_1 = (String)session.getAttribute("dataset1_answer_4_1");
        result.setAnswerD1Q1(answer_1_1);
        int reaction_1_1 = (Integer)session.getAttribute("dataset1_reaction_4_1");
        result.setAnswerD1R1(reaction_1_1);
        String answer_1_2 = (String)session.getAttribute("dataset1_answer_4_2");
        result.setAnswerD1Q2(answer_1_2);
        int reaction_1_2 = (Integer)session.getAttribute("dataset1_reaction_4_2");
        result.setAnswerD1R2(reaction_1_2);
        String answer_1_3 = (String)session.getAttribute("dataset1_answer_4_3");
        result.setAnswerD1Q3(answer_1_3);
        int reaction_1_3 = (Integer)session.getAttribute("dataset1_reaction_4_3");
        result.setAnswerD1R3(reaction_1_3);
        String answer_2_1 = (String)session.getAttribute("dataset2_answer_2_1");
        result.setAnswerD2Q1(answer_2_1);
        int reaction_2_1 = (Integer)session.getAttribute("dataset2_reaction_2_1");
        result.setAnswerD2R1(reaction_2_1);
        String answer_2_2 = (String)session.getAttribute("dataset2_answer_2_2");
        result.setAnswerD2Q2(answer_2_2);
        int reaction_2_2 = (Integer)session.getAttribute("dataset2_reaction_2_2");
        result.setAnswerD2R2(reaction_2_2);
        String answer_2_3 = (String)session.getAttribute("dataset2_answer_2_3");
        result.setAnswerD2Q3(answer_2_3);
        int reaction_2_3 = (Integer)session.getAttribute("dataset2_reaction_2_3");
        result.setAnswerD2R3(reaction_2_3);
        String answer_3_1 = (String)session.getAttribute("dataset2_answer_3_1");
        result.setAnswerD3Q1(answer_3_1);
        int reaction_3_1 = (Integer)session.getAttribute("dataset2_reaction_3_1");
        result.setAnswerD3R1(reaction_3_1);
        String answer_3_2 = (String)session.getAttribute("dataset2_answer_3_2");
        result.setAnswerD3Q2(answer_3_2);
        int reaction_3_2 = (Integer)session.getAttribute("dataset2_reaction_3_2");
        result.setAnswerD3R2(reaction_3_2);
        String answer_3_3 = (String)session.getAttribute("dataset2_answer_3_3");
        result.setAnswerD3Q3(answer_3_3);
        int reaction_3_3 = (Integer)session.getAttribute("dataset2_reaction_3_3");
        result.setAnswerD3R3(reaction_3_3);
        String answer_4_1 = (String)session.getAttribute("dataset1_answer_1_1");
        result.setAnswerD4Q1(answer_4_1);
        int reaction_4_1 = (Integer)session.getAttribute("dataset1_reaction_1_1");
        result.setAnswerD4R1(reaction_4_1);
        String answer_4_2 = (String)session.getAttribute("dataset1_answer_1_2");
        result.setAnswerD4Q2(answer_4_2);
        int reaction_4_2 = (Integer)session.getAttribute("dataset1_reaction_1_2");
        result.setAnswerD4R2(reaction_4_2);
        String answer_4_3 = (String)session.getAttribute("dataset1_answer_1_3");
        result.setAnswerD4Q3(answer_4_3);
        int reaction_4_3 = (Integer)session.getAttribute("dataset1_reaction_1_3");
        result.setAnswerD4R3(reaction_4_3);
        String answer_5_1 = (String)session.getAttribute("dataset1_answer_2_1");
        result.setAnswerD5Q1(answer_5_1);
        int reaction_5_1 = (Integer)session.getAttribute("dataset1_reaction_2_1");
        result.setAnswerD5R1(reaction_5_1);
        String answer_5_2 = (String)session.getAttribute("dataset1_answer_2_2");
        result.setAnswerD5Q2(answer_5_2);
        int reaction_5_2 = (Integer)session.getAttribute("dataset1_reaction_2_2");
        result.setAnswerD5R2(reaction_5_2);

        result.setAnswerD5Q3(answer);
        result.setAnswerD5R3(reactionTime);
        this.trainingService.saveDataset1Result(result);

        return "redirect:/data2_demo_5";
    }

    @RequestMapping({"/to_dataset2_introduction_1/{a}/{t}"})
    public String indexToData2Introduction_1(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset2_introduction_1";
    }

    @RequestMapping({"/to_dataset2_introduction_2/{a}/{t}"})
    public String indexToData2Intruduction_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset2_introduction_2";
    }

    @RequestMapping({"/to_dataset2_introduction_3/{a}/{t}"})
    public String indexToData2Intruduction_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset2_introduction_3";
    }

    @RequestMapping({"/to_dataset2_introduction_4/{a}/{t}"})
    public String indexToData2Intruduction_4(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset2_introduction_4";
    }

    @RequestMapping({"/to_dataset2_introduction_5/{a}/{t}"})
    public String indexToData2Intruduction_5(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset2_introduction_5";
    }

    @RequestMapping({"/to_dataset2_question_1_1"})
    public String indexToData2Question_1_1() {
        return "dataset2_question_1_1";
    }

    @RequestMapping({"/to_dataset2_question_1_2/{a}/{t}"})
    public String indexToData2Question_1_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_1_1", answer);
        session.setAttribute("dataset2_reaction_1_1", reactionTime);
        return "redirect:/dataset2_question_1_2";
    }

    @RequestMapping({"/to_dataset2_question_1_3/{a}/{t}"})
    public String indexToData2Question_1_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_1_2", answer);
        session.setAttribute("dataset2_reaction_1_2", reactionTime);
        return "redirect:/dataset2_question_1_3";
    }

    @RequestMapping({"/to_dataset2_question_2_1"})
    public String indexToData2Question_2_1() {
        return "dataset2_question_2_1";
    }

    @RequestMapping({"/to_dataset2_question_2_2/{a}/{t}"})
    public String indexToData2Question_2_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_2_1", answer);
        session.setAttribute("dataset2_reaction_2_1", reactionTime);
        return "redirect:/dataset2_question_2_2";
    }

    @RequestMapping({"/to_dataset2_question_2_3/{a}/{t}"})
    public String indexToData2Question_2_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_2_2", answer);
        session.setAttribute("dataset2_reaction_2_2", reactionTime);
        return "redirect:/dataset2_question_2_3";
    }

    @RequestMapping({"/to_dataset2_question_3_1"})
    public String indexToData2Question_3_1() {
        return "dataset2_question_3_1";
    }

    @RequestMapping({"/to_dataset2_question_3_2/{a}/{t}"})
    public String indexToData2Question_3_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_3_1", answer);
        session.setAttribute("dataset2_reaction_3_1", reactionTime);
        return "redirect:/dataset2_question_3_2";
    }

    @RequestMapping({"/to_dataset2_question_3_3/{a}/{t}"})
    public String indexToData2Question_3_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_3_2", answer);
        session.setAttribute("dataset2_reaction_3_2", reactionTime);
        return "redirect:/dataset2_question_3_3";
    }

    @RequestMapping({"/to_dataset2_question_4_1"})
    public String indexToData2Question_4_1() {
        return "dataset2_question_4_1";
    }

    @RequestMapping({"/to_dataset2_question_4_2/{a}/{t}"})
    public String indexToData2Question_4_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_4_1", answer);
        session.setAttribute("dataset2_reaction_4_1", reactionTime);
        return "redirect:/dataset2_question_4_2";
    }

    @RequestMapping({"/to_dataset2_question_4_3/{a}/{t}"})
    public String indexToData2Question_4_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_4_2", answer);
        session.setAttribute("dataset2_reaction_4_2", reactionTime);
        return "redirect:/dataset2_question_4_3";
    }

    @RequestMapping({"/to_dataset2_question_5_1"})
    public String indexToData2Question_5_1() {
        return "dataset2_question_5_1";
    }

    @RequestMapping({"/to_dataset2_question_5_2/{a}/{t}"})
    public String indexToData2Question_5_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_5_1", answer);
        session.setAttribute("dataset2_reaction_5_1", reactionTime);
        return "redirect:/dataset2_question_5_2";
    }

    @RequestMapping({"/to_dataset2_question_5_3/{a}/{t}"})
    public String indexToData2Question_5_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_5_2", answer);
        session.setAttribute("dataset2_reaction_5_2", reactionTime);
        return "redirect:/dataset2_question_5_3";
    }
}
