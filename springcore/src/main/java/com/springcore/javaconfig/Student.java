//Removing complete xml configuration for spring
package com.springcore.javaconfig;

import org.springframework.stereotype.Component;
//@Component
public class Student {
	private Samosa samosa;
	
	
	public void study(){
		this.samosa.display();
		System.out.println("Student is reading book");
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	

}
