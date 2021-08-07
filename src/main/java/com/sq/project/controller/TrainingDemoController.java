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

    @RequestMapping("/to_training_demo_2")
    public String indexToDemo2(){
        return "training_demo_2";
    }

    @RequestMapping("/to_training_demo_3")
    public String indexToDemo3(){
        return "training_demo_3";
    }

    @RequestMapping("/to_training_demo_4")
    public String indexToDemo4(){
        return "training_demo_4";
    }

    @RequestMapping("/to_training_demo_5")
    public String indexToDemo5(){
        return "training_demo_5";
    }

    @RequestMapping("/to_training_introduction_1")
    public String indexToIntruduction_1(){
        return "training_introduction_1";
    }

    @RequestMapping("/to_training_introduction_2/{a}/{t}")
    public String indexToIntruduction_2(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_1_3",answer);
        session.setAttribute("trainingdemo_reaction_1_3",reactionTime);
        return "redirect:/training_introduction_2";
    }

    @RequestMapping("/to_training_introduction_3/{a}/{t}")
    public String indexToIntruduction_3(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_2_3",answer);
        session.setAttribute("trainingdemo_reaction_2_3",reactionTime);
        return "redirect:/training_introduction_3";
    }

    @RequestMapping("/to_training_introduction_4/{a}/{t}")
    public String indexToIntruduction_4(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_3_3",answer);
        session.setAttribute("trainingdemo_reaction_3_3",reactionTime);
        return "redirect:/training_introduction_4";
    }
    @RequestMapping("/to_training_introduction_5/{a}/{t}")
    public String indexToIntruduction_5(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_4_3",answer);
        session.setAttribute("trainingdemo_reaction_4_3",reactionTime);
        return "redirect:/training_introduction_5";
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

    @RequestMapping("/to_training_question_2_1")
    public String indexToTrainingQuestion_2_1(){
        return "training_question_2_1";
    }

    @RequestMapping("/to_training_question_2_2/{a}/{t}")
    public String indexToTrainingQuestion_2_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime)
    {
        session.setAttribute("trainingdemo_answer_2_1",answer);
        session.setAttribute("trainingdemo_reaction_2_1",reactionTime);
//        response.sendRedirect("training_question_1_2");
        return "redirect:/training_question_2_2";
    }

        @RequestMapping("/to_training_question_2_3/{a}/{t}")
    public String indexToTrainingQuestion_2_3(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_2_2",answer);
        session.setAttribute("trainingdemo_reaction_2_2",reactionTime);
        return "redirect:/training_question_2_3";
    }
    @RequestMapping("/to_training_question_3_1")
    public String indexToTrainingQuestion_3_1(){
        return "training_question_3_1";
    }

    @RequestMapping("/to_training_question_3_2/{a}/{t}")
    public String indexToTrainingQuestion_3_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime)
    {
        session.setAttribute("trainingdemo_answer_3_1",answer);
        session.setAttribute("trainingdemo_reaction_3_1",reactionTime);
        return "redirect:/training_question_3_2";
    }

    @RequestMapping("/to_training_question_3_3/{a}/{t}")
    public String indexToTrainingQuestion_3_3(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_3_2",answer);
        session.setAttribute("trainingdemo_reaction_3_2",reactionTime);
        return "redirect:/training_question_3_3";
    }
    @RequestMapping("/to_training_question_4_1")
    public String indexToTrainingQuestion_4_1(){
        return "training_question_4_1";
    }

    @RequestMapping("/to_training_question_4_2/{a}/{t}")
    public String indexToTrainingQuestion_4_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime)
    {
        session.setAttribute("trainingdemo_answer_4_1",answer);
        session.setAttribute("trainingdemo_reaction_4_1",reactionTime);
        return "redirect:/training_question_4_2";
    }

    @RequestMapping("/to_training_question_4_3/{a}/{t}")
    public String indexToTrainingQuestion_4_3(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
        session.setAttribute("trainingdemo_answer_4_2",answer);
        session.setAttribute("trainingdemo_reaction_4_2",reactionTime);
        return "redirect:/training_question_4_3";
    }

    @RequestMapping("/to_training_question_5_1")
    public String indexToTrainingQuestion_5_1(){
        return "training_question_5_1";
    }

    @RequestMapping("/to_training_question_5_2/{a}/{t}")
    public String indexToTrainingQuestion_5_2(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime)
    {
        session.setAttribute("trainingdemo_answer_5_1",answer);
        session.setAttribute("trainingdemo_reaction_5_1",reactionTime);
        return "redirect:/training_question_5_2";
    }

    @RequestMapping("/to_training_question_5_3/{a}/{t}")
    public String indexToTrainingQuestion_5_3(HttpSession session, @PathVariable("a") String answer, @PathVariable("t") int reactionTime)
    {
        session.setAttribute("trainingdemo_answer_5_2",answer);
        session.setAttribute("trainingdemo_reaction_5_2",reactionTime);
        return "redirect:/training_question_5_3";
    }



//    @RequestMapping("/to_submit_page/{a}/{t}")
//    public String indexToTrainingSubmit(HttpSession session,@PathVariable("a") String answer, @PathVariable("t") int reactionTime){
//        session.setAttribute("trainingdemo_answer_1_3",answer);
//        session.setAttribute("trainingdemo_reaction_1_3",reactionTime);
//        return "redirect:/training_demo_submit";
//    }




}
