//implementing lifecycle method using interfaces
package com.springcore.lifecycle;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking pepsi:init");
		
		
	}

	public void destroy() throws Exception {
		System.out.println("Throw empty pepsi bottle:destroy");
		
	}
	
	

}
