package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.Carnumber;
import com.atguigu.springboot.bean.CarnumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarnumberMapper {
    long countByExample(CarnumberExample example);

    int deleteByExample(CarnumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carnumber record);

    int insertSelective(Carnumber record);

    List<Carnumber> selectByExample(CarnumberExample example);

    Carnumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carnumber record, @Param("example") CarnumberExample example);

    int updateByExample(@Param("record") Carnumber record, @Param("example") CarnumberExample example);

    int updateByPrimaryKeySelective(Carnumber record);

    int updateByPrimaryKey(Carnumber record);

    List<Carnumber> selectByNumber(String number);
}