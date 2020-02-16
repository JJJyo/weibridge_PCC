package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.Carnumber;
import com.atguigu.springboot.bean.PInfo;
import com.atguigu.springboot.dao.CarnumberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarNumberService {


    @Autowired
    CarnumberMapper carnumberMapper;
    public List<Carnumber> getByNumber(String number) {

        return carnumberMapper.selectByNumber(number);
    }
}
