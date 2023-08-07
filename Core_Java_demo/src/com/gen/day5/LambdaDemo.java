package com.gen.day5;

interface MyComp{
	/*public boolean compare(int a , int b );*/
	/*public String greet(String s); */
	void print();
	
}
public class LambdaDemo {

	int a ;//instance variable 
	static int b = 600;
	// constructor to initialise instance variable
	public LambdaDemo(int a) {
		super();
		this.a = a;
	}
	

void show() {
	 // lambda expression to define print() method
	MyComp t = ()->{System.out.println("a = "+a);
	                System.out.println("b  = "+b);    };
	
	//cllaing print() on object t
	t.print();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LambdaDemo demp = new LambdaDemo(150);
demp.show();
		
	/*	object 
	 * MyComp com = (a , b )->a>b ;
		boolean res = com.compare(200, 433);
		System.out.println(res);
		*/
		
		/* local
		String s1 = " Hello ";
		MyComp g = (s)-> { return s1 +" "+s ;};
		System.out.println(g.greet("Java"));*/
		
		
	}

}
