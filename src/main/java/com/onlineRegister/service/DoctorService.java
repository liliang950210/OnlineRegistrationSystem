package com.onlineRegister.service;

import java.util.List;

import com.onlineRegister.model.Doctor;
import com.onlineRegister.model.Page;

public interface DoctorService {
	
	public void addDoctor(Doctor doctor);
	
	public void updateDoctor(Doctor doctor);
	
	public void deleteDoctor(Long id);
	
	public Doctor selectById(Long id);
	
	public List<Doctor> selectAll(Page page);

}
