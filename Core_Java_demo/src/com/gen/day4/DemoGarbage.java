package com.gen.day4;

public class DemoGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoGarbage demo = new DemoGarbage();
		
		demo = null;
		System.gc();

	}

}
