package com.wipro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
