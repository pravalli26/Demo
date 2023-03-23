package com.example.demo.controller;


import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("department")
public class DepartmentEndPoint {
    @Autowired
    private DepartmentService departmentService;

}
