package com.gen.day4;

public class MethodOverload {
	
	void communicate (int a , int b ) {
		int x = a*b ;
		System.out.println(" Data passing "+x);
	}
	void communicate (int p ) {
		int q = p*p*p;
		System.out.println("one parameter int= "+q);
	}
	void communicate(float a , float b , int c ) {
		float z = a+b+c;
		System.out.println(" Data passing by changing the no of parameter  "+z);
	}
	
	float communicate (int c , float a , float b) {
		float y = c+b+a;
		System.out.println("Data passing by changing the seq of parameter "+y);
		return y;
	}
	void communicate(String s ) {
		System.out.println(" One parameter = "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MethodOverload m1 = new MethodOverload();
  m1.communicate(5);
  m1.communicate("Java");
  m1.communicate(20, 40);
  m1.communicate(2.3f,4.1f,5 );
  m1.communicate(2, 1.5f, 3.4f);
  
	}

}
