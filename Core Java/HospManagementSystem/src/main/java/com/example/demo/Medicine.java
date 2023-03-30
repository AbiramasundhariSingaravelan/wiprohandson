package com.example.demo;

import java.util.List;

public class Medicine {

	private int id;
	private String name;
	private int price;
	private int dosage;
	private String mfd;
	private String expDate;
	private Patient attach;
	private List<String> patients;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDosage() {
		return dosage;
	}
	public void setDosage(int dosage) {
		this.dosage = dosage;
	}
	public String getMfd() {
		return mfd;
	}
	public void setMfd(String mfd) {
		this.mfd = mfd;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public Patient getAttach() {
		return attach;
	}
	public void setAttach(Patient attach) {
		this.attach = attach;
	}
	public List<String> getPatients() {
		return patients;
	}
	public void setPatients(List<String> patients) {
		this.patients = patients;
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Medicine(int id, String name, int price, int dosage, String mfd, String expDate, Patient attach,
			List<String> patients) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.dosage = dosage;
		this.mfd = mfd;
		this.expDate = expDate;
		this.attach = attach;
		this.patients = patients;
	}
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Dosage: "+dosage);
		System.out.println("MFD Date: "+mfd);
		System.out.println("Exp Date "+expDate);
		System.out.println("Patient Details: " +attach);
		System.out.println("Patients List: "+patients);
	}
}
