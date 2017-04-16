package com.onlineRegister.service;

import com.onlineRegister.model.Admin;

public interface AdminService {
	
	public Admin selectByNameAndPasswd(Admin admin);

}
