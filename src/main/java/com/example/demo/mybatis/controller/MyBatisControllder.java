package com.example.demo.mybatis.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatis")
public class MyBatisControllder {

    @RequestMapping("/select/{id}")
    public String select(@PathVariable("id") String id) {

        return null;
    }
}
