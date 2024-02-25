package com.prowings.DeepCopyConstructor;

public class Department {
	
	private String name;
	private int code;
	private int id;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String name, int code, int id) {
		super();
		this.name = name;
		this.code = code;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", code=" + code + ", id=" + id + "]";
	}
	
	
	
}
