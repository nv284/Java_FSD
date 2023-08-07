package com.gen.day2;

public class MethodDemo {
	
	int a = 10 ; int b = 20;//instance variable 
	static int c =40 , d=50; //static variable or class variable 
	
	void add() {
		//non static area 
	System.out.println("First Number-"+a);
	System.out.println("Second Number"+b);
	int z = a+b;
	System.out.println(" Result of a+b = "+z);
	}
	
	static void multiply() {
		//static area 
	//	System.out.println(x);
		int num = c*d;System.out.println(" Result of multiplication = "+num);
	}
	public int simInt(int p , int r , int t) {
		int si = (p*r*t)/100;
		System.out.println("simple int "+ si);
		return si;
	}
	public String details (String name , String city ) {
		return name  ;
	}
	public float multi(int x , float y ) {
		return x*y;
	}

	public static void main(String[] args) {
	//static area 
		MethodDemo m1 = new MethodDemo();
		m1.add(); // calling way to call non static 
		MethodDemo.multiply(); //static way to call static methods 
		m1.simInt(50000, 18, 4);
		m1.details("Java", null);

	}

}
