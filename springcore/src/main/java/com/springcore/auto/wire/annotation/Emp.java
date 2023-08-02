//Autowiring using Annotation
package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
	/*If we have more than one bean for single class in config file then we use @Qualifier 
	and pass parameter to specify which one object we want.It's always use with @Autowired*/	
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting vlaues");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside COnstructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
