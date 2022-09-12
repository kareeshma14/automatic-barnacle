package com.example.demodocker.resource.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeData {
	@Id
	private int id;
    private String name;
	private int salary;
    private String employeeDepartment;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public EmployeeData(int id, String name, int salary, String employeeDepartment) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.employeeDepartment = employeeDepartment;
	}
	public EmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
