package com.mst.StudentLibraryManagementSystem.DTOs;

public class StudentUpdateMobRequestDTO {


    private int id;
    private String mobNo;

    //Dto's depend on the API's being called...add
    //atributes as required.

    public StudentUpdateMobRequestDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}

