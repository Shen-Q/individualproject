package com.sq.project.controller;


import com.sq.project.bean.User;
import com.sq.project.service.InfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    InfoService infoService;

    @RequestMapping("/")
    public String index(){
        return "index2";
    }

    @RequestMapping("/home")
    public String indexToHome(){
        return "index2";
    }


    @RequestMapping("/to_info1")
    public String indexToInfo1(){
        return "info1";
    }

    @RequestMapping("/to_info2")
    public String indexToInfo2(){
        return "info2";
    }


    @RequestMapping("/to_ques2")
    public String indexToQues2(){
        return "training_question_2_2";
    }


    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session, User user){
        infoService.login(request,response,session,user);
        return "training";
    }

}
