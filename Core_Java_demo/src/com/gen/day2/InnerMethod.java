package com.gen.day2;

public class InnerMethod {

	
	void m2() {
		System.out.println("Hi Java ");
	}
	
	void m1() {
		System.out.println("Hello Java");
		m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 InnerMethod m = new InnerMethod();
 m.m1();
	}

}
