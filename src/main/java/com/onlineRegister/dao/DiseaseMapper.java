package com.onlineRegister.dao;

import com.onlineRegister.model.Disease;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);
}