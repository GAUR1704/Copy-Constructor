package com.prowings.CopyConstructor;

public class TestCopyConstructor {

	public static void main(String[] args) {
		
		Student std1 = new Student(123, "Gaurav", "Mechanical");
		
		Student std2 = new Student(std1);
		
		
		System.out.println("Before changing the object !!");
		System.out.println("Student1 = " + std1);
		System.out.println("Student2 = " + std2);
		
		std1.setDepartment("Computer Science");
		
		System.out.println("After changing the object !!");
		System.out.println("Student1 = " + std1);
		System.out.println("Student2 = " + std2);
	}
}
