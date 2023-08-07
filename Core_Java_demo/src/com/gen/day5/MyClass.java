package com.gen.day5;

import java.util.Scanner;

public class MyClass implements Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("May I please know your name ?");
String name = sc.next();
PersonalGreet hello = (String n )-> "Hello "+n;
System.out.println(hello.greet(name));
MyClass m1 = new MyClass();
System.out.println("Clauclate = "+m1.calculate(5));

	}

	@Override
	public int calculate(int val) {
		// TODO Auto-generated method stub
		return val*val;
	}

}
