package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.Location;
import com.atguigu.springboot.bean.LocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocationMapper {
    long countByExample(LocationExample example);

    int deleteByExample(LocationExample example);

    int insert(Location record);

    int insertSelective(Location record);

    List<Location> selectByExample(LocationExample example);

    int updateByExampleSelective(@Param("record") Location record, @Param("example") LocationExample example);

    int updateByExample(@Param("record") Location record, @Param("example") LocationExample example);
}