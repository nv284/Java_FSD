package com.gen.day5;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Learning java";
int a [] = {0,1,2,3,4,5};
try {
	//s = null ;
	int len = s.length();
	System.out.println(" String length -"+len);
	int b = 6 ;
	System.out.println(a[b]);
}catch (NullPointerException e) {
	// TODO: handle exception
	System.out.println(e);
}
catch (ArrayIndexOutOfBoundsException e) {
	// TODO: handle exception
	System.out.println(e);
}
	}

}
