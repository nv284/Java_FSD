package com.gen.day2;

class Xyz{
	public Xyz() {
		System.out.println("This is a default constructor"); 
	}
	 final int a = 50; 
	  final void show()
	  { 
	     System.out.println("Value of a: " +a); 
	   } 
}


public class FinalDemo {

	final int x ;
	final static int y ;
	
	public FinalDemo() {
		// TODO Auto-generated constructor stub
		x =300;
	}
	
	void disp_Value() {
		System.out.println("Value of x ="+x);
	}
	static {
		 y = 20;
		 System.out.println("Value of y = "+y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalDemo d = new FinalDemo();
d.disp_Value();
Xyz x1 = new Xyz();
x1.show();

	}

}
