package com.gen.day8;
/*
 * Supplier is a functional interface, in Java 8 under 
 * package java.util.function, that represents the structure and does not take any input but returns an output
 * The Supplier interface also have a method T get() that returns a value of of type T.
 * */

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		supply(()->"hi");
		supply(()->"Hello");
		supply(()->"Good Morning ");
		
		Supplier<Integer> s1 = ()->500;
		System.out.println(s1.get());
		

	}
public static void supply (Supplier<?> supplier)
{
	System.out.println(supplier.get());
}
}
