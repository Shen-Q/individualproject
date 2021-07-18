package com.sq.project.configurer;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/training_question_1_2").setViewName("training_question_1_2");
        registry.addViewController("/training_question_1_3").setViewName("training_question_1_3");
        registry.addViewController("/training_demo_submit").setViewName("training_demo_submit");
    }
}
