package com.onlineRegister.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.onlineRegister.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
    
    @Select("SELECT * FROM news WHERE is_show = '0'")
    List<News> selectAll();
}