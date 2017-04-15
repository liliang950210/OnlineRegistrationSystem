package com.onlineRegister.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onlineRegister.dao.UserMapper;
import com.onlineRegister.model.User;
import com.onlineRegister.service.UserService;

/**
 * @author chuankunYi
 * email:yichuankun@qq.com
 *2016年7月25日 下午7:28:42
 */
@Service
public class UserServiceImp implements UserService{

	
	@Resource
	private UserMapper userMapper;

	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}
	
	 
}
