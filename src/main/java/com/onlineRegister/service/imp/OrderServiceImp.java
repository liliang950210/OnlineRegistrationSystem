package com.onlineRegister.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onlineRegister.dao.OrderMapper;
import com.onlineRegister.model.Page;
import com.onlineRegister.model.Record;
import com.onlineRegister.service.OrderService;

/**
 * 
 * @author:chuankun 1095409267@qq.com
 * 2017年4月17日 下午8:36:03
 */
@Service
public class OrderServiceImp implements OrderService{
	
	@Resource
	private OrderMapper orderMapper;

	public List<Record> getAllRecord(Page page) {
		// TODO Auto-generated method stub
		return orderMapper.selectAllRecord(page.getPage());
	}

	public List<Record> getRecordByOrderId(Long orderId, Page page) {
		// TODO Auto-generated method stub
		return orderMapper.selectByOrderId(orderId, page.getPage());
	}

	public List<Record> getRecordByPatientId(Long patientId, Page page) {
		// TODO Auto-generated method stub
		return orderMapper.selectByPatientId(patientId, page);
	}

}
