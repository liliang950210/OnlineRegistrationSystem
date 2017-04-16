package com.onlineRegister.dao;

import org.apache.ibatis.annotations.Select;

import com.onlineRegister.model.Admin;

public interface AdminMapper {
    int insert(Admin record);

    int insertSelective(Admin record);
    
    @Select("SELECT * FROM admin WHERE manage_name = #{manageName} AND passwd = #{passwd}")
    Admin selectByNameAndPassWord(Admin admin);
}