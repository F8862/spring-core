package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//registering shutdown hook
				context.registerShutdownHook();
				/*by default destroy method is not call therefore we use registerShutdownHook() method to call it 
				and registerShutdownHook() is the method of  AbstractApplicationContext interface*/
		/*Samosa s1=(Samosa) context.getBean("s1");
		System.out.println(s1);
		System.out.println("=============================================================");
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);*/
				
				Example example=(Example) context.getBean("example");
				System.out.println(example);
		
	}

}
