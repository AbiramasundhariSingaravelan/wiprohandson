package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import com.wipro.demo.exception.EmployeeNotFoundException;
import com.wipro.demo.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee e) throws EmployeeNotFoundException;
	List<Employee> getAllEmployees();
	Optional<Employee> getEmployeesById(int id);
	Employee updateEmployee(Employee updated) throws EmployeeNotFoundException;
	void deleteEmployees(int id);
}
