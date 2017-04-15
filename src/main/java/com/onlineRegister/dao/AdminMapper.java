package com.onlineRegister.dao;

import com.onlineRegister.model.Admin;

public interface AdminMapper {
    int insert(Admin record);

    int insertSelective(Admin record);
}