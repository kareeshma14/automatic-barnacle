package com.example.demodocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodocker.resource.entity.EmployeeData;

public interface EmployeeDataRepository extends JpaRepository<EmployeeData, Integer> {

}


