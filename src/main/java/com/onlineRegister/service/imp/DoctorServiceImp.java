package com.onlineRegister.service.imp;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onlineRegister.dao.DoctorMapper;
import com.onlineRegister.model.Doctor;
import com.onlineRegister.model.Page;
import com.onlineRegister.service.DoctorService;

/**
 * 
 * @author:chuankun 1095409267@qq.com
 * 2017年4月16日 下午5:00:37
 */
@Service
public class DoctorServiceImp implements DoctorService{
	
	
	@Resource
	private DoctorMapper doctorMapper;

	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorMapper.insertSelective(doctor);
	}

	public void updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorMapper.updateByPrimaryKeySelective(doctor);
	}

	public void deleteDoctor(Long id) {
		// TODO Auto-generated method stub
		Doctor doctor = doctorMapper.selectByPrimaryKey(id);
		doctor.setIsDelete(1);
		doctor.setDeleteTime(new Date());
		
		doctorMapper.updateByPrimaryKeySelective(doctor);
	}

	public Doctor selectById(Long id) {
		// TODO Auto-generated method stub
		return doctorMapper.selectByPrimaryKey(id);
	}

	public List<Doctor> selectAll(Page page) {
		// TODO Auto-generated method stub
		return doctorMapper.selectAllDoctor(page.getPage());
	}

}
