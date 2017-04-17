package com.onlineRegister.dao;

import java.util.List;

import javax.print.Doc;

import org.apache.ibatis.annotations.Param;
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
    
    @Select("SELECT * FROM doctor WHERE hospital_id = #{hospitalId} AND room_id = #{roomId} LIMIT #{p.startPosition},#{p.pageNumber}")
    List<Doctor> selectByHospitalAndRoom(@Param("hospitalId")Long hospitalId,@Param("roomId")Long roomId,@Param("p")Page page);
    
}