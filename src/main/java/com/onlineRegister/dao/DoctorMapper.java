package com.onlineRegister.dao;

import com.onlineRegister.model.Doctor;

public interface DoctorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}