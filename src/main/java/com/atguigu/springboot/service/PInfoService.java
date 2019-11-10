package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.PInfo;
import com.atguigu.springboot.dao.PInfoMapper;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PInfoService {


    @Autowired
    PInfoMapper pInfoMapper;
    /*
    查询全部
     */
    public List<PInfo> getAll(){

//        List<Pinfo>
        return pInfoMapper.selectByExample(null);
    }

    public PInfo getById(Integer id){

        return pInfoMapper.selectByPrimaryKey(id);
    }

}
