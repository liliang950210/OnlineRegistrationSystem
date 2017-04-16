package com.onlineRegister.service;

import java.util.List;

import com.onlineRegister.model.Hospital;
import com.onlineRegister.model.Page;

public interface HospitalService {
	
	public void addHospital(Hospital hospital);
	
	public void updateHospital(Hospital hospital);
	
	public void deleteHospital(Long hospitalId);
	
	public List<Hospital> selectByName(String name);
	
	public List<Hospital> selectByAreaId(Integer areaId,Page page);

}
