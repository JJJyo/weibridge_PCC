package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.PInfo;
import com.atguigu.springboot.bean.PInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PInfoMapper {
    long countByExample(PInfoExample example);

    int deleteByExample(PInfoExample example);

    int insert(PInfo record);

    int insertSelective(PInfo record);

    List<PInfo> selectByExampleWithBLOBs(PInfoExample example);

    List<PInfo> selectByExample(PInfoExample example);

    int updateByExampleSelective(@Param("record") PInfo record, @Param("example") PInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PInfo record, @Param("example") PInfoExample example);

    int updateByExample(@Param("record") PInfo record, @Param("example") PInfoExample example);
}