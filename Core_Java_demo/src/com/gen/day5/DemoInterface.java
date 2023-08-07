package com.gen.day5;

public class DemoInterface  implements Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoInterface d = new DemoInterface();
		d.print("Nullcheck");
		d.print2();
		Interface2.isNull("Check string");

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(" This is abstract method ");
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println(" Default method overriding ");
	}

	@Override
	public void print(String str) {
		// TODO Auto-generated method stub
		System.out.println(" Default method ");
		
	}

	

}
