package com.gen.day6;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList();  // 

		  al.add("Apple"); 
		  al.add("Orange"); 
		  al.add("Banana"); 
		  al.add("Gauva"); 
		 System.out.println(al); 
		 
		 String fruitsname = al.get(2);
		 System.out.println(" I love to eat -"+fruitsname);
		 
		 int numberOfElements = al.size(); 
		   System.out.println(numberOfElements); 
		   
		   int idx = al.indexOf("Apple");
		   System.out.println(" Apple is on " + idx+ " index");
		   
		   int lastv = al.lastIndexOf(3);
		   System.out.println(lastv);
		   
		   
		   // manually increase or decrease current capacity of ArrayList
		   al.ensureCapacity(20); // to grow the size 
		   al.trimToSize();
		   
		System.out.println(" Trim - "+ al);
		   

	}

}
