package com.sq.project.service;

import com.sq.project.bean.Result;
import com.sq.project.bean.Result1;
import com.sq.project.bean.Result2;
import com.sq.project.mapper.Dataset1Mapper;
import com.sq.project.mapper.Dataset2Mapper;
import com.sq.project.mapper.TrainingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    @Autowired
    TrainingMapper trainingMapper;

    @Autowired
    Dataset1Mapper dataset1Mapper;

    @Autowired
    Dataset2Mapper dataset2Mapper;

    public void saveTrainingResult(Result result){
        trainingMapper.insert(result);
    }

    public void saveDataset1Result(Result1 result){
        dataset1Mapper.insert(result);
    }

    public void saveDataset2Result(Result2 result){
        dataset2Mapper.insert(result);
    }
}
