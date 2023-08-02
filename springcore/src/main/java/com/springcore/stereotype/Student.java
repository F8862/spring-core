//Stereo type annotatios
package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*this @Component is the replacement of <bean> tag by default it's take object name same as class name but in camel case,
if we want to give name manually we can give in ().*/
@Component("ob")
@Scope("prototype")
/*This @Scope use for give the scope to bean.we can configure it by either annotation as like this or using xml.
there are 5 type of scope 1.singletone:it will give same object each time when we call.
2.proto type:it will give same object each time when we call.
3.request 4.session 5.globalsession*/
public class Student {
	@Value("Furquan")//this @Value is use to put value explicitly in the variable.
	private String studentName;
	
	@Value("Balapur")
	private String city;
	
	//for collection type we make standalone collection in config file and use it by spring expression language as below
	
	@Value("#{temp}")
	private List<String> addresses;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	

}
