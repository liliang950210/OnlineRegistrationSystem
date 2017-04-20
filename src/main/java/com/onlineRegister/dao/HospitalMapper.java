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
    
    @Select("SELECT * FROM hospital WHERE hospital_name LIKE CONCAT('%',#{name},'%') AND is_delete = '0' LIMIT #{p.startPosition},#{p.rows}")
    List<Hospital> selectByName(@Param("name")String name,@Param("p")Page page);
    
    @Select("SELECT * FROM hospital WHERE hospital_area_id = #{areaId} AND is_delete = '0' LIMIT #{p.startPosition},#{p.rows}")
    List<Hospital> selectByAreaId(@Param("areaId")Integer areaId,@Param("p")Page page);
    
    @Select("SELECT * FROM hospital WHERE is_delete = '0' LIMIT #{p.startPosition},#{p.rows}")
    List<Hospital> selectAllHospital(@Param("p")Page page);
}