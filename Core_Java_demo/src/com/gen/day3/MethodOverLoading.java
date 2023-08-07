package com.gen.day3;


class Calculator{
	int cal(int x , int y ) {
		return x+y;
	}
	int cal(int y , int x , int p) {
		return x+y;
	}
	int cal(int x) {
		return x*x;
	}
	int cal(long z) {
		return (int) ((long)z*z*z);
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		System.out.println("addtion ="+obj.cal(10, 20));
		System.out.println("Squ = "+obj.cal(5));
		System.out.println("Cube = "+obj.cal(3));
	}

}
