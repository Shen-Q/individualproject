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
        registry.addViewController("/training_demo_2").setViewName("training_demo_2");
        registry.addViewController("/training_demo_3").setViewName("training_demo_3");
        registry.addViewController("/training_demo_4").setViewName("training_demo_4");
        registry.addViewController("/training_demo_5").setViewName("training_demo_5");

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

        registry.addViewController("/studying").setViewName("studying");
        registry.addViewController("/data1_demo_1").setViewName("data1_demo_1");
        registry.addViewController("/data1_demo_2").setViewName("data1_demo_2");
        registry.addViewController("/data1_demo_3").setViewName("data1_demo_3");
        registry.addViewController("/data1_demo_4").setViewName("data1_demo_4");
        registry.addViewController("/data1_demo_5").setViewName("data1_demo_5");

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

        registry.addViewController("/data2_demo_1").setViewName("data2_demo_1");
        registry.addViewController("/data2_demo_2").setViewName("data2_demo_2");
        registry.addViewController("/data2_demo_3").setViewName("data2_demo_3");
        registry.addViewController("/data2_demo_4").setViewName("data2_demo_4");
        registry.addViewController("/data2_demo_5").setViewName("data2_demo_5");

        registry.addViewController("/training_demo_submit").setViewName("training_demo_submit");
    }
}
