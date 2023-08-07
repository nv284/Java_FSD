package com.gen.day2;

public class MobileDemo {

	String  Model;
	int price ;
	int camra ;
	int memory;
	
	public MobileDemo(String Model , int price ) {
		// TODO Auto-generated constructor stub
		this.Model = Model ;
		this.price = price ;
	}
	
	public MobileDemo(String Model , int p , int c , int m) {
		this.Model = Model;
		price = p ;
		camra = c ;
		memory = m;
		
	}
	void disp() {
		System.out.println("Model - "+Model);
		System.out.println("Memory - "+memory);
		System.out.println("Price - "+price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MobileDemo m1 = new MobileDemo("Google", 62000);
MobileDemo m2 = new MobileDemo("Google", 62000, 10, 8);
m1.disp();m2.disp();
	}

}
