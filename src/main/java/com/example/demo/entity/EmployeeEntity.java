package com.example.demo.entity;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity(name = "employee")
@Data
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Id
    @SequenceGenerator(name="seq", sequenceName = "employee_seq")
    private Integer id;
    private String name;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private int salary;
    @Column(name = "phone_no")
    private long phoneNo;
    private String department;


}
