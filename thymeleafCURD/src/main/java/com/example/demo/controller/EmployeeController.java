package com.example.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Controller
public class EmployeeController {

@Autowired
private EmployeeRepository employeeRepository;

@Value("${myapp.title}") // accepting value from properties file
private String pageTitle;

@GetMapping(value = { "/", "/index" })
public String indexPage(Model model) {
model.addAttribute("titleOfPage", pageTitle); // storing in the key value pair
model.addAttribute("index");
return "index";
}



@GetMapping("/list")
public String listAllEmployee(Model model) {
List<Employee> employees=employeeRepository.findAll();
model.addAttribute("employees_list", employees);
return "listempl";
}
}