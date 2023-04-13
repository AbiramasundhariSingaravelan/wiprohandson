package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.demo.exception.EmployeeNotFoundException;
import com.wipro.demo.model.Employee;
import com.wipro.demo.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public Employee saveEmployee(Employee e) throws EmployeeNotFoundException
	{
		Optional<Employee > savedEmployee=empRepo.findById(e.getId());
		if(savedEmployee.isPresent()) {
			//throw exception
			throw new EmployeeNotFoundException("Employee already exists with that Id");
		}
		return empRepo.save(e);
	}
	@Override
	public List<Employee> getAllEmployees()
	{
		return empRepo.findAll();
	}
	@Override
	public Optional<Employee> getEmployeesById(int id)
	{
		return empRepo.findById(id);
	}
	@Override
	public Employee updateEmployee(Employee updatedEmployee) throws EmployeeNotFoundException
	{
		Optional<Employee > exEmployee=empRepo.findById(updatedEmployee.getId());
		if(exEmployee.isPresent())
		{
			updatedEmployee.setFirstName(updatedEmployee.getFirstName());
			updatedEmployee.setLastName(updatedEmployee.getLastName());
			updatedEmployee.setEmail(updatedEmployee.getEmail());
			return empRepo.save(updatedEmployee);
		}
		else
		{
			throw new EmployeeNotFoundException("No records available with the given id");
		}
	}
	@Override
	public void deleteEmployees(int id)
	{
		empRepo.deleteById(id);
	}
}
