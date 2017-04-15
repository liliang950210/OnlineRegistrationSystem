package com.onlineRegister.dao;

import com.onlineRegister.model.Patient;

public interface PatientMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}