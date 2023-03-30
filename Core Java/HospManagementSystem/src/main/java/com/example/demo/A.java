package com.example.demo;

public class A {

	B b;
	A()
	{
		System.out.println("A Class Constructor");
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	void print()
	{
		System.out.println("Inside A");
		b.print();
	}
}
