package com.example.demodocker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demodocker.repository.EmployeeDataRepository;
import com.example.demodocker.resource.entity.EmployeeData;


@Service
public class EmployeeDataService {
	
	@Autowired
	private EmployeeDataRepository repository;
	
	// to add the Employee
	public EmployeeData addEmployee(EmployeeData employee) {
		// TODO Auto-generated method stub
		return repository.save(employee);
	}
	
	// to get the Employee based on his id
	public EmployeeData getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}
	
	// to get all the Employee
	public List<EmployeeData> getAllEmployee() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	// to delete the employee
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee deleted";
		
	}
	

}
