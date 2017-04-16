package com.onlineRegister.model;

import java.math.BigDecimal;
import java.util.Date;

public class Schedule {
    private Long id;

    private Long doctorId;

    private Date bookDate;

    private Integer bookTime;

    private Integer bookPeople;

    private Integer bookedPeople;

    private BigDecimal bookMoney;

    private Integer isDelete;

    private Date deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Integer getBookTime() {
        return bookTime;
    }

    public void setBookTime(Integer bookTime) {
        this.bookTime = bookTime;
    }

    public Integer getBookPeople() {
        return bookPeople;
    }

    public void setBookPeople(Integer bookPeople) {
        this.bookPeople = bookPeople;
    }

    public Integer getBookedPeople() {
        return bookedPeople;
    }

    public void setBookedPeople(Integer bookedPeople) {
        this.bookedPeople = bookedPeople;
    }

    public BigDecimal getBookMoney() {
        return bookMoney;
    }

    public void setBookMoney(BigDecimal bookMoney) {
        this.bookMoney = bookMoney;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}