package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		//if we use java class for configuration then we use AnnotationConfigApplicationContext class
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		student.study();
		
	}

}
