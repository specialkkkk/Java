package io;

import java.io.Serializable; 

public class PersonDTO {
	private String name;
	private int age;
	private double height;
	
	
	//생성자 constructor using field
	public PersonDTO(String name, int age, double height)  {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
