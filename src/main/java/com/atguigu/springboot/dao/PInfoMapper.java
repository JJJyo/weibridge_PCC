package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.PInfo;
import com.atguigu.springboot.bean.PInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PInfoMapper {
    long countByExample(PInfoExample example);

    int deleteByExample(PInfoExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(PInfo record);

    int insertSelective(PInfo record);

    List<PInfo> selectByExampleWithBLOBs(PInfoExample example);

    List<PInfo> selectByExample(PInfoExample example);

    byte[] findPicture(Integer pId);

    PInfo selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") PInfo record, @Param("example") PInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PInfo record, @Param("example") PInfoExample example);

    int updateByExample(@Param("record") PInfo record, @Param("example") PInfoExample example);

    int updateByPrimaryKeySelective(PInfo record);

    int updateByPrimaryKeyWithBLOBs(PInfo record);

    int updateByPrimaryKey(PInfo record);
}