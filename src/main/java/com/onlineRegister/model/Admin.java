package com.onlineRegister.model;

public class Admin {
    private Long id;

    private String manaerName;

    private String passwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManaerName() {
        return manaerName;
    }

    public void setManaerName(String manaerName) {
        this.manaerName = manaerName == null ? null : manaerName.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }
}