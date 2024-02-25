package com.prowings.DeepCopyConstructor;

public class TestDeepCopyConstructor {

	public static void main(String[] args) {

		Department department = new Department("Mechanical", 123, 10);

		Student std1 = new Student(8, "Gaurav", department);

		Student std2 = new Student(std1);

		System.out.println("Before changing the object !!!");

		System.out.println("Student1 : " + std1);
		System.out.println("Student2 : " + std2);

		std1.getDepartment().setName("Civil");

		System.out.println("After changing the object !!!");

		System.out.println("Student1 : " + std1);
		System.out.println("Student2 : " + std2);

	}

}