package com.sq.project.controller;


import com.sq.project.bean.Result;
import com.sq.project.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;


@Controller
public class TrainingDemoController {

    @Autowired
    TrainingService trainingService;

    @RequestMapping("/to_training_demo_1")
    public String indexToDemo1(){
        return "training_demo_1";
    }

    @RequestMapping("/to_training_question_1_1")
    public String indexToTrainingQuestion_1_1(){
        return "training_question_1_1";
    }

    @RequestMapping("/to_training_question_1_2/{a}/{t}")
    public String indexToTrainingQuestion_1_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime)
   {
        session.setAttribute("trainingdemo_answer_1_1",answer);
        session.setAttribute("trainingdemo_reaction_1_1",reactionTime);
//        response.sendRedirect("training_question_1_2");
        return "redirect:/training_question_1_2";
    }

    @RequestMapping("/to_training_question_1_3/{a}/{t}")
    public String indexToTrainingQuestion_1_3(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_1_2",answer);
        session.setAttribute("trainingdemo_reaction_1_2",reactionTime);
        return "redirect:/training_question_1_3";
    }

    @RequestMapping("/to_submit_page/{a}/{t}")
    public String indexToTrainingSubmit(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_1_3",answer);
        session.setAttribute("trainingdemo_reaction_1_3",reactionTime);
        return "redirect:/training_demo_submit";
    }

    @RequestMapping("/to_thanks")
    public String indexToThanks(HttpSession session){
        Result result = new Result();
        result.setUserId((String)session.getAttribute("userId"));
        String answer_1_1 = (String)session.getAttribute("trainingdemo_answer_1_1");
        result.setAnswerD1Q1(answer_1_1);
        int reaction_1_1 = (int)session.getAttribute("trainingdemo_reaction_1_1");
        result.setAnswerD1R1(reaction_1_1);
        String answer_1_2 = (String)session.getAttribute("trainingdemo_answer_1_2");
        result.setAnswerD1Q2(answer_1_2);
        int reaction_1_2 = (int)session.getAttribute("trainingdemo_reaction_1_2");
        result.setAnswerD1R2(reaction_1_2);
        String answer_1_3 = (String)session.getAttribute("trainingdemo_answer_1_3");
        result.setAnswerD1Q3(answer_1_3);
        int reaction_1_3 = (int)session.getAttribute("trainingdemo_reaction_1_3");
        result.setAnswerD1R3(reaction_1_3);
        trainingService.saveTrainingResult(result);
        return "thankspage";
    }



}
