package com.onlineRegister.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.onlineRegister.model.Doctor;
import com.onlineRegister.model.Page;

public interface DoctorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
    
    @Select("SELECT * FROM doctor WHERE is_delete = '0' LIMIT #{startPosition},#{pageNumber}")
    List<Doctor> selectAllDoctor(Page page);
    
}