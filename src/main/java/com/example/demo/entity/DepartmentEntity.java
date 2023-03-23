package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="department")
@Data
public class DepartmentEntity {
    private String name;
    private String head;
    private Integer id;
    private String location;
    private String admin;
    @Column(name="phone_no")
    private long phoneNo;



}
