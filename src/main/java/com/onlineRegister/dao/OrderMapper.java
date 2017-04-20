package com.onlineRegister.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.onlineRegister.model.Order;
import com.onlineRegister.model.Page;
import com.onlineRegister.model.Record;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    @Select("SELECT *"+
  "FROM (SELECT id AS patient_id,patient_name,idcard,user_id FROM patient  ) a"+
  "NATURAL JOIN"+
   "(SELECT id AS user_id,username,patient_id FROM `user`  )b"+
  "NATURAL JOIN"+
  "(SELECT id AS doctor_id,room_id,hospital_id FROM doctor) c"+ 
  "NATURAL JOIN"+
  "(SELECT id AS hospital_id,hospital_name FROM hospital) d"+
 "NATURAL JOIN"+
  "(SELECT id AS room_id,room_name FROM room)e"+
 "NATURAL JOIN"+
 "(SELECT * FROM `order`)f"+
 "NATURAL JOIN"+
 "(SELECT id AS schedule_id,doctor_id,book_date,book_time,book_money FROM `schedule`) g"+
"LIMIT #{startPosition},#{rows}")
    List<Record> selectAllRecord(Page page);
    
    @Select("SELECT *"+
    		  "FROM (SELECT id AS patient_id,patient_name,idcard,user_id FROM patient  ) a"+
    		  "NATURAL JOIN"+
    		   "(SELECT id AS user_id,username,patient_id FROM `user`  )b"+
    		  "NATURAL JOIN"+
    		  "(SELECT id AS doctor_id,room_id,hospital_id FROM doctor) c"+ 
    		  "NATURAL JOIN"+
    		  "(SELECT id AS hospital_id,hospital_name FROM hospital) d"+
    		 "NATURAL JOIN"+
    		  "(SELECT id AS room_id,room_name FROM room)e"+
    		 "NATURAL JOIN"+
    		 "(SELECT * FROM `order`WHERE id = #{id})f"+
    		 "NATURAL JOIN"+
    		 "(SELECT id AS schedule_id,doctor_id,book_date,book_time,book_money FROM `schedule`) g"+
    		"LIMIT #{p.startPosition},#{p.rows}")
    List<Record> selectByOrderId(@Param("id")Long id,@Param("p")Page page);
    
    @Select("SELECT *"+
  		  "FROM (SELECT id AS patient_id,patient_name,idcard,user_id FROM patient WHERE id = #{patientId} ) a"+
  		  "NATURAL JOIN"+
  		   "(SELECT id AS user_id,username,patient_id FROM `user`  )b"+
  		  "NATURAL JOIN"+
  		  "(SELECT id AS doctor_id,room_id,hospital_id FROM doctor) c"+ 
  		  "NATURAL JOIN"+
  		  "(SELECT id AS hospital_id,hospital_name FROM hospital) d"+
  		 "NATURAL JOIN"+
  		  "(SELECT id AS room_id,room_name FROM room)e"+
  		 "NATURAL JOIN"+
  		 "(SELECT * FROM `order`)f"+
  		 "NATURAL JOIN"+
  		 "(SELECT id AS schedule_id,doctor_id,book_date,book_time,book_money FROM `schedule`) g"+
    		"LIMIT #{p.startPosition},#{p.rows}")
    List<Record> selectByPatientId(@Param("patientId")Long patientId,@Param("p")Page page);
}


