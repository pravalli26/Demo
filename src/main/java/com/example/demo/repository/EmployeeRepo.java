package com.example.demo.repository;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {

}
