package com.gen.day5;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1
			int x1 [] = {10,20,30, 40, 50};
			System.out.println(x1[10]);
	//2		
int x = 5 , y = 0 ;
int z = x/y;
System.out.println(z);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(" A number is divided by zero " +e);
		}
	}

}
