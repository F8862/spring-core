//Inject primitive type,static method,static variables,boolean type and object using spel
package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{11+22}")//spel(inject primitive type)
	private int x;
	
	@Value("#{2+3+44}")//spel(inject primitive type)
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")//spel(inject static method)
	private double z;
	
	@Value("#{T(java.lang.Math).E}")//spel(inject static variable)
	private double e;
	
	@Value("#{T(java.lang.Math).PI}")//spel(inject static variable)
	private double pi;
	
	@Value("#{new java.lang.String('Furquan Ansari')}")//spel(inject object)
	private String name;
	
	@Value("#{8>3}")//spel(inject boolean type)
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	
	
	

}
