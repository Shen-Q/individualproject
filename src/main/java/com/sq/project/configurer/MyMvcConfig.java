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
        registry.addViewController("/training_question_2_2").setViewName("training_question_2_2");
        registry.addViewController("/training_question_2_3").setViewName("training_question_2_3");
        registry.addViewController("/training_question_3_2").setViewName("training_question_3_2");
        registry.addViewController("/training_question_3_3").setViewName("training_question_3_3");
        registry.addViewController("/training_question_4_2").setViewName("training_question_4_2");
        registry.addViewController("/training_question_4_3").setViewName("training_question_4_3");
        registry.addViewController("/training_question_5_2").setViewName("training_question_5_2");
        registry.addViewController("/training_question_5_3").setViewName("training_question_5_3");
        registry.addViewController("/training_introduction_2").setViewName("training_introduction_2");
        registry.addViewController("/training_introduction_3").setViewName("training_introduction_3");
        registry.addViewController("/training_introduction_4").setViewName("training_introduction_4");
        registry.addViewController("/training_introduction_5").setViewName("training_introduction_5");

        registry.addViewController("/dataset1_question_1_2").setViewName("dataset1_question_1_2");
        registry.addViewController("/dataset1_question_1_3").setViewName("dataset1_question_1_3");
        registry.addViewController("/dataset1_question_2_2").setViewName("dataset1_question_2_2");
        registry.addViewController("/dataset1_question_2_3").setViewName("dataset1_question_2_3");
        registry.addViewController("/dataset1_question_3_2").setViewName("dataset1_question_3_2");
        registry.addViewController("/dataset1_question_3_3").setViewName("dataset1_question_3_3");
        registry.addViewController("/dataset1_question_4_2").setViewName("dataset1_question_4_2");
        registry.addViewController("/dataset1_question_4_3").setViewName("dataset1_question_4_3");
        registry.addViewController("/dataset1_question_5_2").setViewName("dataset1_question_5_2");
        registry.addViewController("/dataset1_question_5_3").setViewName("dataset1_question_5_3");
        registry.addViewController("/dataset1_introduction_1").setViewName("dataset1_introduction_1");
        registry.addViewController("/dataset1_introduction_2").setViewName("dataset1_introduction_2");
        registry.addViewController("/dataset1_introduction_3").setViewName("dataset1_introduction_3");
        registry.addViewController("/dataset1_introduction_4").setViewName("dataset1_introduction_4");
        registry.addViewController("/dataset1_introduction_5").setViewName("dataset1_introduction_5");

        registry.addViewController("/dataset2_introduction_1").setViewName("dataset2_introduction_1");

        registry.addViewController("/dataset2_question_1_2").setViewName("dataset2_question_1_2");
        registry.addViewController("/dataset2_question_1_3").setViewName("dataset2_question_1_3");
        registry.addViewController("/dataset2_question_2_2").setViewName("dataset2_question_2_2");
        registry.addViewController("/dataset2_question_2_3").setViewName("dataset2_question_2_3");
        registry.addViewController("/dataset2_question_3_2").setViewName("dataset2_question_3_2");
        registry.addViewController("/dataset2_question_3_3").setViewName("dataset2_question_3_3");
        registry.addViewController("/dataset2_question_4_2").setViewName("dataset2_question_4_2");
        registry.addViewController("/dataset2_question_4_3").setViewName("dataset2_question_4_3");
        registry.addViewController("/dataset2_question_5_2").setViewName("dataset2_question_5_2");
        registry.addViewController("/dataset2_question_5_3").setViewName("dataset2_question_5_3");

        registry.addViewController("/dataset2_introduction_2").setViewName("dataset2_introduction_2");
        registry.addViewController("/dataset2_introduction_3").setViewName("dataset2_introduction_3");
        registry.addViewController("/dataset2_introduction_4").setViewName("dataset2_introduction_4");
        registry.addViewController("/dataset2_introduction_5").setViewName("dataset2_introduction_5");

        registry.addViewController("/training_demo_submit").setViewName("training_demo_submit");
    }
}
