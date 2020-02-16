package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.Records;
import com.atguigu.springboot.bean.RecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordsMapper {
    long countByExample(RecordsExample example);

    int deleteByExample(RecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Records record);

    int insertSelective(Records record);

    List<Records> selectByExampleWithBLOBs(RecordsExample example);

    List<Records> selectByExample(RecordsExample example);

    Records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByExampleWithBLOBs(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByExample(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByPrimaryKeySelective(Records record);

    int updateByPrimaryKeyWithBLOBs(Records record);

    int updateByPrimaryKey(Records record);
}