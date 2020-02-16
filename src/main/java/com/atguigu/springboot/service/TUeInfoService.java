package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.PInfo;
import com.atguigu.springboot.bean.TUeInfo;
import com.atguigu.springboot.dao.TUeInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUeInfoService {

    @Autowired
    TUeInfoMapper tUeInfoMapper;

    public List<TUeInfo> getAll(){

        return tUeInfoMapper.selectByExample(null);
    }

    public TUeInfo getById(Long id){

        return tUeInfoMapper.selectByPrimaryKey(id);
    }

    public List<TUeInfo> getByNumber(String number) {

        return tUeInfoMapper.selectByNumber(number);
    }
}
