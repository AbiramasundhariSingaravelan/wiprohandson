package com.wipro.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.exception.EmployeeNotFoundException;
import com.wipro.demo.model.Employee;
import com.wipro.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl empService;
	
	@GetMapping("/view-employees")
	public List<Employee> getAllEmployees()
	{
		return empService.getAllEmployees();
	}
	@GetMapping("/view-employees/{id}")
	public Optional<Employee> getEmployeeById(int id)
	{
		return empService.getEmployeesById(id);
	}
	@PostMapping("/add-employee")
	public Employee saveEmployee(Employee e) throws EmployeeNotFoundException
	{
		return empService.saveEmployee(e);
	}
	@PutMapping("/update-employee/{id}")
	public Employee updateEmployee(Employee e) throws EmployeeNotFoundException
	{
		return empService.updateEmployee(e);
	}
	@DeleteMapping("/delete-employee")
	public void deleteEmployee(int id)
	{
		 empService.deleteEmployees(id);
	}
}
