package com.gen.day5;

@FunctionalInterface
public interface Interface1 {

	void m1();
	default void print1() {
		System.out.println("default method from interface 1");
	}
}
