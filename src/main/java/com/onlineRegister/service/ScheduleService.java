package com.onlineRegister.service;

import java.util.List;

import com.onlineRegister.model.Page;
import com.onlineRegister.model.Schedule;

public interface ScheduleService {
	
	public void addSchedule(Schedule schedule);
	
	public void updateSchedule(Schedule schedule);
	
	public void deleteSchedule(Long schedule);
	
	public List<Schedule> selectAll(Page page);
	
	public List<Schedule> selectByHospitalId(Long hospitalId,Page page);

}
