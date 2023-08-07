package com.gen.day5;

@FunctionalInterface
public interface Interface2 {
	
	//abstract
	void m2();
	
	//default
	default void print2() {
		System.out.println("Default method from interface2 ");
	}
	
	default void print(String str) {
		if(!isNull(str))
			System.out.println("MyData print "+str);
	}
	
	static boolean isNull(String str) {
		System.out.println("Interface Null check ");
		return str == null ? true :" ". equals(str)?true :false ;
	}

}

