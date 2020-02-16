package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.Facedata;
import com.atguigu.springboot.bean.FacedataExample;
import com.atguigu.springboot.bean.FacedataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FacedataMapper {
    long countByExample(FacedataExample example);

    int deleteByExample(FacedataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FacedataWithBLOBs record);

    int insertSelective(FacedataWithBLOBs record);

    List<FacedataWithBLOBs> selectByExampleWithBLOBs(FacedataExample example);

    List<Facedata> selectByExample(FacedataExample example);

    FacedataWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FacedataWithBLOBs record, @Param("example") FacedataExample example);

    int updateByExampleWithBLOBs(@Param("record") FacedataWithBLOBs record, @Param("example") FacedataExample example);

    int updateByExample(@Param("record") Facedata record, @Param("example") FacedataExample example);

    int updateByPrimaryKeySelective(FacedataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FacedataWithBLOBs record);

    int updateByPrimaryKey(Facedata record);
}