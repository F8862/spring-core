package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Emp emp=context.getBean("emp1",Emp.class);//if we don't want to give type casting then we use second parameter i.e Emp.class
		System.out.println(emp);

	}

}
