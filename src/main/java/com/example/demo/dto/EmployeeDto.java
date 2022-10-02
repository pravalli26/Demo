package com.example.demo.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class EmployeeDto {
    private Integer id;
    private String name;
    private String firstName;
    private String lastName;
    private int salary;
    private long phoneNo;
    private String department;


}
