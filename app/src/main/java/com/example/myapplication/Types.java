package com.example.myapplication;

public enum Types {
    SG_LOAD("sg_api/load"),
    SG_OnCreate("sg_api/oncreate"),;
    public String eventId;
    // Enum类构造方法默认同时也必须是私有的
    Types(String eventId) {
        this.eventId = eventId;
    }
}
