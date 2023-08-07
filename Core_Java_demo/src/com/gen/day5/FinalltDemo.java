package com.gen.day5;

public class FinalltDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20 ,b=0;
		try{
			System.out.println("111"); 
			  System.out.println(20/0); 
			  System.out.println("222"); 
			
			int div = a/b;
			System.out.println(div);
			System.out.println(" Print");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			//System.out.println(10/0); 
			System.out.println("catch");
		}
		finally {
			System.out.println(" Denominator cannot be zero");
		}
		System.out.println(" hello java");

	}

}
