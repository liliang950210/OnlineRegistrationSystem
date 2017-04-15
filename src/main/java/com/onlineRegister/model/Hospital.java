package com.onlineRegister.model;

public class Hospital {
    private Long id;

    private String hospitalName;

    private Integer hospitalAreaId;

    private String hospitalAddress;

    private String hospitalPhone;

    private String hospitalLevel;

    private String hospitalImage;

    private String hospitalIntroduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public Integer getHospitalAreaId() {
        return hospitalAreaId;
    }

    public void setHospitalAreaId(Integer hospitalAreaId) {
        this.hospitalAreaId = hospitalAreaId;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress == null ? null : hospitalAddress.trim();
    }

    public String getHospitalPhone() {
        return hospitalPhone;
    }

    public void setHospitalPhone(String hospitalPhone) {
        this.hospitalPhone = hospitalPhone == null ? null : hospitalPhone.trim();
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel == null ? null : hospitalLevel.trim();
    }

    public String getHospitalImage() {
        return hospitalImage;
    }

    public void setHospitalImage(String hospitalImage) {
        this.hospitalImage = hospitalImage == null ? null : hospitalImage.trim();
    }

    public String getHospitalIntroduction() {
        return hospitalIntroduction;
    }

    public void setHospitalIntroduction(String hospitalIntroduction) {
        this.hospitalIntroduction = hospitalIntroduction == null ? null : hospitalIntroduction.trim();
    }
}