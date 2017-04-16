package com.onlineRegister.service.imp;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onlineRegister.dao.HospitalMapper;
import com.onlineRegister.model.Hospital;
import com.onlineRegister.model.Page;
import com.onlineRegister.service.HospitalService;


@Service
public class HospitalServiceImp implements HospitalService{
	
	@Resource
	private HospitalMapper hospitalMapper;

	public void addHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalMapper.insertSelective(hospital);
	}

	public void updateHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalMapper.updateByPrimaryKeySelective(hospital);
	}

	public void deleteHospital(Long hospitalId) {
		// TODO Auto-generated method stub
		Hospital hospital = hospitalMapper.selectByPrimaryKey(hospitalId);
		hospital.setDeleteTime(new Date());
		hospital.setIsDelete(1);
		
		hospitalMapper.updateByPrimaryKeySelective(hospital);
		
	}

	public List<Hospital> selectByName(String name) {
		// TODO Auto-generated method stub
		return hospitalMapper.selectByName(name);
	}

	public List<Hospital> selectByAreaId(Integer areaId,Page page) {
		// TODO Auto-generated method stub
		return hospitalMapper.selectByAreaId(areaId, page.getPage());
	}

	

}
