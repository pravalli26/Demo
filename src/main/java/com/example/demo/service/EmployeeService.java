package com.example.demo.service;

import com.example.demo.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveOrUpdate(EmployeeDto employee);
    EmployeeDto getEmployeeById(int id);

}
