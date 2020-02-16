package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.Facedata;
import com.atguigu.springboot.dao.FacedataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacedataService {

    @Autowired
    FacedataMapper faceDataMapper;


    public List<Facedata> getAll(){

        return faceDataMapper.selectByExample(null);
    }

    public Facedata getById(Integer id) {

        return faceDataMapper.selectByPrimaryKey(id);
    }
}
