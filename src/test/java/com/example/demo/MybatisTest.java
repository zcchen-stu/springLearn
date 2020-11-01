package com.example.demo;

import com.example.demo.mybatis.dao.TestMapper;
import com.example.demo.mybatis.service.impl.MyBatisServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class MybatisTest {
    @Autowired
    MyBatisServiceImpl myBatisService;

    @Test
    public void test() {
        System.out.println(myBatisService.selectById("1"));
    }
}
