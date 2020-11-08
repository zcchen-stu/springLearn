package com.example.demo;

import com.example.demo.mybatis.dao.TestEntity;
import com.example.demo.mybatis.dao.TestMapper;
import com.example.demo.mybatis.service.impl.MyBatisServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class MybatisTest {
    @Autowired
    MyBatisServiceImpl myBatisService;

//    @Test
    public void test() {
        System.out.println(myBatisService.selectById("1"));
    }

    @Test
    public void test2() {
        for(int i = 0; i < 50; i ++ ) {
            int cur = i % 10;
            //1900 + year
            Date date = new Date(120, 11, cur);
            TestEntity testEntity = new TestEntity("chen" + i, date);
            myBatisService.add(testEntity);
            System.out.println(testEntity.getId());
        }
    }
}
