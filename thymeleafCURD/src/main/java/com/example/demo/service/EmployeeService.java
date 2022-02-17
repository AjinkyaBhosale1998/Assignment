package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> listAllEmployees();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee();
}
