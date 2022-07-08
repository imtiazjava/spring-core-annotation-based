package com.cgi.main;


public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("Emp obj is created...");
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
