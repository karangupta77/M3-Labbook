package com.cg.iter.demo1.1st;

public class Employee {
	private int emplId;
	private String emplName;
	private double salary;
	private String businessUnit;
	private int age;
	public int getEmployeeId() {
		return emplId;
	}
	public void setEmployeeId(int emplId) {
		this.emplId = emplId;
	}
	public String getEmployeeName() {
		return emplName;
	}
	public void setEmployeeName(String emplName) {
		this.emplName = emplName;
	}
	public Employee(int emplId, String emplName, double salary,
			String businessUnit, int age) {
		super();
		this.emplId = emplId;
		this.emplName = emplName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
