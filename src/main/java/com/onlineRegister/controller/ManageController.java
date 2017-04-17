package com.onlineRegister.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlineRegister.model.Admin;
import com.onlineRegister.model.Doctor;
import com.onlineRegister.model.Hospital;
import com.onlineRegister.model.News;
import com.onlineRegister.model.Page;
import com.onlineRegister.model.Schedule;
import com.onlineRegister.service.AdminService;
import com.onlineRegister.service.DoctorService;
import com.onlineRegister.service.HospitalService;
import com.onlineRegister.service.NewsService;
import com.onlineRegister.service.OrderService;
import com.onlineRegister.service.ScheduleService;
import com.onlineRegister.util.Const;
import com.onlineRegister.util.Message;

@Controller
@RequestMapping("/manage")
public class ManageController {
	
	
	@Resource
	private HospitalService hospitalService;
	@Resource
	private DoctorService doctorService;
	@Resource
	private ScheduleService scheduleService;
	@Resource
	private NewsService newsService;
	@Resource
	private AdminService adminService;
	@Resource
	private OrderService orderService;
	
	@RequestMapping("/addHospital")
	@ResponseBody
	public Object addHospital(Hospital hospital){
		hospitalService.addHospital(hospital);
		return Message.getMessage();
	}
	
	@RequestMapping("/checkHospital")
	@ResponseBody
	public Object checkHospital(Hospital hospital,Page page){
		
		if(hospital.getHospitalName() != null){
			return Message.getMessage(hospitalService.selectByName(hospital.getHospitalName(),page));
		}else if(hospital.getHospitalAreaId() != null){
			return Message.getMessage(hospitalService.selectByAreaId(hospital.getHospitalAreaId(), page));
		}else{
			return Message.getMessage(hospitalService.selectAll(page));
		}
	}
	
	@RequestMapping("/modifyHospital")
	@ResponseBody
	public Object modifyHospital(Hospital hospital){
		hospitalService.updateHospital(hospital);
		return Message.getMessage();
	}
	
	@RequestMapping("/deleteHospital")
	@ResponseBody
	public Object deleteHospital(Long id){
		hospitalService.deleteHospital(id);
		return Message.getMessage();
	}
	
	@RequestMapping("/checkDoctor")
	@ResponseBody
	public Object checkDoctor(Long id,Page page ){
		if(id == null){
			return Message.getMessage(doctorService.selectAll(page));
		}else{
			return Message.getMessage(doctorService.selectById(id));
		}
	}
	
	@RequestMapping("/addDocter")
	@ResponseBody
	public Object addDocter(Doctor doctor){
		doctorService.addDoctor(doctor);
		return Message.getMessage();
	}
	
	@RequestMapping("/modifyDocter")
	@ResponseBody
	public Object modifyDocter(Doctor doctor){
		doctorService.updateDoctor(doctor);
		return Message.getMessage();
	}
	

	@RequestMapping("/deleteDocter")
	@ResponseBody
	public Object deleteDocter(Long id){
		doctorService.deleteDoctor(id);
		return Message.getMessage();
	}
	
	@RequestMapping("/getSchedule")
	@ResponseBody
	public Object getSchedule(Page page,Long hospitalId){
		if(hospitalId == null){
			return Message.getMessage(scheduleService.selectAll(page));
		}else{
			return Message.getMessage(scheduleService.selectByHospitalId(hospitalId, page));
		}
		
	}
	
	@RequestMapping("/getDoctor")
	@ResponseBody
	public Object getDoctor(Doctor doctor,Page page){
		Object data = doctorService.selectByHospitalAndRoom(doctor, page);
		
		return Message.getMessage(data);
	}
	
	@RequestMapping("/addSchedule")
	@ResponseBody
	public Object addSchedule(Schedule schedule){
		scheduleService.addSchedule(schedule);
		return Message.getMessage();
	}
	@RequestMapping("/updateScheduling")
	@ResponseBody
	public Object updateScheduling(Schedule schedule){
		scheduleService.updateSchedule(schedule);
		return Message.getMessage();
	}
	@RequestMapping("/deleteSchedule")
	@ResponseBody
	public Object deleteSchedule(Long id){
		scheduleService.deleteSchedule(id);
		return Message.getMessage();
	}
	
	@RequestMapping("/getNews")
	@ResponseBody
	public Object getNews(){
		return Message.getMessage(newsService.findAll());
	}
	
	@RequestMapping("/addNews")
	@ResponseBody
	public Object addNews(News news){
		
		newsService.addNews(news);
		return Message.getMessage();
	}
	
	@RequestMapping("/updateNews")
	@ResponseBody
	public Object updateNews(News news){
		
		newsService.updateNews(news);
		return Message.getMessage();
	}
	
	@RequestMapping("/deleteNews")
	@ResponseBody
	public Object deleteNews(Long id){
		newsService.deleteNews(id);
		return Message.getMessage();
	}
	
	@RequestMapping("/adminLogin")
	@ResponseBody 
	public Object adminLogin(HttpServletRequest request){
		Admin admin = new Admin();
		admin.setManageName((String) request.getAttribute("username"));
		admin.setPasswd((String) request.getAttribute("password"));
		admin = adminService.selectByNameAndPasswd(admin);
		if(admin != null){
			request.getSession().setAttribute(Const.SESSION_ADMIN, admin);
		}
		return Message.getMessage();
	}
	
	@RequestMapping("/adminLeave")
	@ResponseBody
	public Object adminLeave(HttpServletRequest request){
		request.getSession().setAttribute(Const.SESSION_ADMIN, null);
		return Message.getMessage();
	}
	
	@RequestMapping("/getRecord")
	@ResponseBody
	public Object getRecord(Long patientId,Page page){
		if(patientId == null){
			return Message.getMessage(orderService.getAllRecord(page));
		}else{
			return Message.getMessage(orderService.getRecordByPatientId(patientId, page));
		}
	}
	@RequestMapping("/getOrder")
	@ResponseBody
	public Object getOrder(Long  orderId,Page page){
		if(orderId == null){
			return Message.getMessage(orderService.getAllRecord(page));
		}else{
			return Message.getMessage(orderService.getRecordByPatientId(orderId, page));
		}
	}
}
