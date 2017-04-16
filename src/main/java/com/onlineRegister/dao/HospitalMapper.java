package com.onlineRegister.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.onlineRegister.model.Hospital;
import com.onlineRegister.model.Page;

public interface HospitalMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
    
    @Select("SELECT * FROM hospital WHERE hospital_name LIKE CONCAT('%',#{name},'%')")
    List<Hospital> selectByName(@Param("name")String name);
    
    @Select("SELECT * FROM hospital WHERE hospital_area_id = #{areaId} LIMIT #{p.startPosition},#{p.pageSize}")
    List<Hospital> selectByAreaId(@Param("areaId")Integer areaId,@Param("p")Page page);
}