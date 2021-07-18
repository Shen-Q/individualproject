package com.sq.project.service;

import com.sq.project.bean.Result;
import com.sq.project.mapper.InfoMapper;
import com.sq.project.mapper.TrainingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    @Autowired
    TrainingMapper trainingMapper;

    public void saveTrainingResult(Result result){
        trainingMapper.insert(result);
    }
}
