package com.example.demo.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    public String selectById(String id);
}
