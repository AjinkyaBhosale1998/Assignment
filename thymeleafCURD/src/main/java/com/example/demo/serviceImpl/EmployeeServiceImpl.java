package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> listAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll();	
	}

}

//import org.springframework.beans.factory.annotation.Autowired;
//import com.example.demo.repository.EmployeeRepository;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService
//{
//@Autowired
//private EmployeeRepository employeeRepository;
//@Override
//public List<Employee> listAllEmployee() {
//// TODO Auto-generated method stub
//return employeeRepository.findAll();
//}
//@Override
//public Employee saveEmployee(Employee employee) {
//// TODO Auto-generated method stub
//return employeeRepository.save(employee);
//}

//@Override
//public Employee updateEmployee(Employee employee) {
//// TODO Auto-generated method stub
//return employeeRepository.save(employee);
//}
//@Override
//public void deleteEmployee() {
//// TODO Auto-generated method stub
//employeeRepository.deleteAll();;
//}
//}