package com.example.demo.service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public EmployeeDto saveOrUpdate(EmployeeDto employee) {
        EmployeeEntity entity = transform(employee);
        if(Objects.nonNull(employee.getId())){
            entity = repo.findById(employee.getId()).orElse(transform(employee));
        }
        entity = repo.save(entity);
        return transform(entity);
    }

    @Override
    public EmployeeDto getEmployeeById(int id) {
        EmployeeEntity entity = new EmployeeEntity();
        if( id !=0){
             entity = repo.findById(id).get();
        }
        return transform(entity);
    }





    private EmployeeEntity transform(EmployeeDto dto) {
        EmployeeEntity entity = new EmployeeEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setSalary(dto.getSalary());
        entity.setDepartment(dto.getDepartment());
        entity.setPhoneNo(dto.getPhoneNo());
        return entity;
    }

    private EmployeeDto transform(EmployeeEntity entity) {
        EmployeeDto dto = new EmployeeDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setSalary(entity.getSalary());
        dto.setDepartment(entity.getDepartment());
        dto.setPhoneNo(entity.getPhoneNo());
        return dto;
    }
}
