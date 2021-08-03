package com.sq.project.controller;

import com.sq.project.bean.Result;
import com.sq.project.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DataOneController {

    @Autowired
    TrainingService trainingService;

    @RequestMapping({"/to_studying/{a}/{t}"})
    public String indexToStudying(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        Result result = new Result();
        result.setUserId((String)session.getAttribute("userId"));
        String answer_1_1 = (String)session.getAttribute("trainingdemo_answer_1_1");
        result.setAnswerD1Q1(answer_1_1);
        int reaction_1_1 = (Integer)session.getAttribute("trainingdemo_reaction_1_1");
        result.setAnswerD1R1(reaction_1_1);
        String answer_1_2 = (String)session.getAttribute("trainingdemo_answer_1_2");
        result.setAnswerD1Q2(answer_1_2);
        int reaction_1_2 = (Integer)session.getAttribute("trainingdemo_reaction_1_2");
        result.setAnswerD1R2(reaction_1_2);
        String answer_1_3 = (String)session.getAttribute("trainingdemo_answer_1_3");
        result.setAnswerD1Q3(answer_1_3);
        int reaction_1_3 = (Integer)session.getAttribute("trainingdemo_reaction_1_3");
        result.setAnswerD1R3(reaction_1_3);
        String answer_2_1 = (String)session.getAttribute("trainingdemo_answer_2_1");
        result.setAnswerD2Q1(answer_2_1);
        int reaction_2_1 = (Integer)session.getAttribute("trainingdemo_reaction_2_1");
        result.setAnswerD2R1(reaction_2_1);
        String answer_2_2 = (String)session.getAttribute("trainingdemo_answer_2_2");
        result.setAnswerD2Q2(answer_2_2);
        int reaction_2_2 = (Integer)session.getAttribute("trainingdemo_reaction_2_2");
        result.setAnswerD2R2(reaction_2_2);
        String answer_2_3 = (String)session.getAttribute("trainingdemo_answer_2_3");
        result.setAnswerD2Q3(answer_2_3);
        int reaction_2_3 = (Integer)session.getAttribute("trainingdemo_reaction_2_3");
        result.setAnswerD2R3(reaction_2_3);
        String answer_3_1 = (String)session.getAttribute("trainingdemo_answer_3_1");
        result.setAnswerD3Q1(answer_3_1);
        int reaction_3_1 = (Integer)session.getAttribute("trainingdemo_reaction_3_1");
        result.setAnswerD3R1(reaction_3_1);
        String answer_3_2 = (String)session.getAttribute("trainingdemo_answer_3_2");
        result.setAnswerD3Q2(answer_3_2);
        int reaction_3_2 = (Integer)session.getAttribute("trainingdemo_reaction_3_2");
        result.setAnswerD3R2(reaction_3_2);
        String answer_3_3 = (String)session.getAttribute("trainingdemo_answer_3_3");
        result.setAnswerD3Q3(answer_3_3);
        int reaction_3_3 = (Integer)session.getAttribute("trainingdemo_reaction_3_3");
        result.setAnswerD3R3(reaction_3_3);
        String answer_4_1 = (String)session.getAttribute("trainingdemo_answer_4_1");
        result.setAnswerD4Q1(answer_4_1);
        int reaction_4_1 = (Integer)session.getAttribute("trainingdemo_reaction_4_1");
        result.setAnswerD4R1(reaction_4_1);
        String answer_4_2 = (String)session.getAttribute("trainingdemo_answer_4_2");
        result.setAnswerD4Q2(answer_4_2);
        int reaction_4_2 = (Integer)session.getAttribute("trainingdemo_reaction_4_2");
        result.setAnswerD4R2(reaction_4_2);
        String answer_4_3 = (String)session.getAttribute("trainingdemo_answer_4_3");
        result.setAnswerD4Q3(answer_4_3);
        int reaction_4_3 = (Integer)session.getAttribute("trainingdemo_reaction_4_3");
        result.setAnswerD4R3(reaction_4_3);
        String answer_5_1 = (String)session.getAttribute("trainingdemo_answer_5_1");
        result.setAnswerD5Q1(answer_5_1);
        int reaction_5_1 = (Integer)session.getAttribute("trainingdemo_reaction_5_1");
        result.setAnswerD5R1(reaction_5_1);
        String answer_5_2 = (String)session.getAttribute("trainingdemo_answer_5_2");
        result.setAnswerD5Q2(answer_5_2);
        int reaction_5_2 = (Integer)session.getAttribute("trainingdemo_reaction_5_2");
        result.setAnswerD5R2(reaction_5_2);
        result.setAnswerD5Q3(answer);
        result.setAnswerD5R3(reactionTime);
        this.trainingService.saveTrainingResult(result);
        return "redirect:/studying";
    }

    @RequestMapping({"/to_data1_demo_1/{a}/{t}"})
    public String indexToData1Demo1(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_3_3", answer);
        session.setAttribute("dataset2_reaction_3_3", reactionTime);
        return "redirect:/data1_demo_1";
    }

    @RequestMapping({"/to_data1_demo_2/{a}/{t}"})
    public String indexToData1Demo2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_1_3", answer);
        session.setAttribute("dataset1_reaction_1_3", reactionTime);
        return "redirect:/data1_demo_2";
    }

    @RequestMapping({"/to_data1_demo_3/{a}/{t}"})
    public String indexToData1Demo3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_5_3", answer);
        session.setAttribute("dataset2_reaction_5_3", reactionTime);
        return "redirect:/data1_demo_3";
    }

    @RequestMapping({"/to_data1_demo_4"})
    public String indexToData1Demo4() {
        return "data1_demo_4";
    }

    @RequestMapping({"/to_data1_demo_5/{a}/{t}"})
    public String indexToData1Demo5(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset2_answer_4_3", answer);
        session.setAttribute("dataset2_reaction_4_3", reactionTime);
        return "redirect:/data1_demo_5";
    }

    @RequestMapping({"/to_dataset1_introduction_1/{a}/{t}"})
    public String indexToData1Intruduction_1(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset1_introduction_1";
    }

    @RequestMapping({"/to_dataset1_introduction_2/{a}/{t}"})
    public String indexToData1Intruduction_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset1_introduction_2";
    }

    @RequestMapping({"/to_dataset1_introduction_3/{a}/{t}"})
    public String indexToData1Intruduction_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset1_introduction_3";
    }

    @RequestMapping({"/to_dataset1_introduction_4/{a}/{t}"})
    public String indexToData1Intruduction_4(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset1_introduction_4";
    }

    @RequestMapping({"/to_dataset1_introduction_5/{a}/{t}"})
    public String indexToData1Intruduction_5(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        return "redirect:/dataset1_introduction_5";
    }

    @RequestMapping({"/to_dataset1_question_1_1"})
    public String indexToData1Question_1_1() {
        return "dataset1_question_1_1";
    }

    @RequestMapping({"/to_dataset1_question_1_2/{a}/{t}"})
    public String indexToData1Question_1_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_1_1", answer);
        session.setAttribute("dataset1_reaction_1_1", reactionTime);
        return "redirect:/dataset1_question_1_2";
    }

    @RequestMapping({"/to_dataset1_question_1_3/{a}/{t}"})
    public String indexToData1Question_1_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_1_2", answer);
        session.setAttribute("dataset1_reaction_1_2", reactionTime);
        return "redirect:/dataset1_question_1_3";
    }

    @RequestMapping({"/to_dataset1_question_2_1"})
    public String indexToData1Question_2_1() {
        return "dataset1_question_2_1";
    }

    @RequestMapping({"/to_dataset1_question_2_2/{a}/{t}"})
    public String indexToData1Question_2_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_2_1", answer);
        session.setAttribute("dataset1_reaction_2_1", reactionTime);
        return "redirect:/dataset1_question_2_2";
    }

    @RequestMapping({"/to_dataset1_question_2_3/{a}/{t}"})
    public String indexToData1Question_2_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_2_2", answer);
        session.setAttribute("dataset1_reaction_2_2", reactionTime);
        return "redirect:/dataset1_question_2_3";
    }

    @RequestMapping({"/to_dataset1_question_3_1"})
    public String indexToData1Question_3_1() {
        return "dataset1_question_3_1";
    }

    @RequestMapping({"/to_dataset1_question_3_2/{a}/{t}"})
    public String indexToData1Question_3_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_3_1", answer);
        session.setAttribute("dataset1_reaction_3_1", reactionTime);
        return "redirect:/dataset1_question_3_2";
    }

    @RequestMapping({"/to_dataset1_question_3_3/{a}/{t}"})
    public String indexToData1Question_3_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_3_2", answer);
        session.setAttribute("dataset1_reaction_3_2", reactionTime);
        return "redirect:/dataset1_question_3_3";
    }

    @RequestMapping({"/to_dataset1_question_4_1"})
    public String indexToData1Question_4_1() {
        return "dataset1_question_4_1";
    }

    @RequestMapping({"/to_dataset1_question_4_2/{a}/{t}"})
    public String indexToData1Question_4_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_4_1", answer);
        session.setAttribute("dataset1_reaction_4_1", reactionTime);
        return "redirect:/dataset1_question_4_2";
    }

    @RequestMapping({"/to_dataset1_question_4_3/{a}/{t}"})
    public String indexToData1Question_4_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_4_2", answer);
        session.setAttribute("dataset1_reaction_4_2", reactionTime);
        return "redirect:/dataset1_question_4_3";
    }

    @RequestMapping({"/to_dataset1_question_5_1"})
    public String indexToData1Question_5_1() {
        return "dataset1_question_5_1";
    }

    @RequestMapping({"/to_dataset1_question_5_2/{a}/{t}"})
    public String indexToData1Question_5_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_5_1", answer);
        session.setAttribute("dataset1_reaction_5_1", reactionTime);
        return "redirect:/dataset1_question_5_2";
    }

    @RequestMapping({"/to_dataset1_question_5_3/{a}/{t}"})
    public String indexToData1Question_5_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime) {
        session.setAttribute("dataset1_answer_5_2", answer);
        session.setAttribute("dataset1_reaction_5_2", reactionTime);
        return "redirect:/dataset1_question_5_3";
    }

}
