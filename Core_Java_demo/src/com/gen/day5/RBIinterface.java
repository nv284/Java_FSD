package com.gen.day5;

@FunctionalInterface
public interface RBIinterface {

	
	float rateOfInt(float p);
	
	default void rulesOfRBI() {
		System.out.println(" Dont go for ensecure Internet Banking");
		System.out.println("dont share your pin , otp , account no with others");
		System.out.println("Change your password freq");
		
	}
}
