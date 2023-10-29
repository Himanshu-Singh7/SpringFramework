package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
	private int x ;
    @Value("#{2+3+9+17}")
	private int y;
    
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;
    
    @Value("#{T(java.lang.Math).E}")
    private double e;
    
    @Value("#{new java.lang.String('Himanshu Singh')}")
    private String name;
    
    @Value("#{8-2 > 6}")
    private boolean isActive;
    
    
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
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
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	

}
