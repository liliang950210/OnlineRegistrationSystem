package com.onlineRegister.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onlineRegister.dao.AdminMapper;
import com.onlineRegister.model.Admin;
import com.onlineRegister.service.AdminService;

/**
 * 
 * @author:chuankun 1095409267@qq.com
 * 2017年4月16日 下午9:03:28
 */
@Service
public class AdminServiceImp implements AdminService{
	
	@Resource
	private AdminMapper adminMapper;

	public Admin selectByNameAndPasswd(Admin admin) {
		// TODO Auto-generated method stub
		return adminMapper.selectByNameAndPassWord(admin);
	}

}
