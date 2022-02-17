package com.example.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp/rest")
public class EmployeeRestController {
@Autowired
private EmployeeRepository employeeRepository;



@GetMapping("/")
public List<Employee> listAllEmployee(){
return employeeRepository.findAll();
}



@GetMapping("/{eId}")
public Employee listOneEmployee(@PathVariable Long eId){
return employeeRepository.findById(eId).get();
}
@PostMapping("/")
public Employee saveOneEmployee(@RequestBody Employee employee){
return employeeRepository.save(employee);
}
@PutMapping("/")
public Employee updateOneEmployee(@RequestBody Employee employee){
return employeeRepository.save(employee);
}
@PutMapping("/{eId}")
public ResponseEntity<Employee> updateOneEmployee(@PathVariable(value = "eId") Long eId, @RequestBody Employee employee){
Employee emp1=employeeRepository.findById(eId).get();
emp1.seteId(employee.geteId());
emp1.setEmpName(employee.getEmpName());
emp1.setEmpCompany(employee.getEmpCompany());
Employee emp2=employeeRepository.save(emp1);
return ResponseEntity.ok(emp2);
}
@DeleteMapping("/")
public String deleteOneEmployee(@RequestBody Employee employee){
employeeRepository.delete(employee);
return "Deleted : "+employee.toString();
}
@DeleteMapping("/{eId}")
public String deleteOneByIdEmployee(@PathVariable Long eId){
employeeRepository.deleteById(eId);
return "Deleted : "+eId;
}
}