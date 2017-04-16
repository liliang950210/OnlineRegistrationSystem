package com.onlineRegister.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.onlineRegister.model.Page;
import com.onlineRegister.model.Schedule;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    Schedule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
    
    @Select("SELECT * FROM `schedule` WHERE is_delete = '0' LIMIT #{startPosition},#{pageNumber}")
    List<Schedule> selectAll(Page page);
    
    @Select("SELECT * FROM `schedule` WHERE doctor_id in("
    		+ "SELECT doctor_id FROM doctor WHERE hospital_id = #{hospitalId}"
    		+ ")LIMIT #{startPosition},#{pageNumber}")
    List<Schedule> selectByHospitalId(@Param("hospitalId")Long hospitalId,@Param("p")Page page);
}