package com.sq.project.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sq.project.bean.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.sq.project.mapper")
class InfoMapperTest {

    @Autowired
    InfoMapper infoMapper;

    @Test
    public void test(){
        User user = new User();
        user.setUserId("123456");
        user.setUserIsTested("No");
        user.setUserDevice("PC");
//        infoMapper.insertInfos(user);
        infoMapper.insert(user);
    }


}