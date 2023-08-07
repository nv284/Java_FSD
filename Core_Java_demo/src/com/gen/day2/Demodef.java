package com.gen.day2;

class B{
	B(){
		System.out.println(" Def consturctor ");
	}
	int x = 400;
	void Meta() {
		System.out.println(" Def method ");
	}
}

public class Demodef {

	int phoneNUmber = 35678999;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();//--->consturtor
		System.out.println(b1.x); //---> instance variable
		b1.Meta();//def method 
		

	}

}
