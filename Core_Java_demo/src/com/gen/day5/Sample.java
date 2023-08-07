package com.gen.day5;


@FunctionalInterface
interface PersonalGreet{
	//abstract 
	String greet(String name);
	
	//default 
	default void log(String str) {
		System.out.println("Log is => "+str);
	}
}

@FunctionalInterface
public interface Sample {

	//abstract 
	int calculate(int val);

}
