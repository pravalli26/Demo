package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("employee")
public class EmployeeEndpoint {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employee")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employee) {
        return service.saveOrUpdate(employee);
    }

    // get put delete
    @GetMapping("/employee/{id}")
    public EmployeeDto getEmployeeById(@PathVariable("id") int employeeId) {
        return service.getEmployeeById(employeeId);
    }
}


