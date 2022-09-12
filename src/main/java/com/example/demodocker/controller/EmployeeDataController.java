package com.example.demodocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demodocker.resource.entity.EmployeeData;
import com.example.demodocker.service.EmployeeDataService;

@RestController
public class EmployeeDataController {

	@Autowired
	private EmployeeDataService service;
	
	@GetMapping("/employee/{id}")
	public EmployeeData getEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
		
	}
	 @GetMapping("/Employee")
	    public List<EmployeeData> getEmployee(){
	        return service.getAllEmployee();
	    }
	@PostMapping("/Employee")
	    public EmployeeData savePlayer(@RequestBody EmployeeData Employee) {
	        return service.addEmployee(Employee);
	    }
}
