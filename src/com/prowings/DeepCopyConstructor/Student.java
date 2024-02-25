package com.prowings.DeepCopyConstructor;

public class Student {
	
	private int roll;
	private String name;
	private Department department;

	public Student() {
		super();
	}

	public Student(int roll, String name, Department department) {
		super();
		this.roll = roll;
		this.name = name;
		this.department = department;
	}
	
	public Student (Student std) {
		
		this.name = std.getName();
		this.roll = std.getRoll();
		
		Department copyDepartment = new Department();
		
		copyDepartment.setName(std.getDepartment().getName());
		copyDepartment.setCode(std.getDepartment().getCode());
		copyDepartment.setId(std.getDepartment().getId());
		
		this.department = copyDepartment;
		
		
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", department=" + department + "]";
	}
	
	

}
