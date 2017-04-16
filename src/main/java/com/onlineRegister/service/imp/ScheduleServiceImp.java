package com.onlineRegister.service.imp;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onlineRegister.dao.ScheduleMapper;
import com.onlineRegister.model.Page;
import com.onlineRegister.model.Schedule;
import com.onlineRegister.service.ScheduleService;

/**
 * 
 * @author:chuankun 1095409267@qq.com
 * 2017年4月16日 下午8:19:56
 */
@Service
public class ScheduleServiceImp implements ScheduleService{
	
	@Resource
	private ScheduleMapper scheduleMapper;

	public void addSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		scheduleMapper.insertSelective(schedule);
	}

	public void updateSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		scheduleMapper.updateByPrimaryKeySelective(schedule);
	}

	public void deleteSchedule(Long scheduleId) {
		// TODO Auto-generated method stub
		Schedule schedule = scheduleMapper.selectByPrimaryKey(scheduleId);
		schedule.setIsDelete(1);
		schedule.setDeleteTime(new Date());
		
		scheduleMapper.updateByPrimaryKeySelective(schedule);
	}

	public List<Schedule> selectAll(Page page) {
		// TODO Auto-generated method stub
		
		
		return scheduleMapper.selectAll(page.getPage());
	}

	public List<Schedule> selectByHospitalId(Long hospitalId, Page page) {
		// TODO Auto-generated method stub
		return scheduleMapper.selectByHospitalId(hospitalId, page.getPage());
	}

}
