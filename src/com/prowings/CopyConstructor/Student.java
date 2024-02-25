package com.prowings.CopyConstructor;

public class Student {
	
	private int roll;
	private String name;
	private String department;
	
	public Student() {
		super();
	}

	public Student(int roll, String name, String department) {
		super();
		this.roll = roll;
		this.name = name;
		this.department = department;
	}
	
	public Student(Student std) {
		
		this.roll = std.getRoll();
		this.name = std.getName();
		this.department = std.getDepartment();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [roll = " + roll + ", name = " + name + ", department = " + department + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
