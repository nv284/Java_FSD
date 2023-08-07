package com.gen.day5;

public class DemoClass implements PersonalGreet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass c1 = new DemoClass();
		System.out.println(c1.greet("Java"));
		c1.log("Spring");

	}

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		String s;
		return name;
	}

}
