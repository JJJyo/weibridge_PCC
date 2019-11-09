package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.Records;
import com.atguigu.springboot.bean.RecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordsMapper {
    long countByExample(RecordsExample example);

    int deleteByExample(RecordsExample example);

    int insert(Records record);

    int insertSelective(Records record);

    List<Records> selectByExampleWithBLOBs(RecordsExample example);

    List<Records> selectByExample(RecordsExample example);

    int updateByExampleSelective(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByExampleWithBLOBs(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByExample(@Param("record") Records record, @Param("example") RecordsExample example);
}