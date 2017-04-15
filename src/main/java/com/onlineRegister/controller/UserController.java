package com.onlineRegister.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlineRegister.service.UserService;
import com.onlineRegister.util.Message;

/**
 * @author chuankunYi
 * email:yichuankun@qq.com
 *2016�?7�?25�? 下午7:30:16
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;

	@RequestMapping("/addUser")
	@ResponseBody
	public Object  addUser(String username,String password){
		
		
		
		return Message.getMessage();
		
	}
	
}
