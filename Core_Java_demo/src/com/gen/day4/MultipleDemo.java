package com.gen.day4;

class Milk{
	void makeTea() {
		System.out.println("Milk");
	}
	
}
class Sugar{
	void makeTea() {
		System.out.println("Sugar");
	}
}

class Tea{
	void makeTea() {
		System.out.println("Tea");
	}
}
class Maketea extends Milk , Sugar , tea{
	
}


public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
