package com.wipro.demo.model;

import com.wipro.demo.Employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column	
	private String email;
	
}