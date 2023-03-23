package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="department")
@Data
public class DepartmentEntity {
    private String name;
    private String head;
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Id
    @SequenceGenerator(name="seq", sequenceName = "department_seq")
    private Integer id;
    private String location;
    private String admin;
    @Column(name="phone_no")
    private long phoneNo;



}
