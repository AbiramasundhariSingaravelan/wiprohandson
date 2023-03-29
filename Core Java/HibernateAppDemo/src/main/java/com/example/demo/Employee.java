package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	@Id
	private int eno;
	@Column
	private String firstName, lastName;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eno, String firstName, String lastName) {
		super();
		this.eno = eno;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
