package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	private int IntegerParseInt;
	
	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;

		System.out.println("Consturctor : double ,double");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
        System.out.println("Consturctor : int , int");
	}

	public Addition(String a,String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
        System.out.println("Consturctor : String ,String");
	}
	

	public void dosum() {
		System.out.println("Value of a :" + this.a);
		System.out.println("Value of b :" + this.b);
		System.out.println("sum is : " + (this.a + this.b));
	}

	

}
