package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.TUeInfo;
import com.atguigu.springboot.bean.TUeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUeInfoMapper {
    long countByExample(TUeInfoExample example);

    int deleteByExample(TUeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUeInfo record);

    int insertSelective(TUeInfo record);

    List<TUeInfo> selectByExample(TUeInfoExample example);

    TUeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUeInfo record, @Param("example") TUeInfoExample example);

    int updateByExample(@Param("record") TUeInfo record, @Param("example") TUeInfoExample example);

    int updateByPrimaryKeySelective(TUeInfo record);

    int updateByPrimaryKey(TUeInfo record);

    List<TUeInfo> selectByNumber(String number);
}