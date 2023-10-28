package com.springcore.lifecycle;

public class Samosa {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("inside init method");
	}
    
	public void distory() {
		System.out.println("Inside distroy method");
	}
}
