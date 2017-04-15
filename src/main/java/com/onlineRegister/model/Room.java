package com.onlineRegister.model;

public class Room {
    private Long id;

    private Integer bigRoomId;

    private String roomName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBigRoomId() {
        return bigRoomId;
    }

    public void setBigRoomId(Integer bigRoomId) {
        this.bigRoomId = bigRoomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }
}