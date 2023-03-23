package com.example.demo.service;

import com.example.demo.dto.DepartmentDto;

import com.example.demo.entity.DepartmentEntity;
import com.example.demo.repository.DepartmentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepo repo;
    

    @Override
    public DepartmentDto saveOrUpdate(DepartmentDto department) {
        DepartmentEntity entity = transform(department);
        if(Objects.nonNull(department.getId())){
            entity = repo.findById(department.getId()).orElse(transform(department));
        }
        entity = repo.save(entity);
        return transform(entity);
    }

    @Override
    public DepartmentDto getDepartmentById(int id) {
        DepartmentEntity entity = new DepartmentEntity();
        if( id !=0){
            entity = repo.findById(id).get();
        }
        return transform(entity);
    }


    @Override
    public DepartmentDto update(DepartmentDto department) throws Exception {
        DepartmentEntity entity;
        if (Objects.nonNull(department.getId())) {
            entity = repo.findById(department.getId()).orElse(null);
        }else {
           throw new Exception("Resource Not Found") ;
        }
        if (Objects.isNull(entity)){
            throw new Exception("Resource Not Found") ;
        }
        entity.setName(entity.getName());
        entity.setHead(entity.getHead());
        entity.setId(entity.getId());
        entity.setLocation(entity.getLocation());
        entity.setAdmin(entity.getAdmin());
        entity.setPhoneNo(entity.getPhoneNo());
        entity = repo.save(entity);
        return transform(entity);

    }

    @Override
    public void deleteDepartmentById(int id) {
        if( id !=0){
           repo.deleteById(id);
        }
    }


    //Optional class


    private DepartmentEntity transform(DepartmentDto dto) {
        DepartmentEntity entity = new DepartmentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAdmin(dto.getAdmin());
        entity.setHead(dto.getHead());
        entity.setLocation(dto.getLocation());
        entity.setPhoneNo(dto.getPhoneNo());
        return entity;
    }

    private DepartmentDto transform(DepartmentEntity entity) {
        DepartmentDto dto = new DepartmentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setHead(entity.getHead());
        dto.setAdmin(entity.getAdmin());
        dto.setLocation(entity.getLocation());
        dto.setPhoneNo(entity.getPhoneNo());
        return dto;
    }
}
