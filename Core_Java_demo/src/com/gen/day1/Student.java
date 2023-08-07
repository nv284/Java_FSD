package com.gen.day1;

public class Student {

	//instance variable 
	int rollno =200; 
	String name ;
	String subject ;
	
	//function 
	 void display_detail() {
		System.out.println("Student Name - "+name +" Roll_no - "+rollno+" Subject -"+subject);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Student s1 = new Student(); // Initialization 
     
     s1.display_detail();
	}

}
