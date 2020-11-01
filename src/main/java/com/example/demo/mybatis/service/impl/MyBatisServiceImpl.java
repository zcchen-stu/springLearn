package com.example.demo.mybatis.service.impl;

import com.example.demo.mybatis.dao.TestMapper;
import com.example.demo.mybatis.service.MyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBatisServiceImpl implements MyBatisService {

    @Autowired
    TestMapper mapper;

    @Override
    public String selectById(String id) {
        return mapper.selectById(id);
    }
}
