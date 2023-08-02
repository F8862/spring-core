package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//This will denotes that this is configuration file
//@ComponentScan(basePackages="com.springcore.javaconfig")//if we use @Component then only we need to use this annotation otherwise we can remove this also
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa(){
		Samosa samosa=new Samosa();
		return samosa;
		
	}
	
	@Bean(name={"student,temp"})
	/*we use this at the place of @Component annotation,by default ioc take bean name as meyhod name like getStudent
	but we can give name manually also.we can different name like above*/
	public Student getStudent(){
		//creating new student class object
		Student student=new Student(getSamosa());
		return student;
	}

}
