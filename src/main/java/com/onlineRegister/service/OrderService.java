package com.onlineRegister.service;

import java.util.List;

import com.onlineRegister.model.Page;
import com.onlineRegister.model.Record;

public interface OrderService {
	
	public List<Record> getAllRecord(Page page);
	
	public List<Record> getRecordByOrderId(Long orderId,Page page);
	
	public List<Record> getRecordByPatientId(Long patientId,Page page);

}
