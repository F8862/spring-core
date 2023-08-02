//implementing lifecycle method using annotation
package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	@PostConstruct//to using these annotations we need to add dependency in pom.xml
	public void init(){
		System.out.println("init method");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy method");
	}

}
