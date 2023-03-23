package com.example.demo.service;

import com.example.demo.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveOrUpdate(DepartmentDto department);
    DepartmentDto getDepartmentById(int id);
    DepartmentDto update(DepartmentDto department) throws Exception;
    void deleteDepartmentById(int id);
}
