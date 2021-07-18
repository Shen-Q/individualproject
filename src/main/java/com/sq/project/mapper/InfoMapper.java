package com.sq.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sq.project.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;


@Mapper
public interface InfoMapper extends BaseMapper<User>{

    @Insert("insert into user_infos(user_id, user_is_tested,user_device, user_gender, user_age, user_education," +
            "user_work,user_childhood,user_from)values("
            + "#{userId}, #{userIsTested},#{userDevice}, #{userGender}, #{userAge}, #{userEducation},#{userWork},#{userChildhood}, #{userFrom})")
    public void insertInfos(User user);
//
//    public void insertResults();
}
