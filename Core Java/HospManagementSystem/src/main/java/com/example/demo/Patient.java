package com.example.demo;

public class Patient {

	private int pid;
	private String name;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + "]";
	}
	
}
