package com.gen.day2;

//parent class
class Student
{
	String stName; 
	int rollno; int std;

	public Student(String stName) {
		this(2);
		this.stName = stName;
	}
	public Student(int s) {
		// TODO Auto-generated constructor stub
		System.out.println("Delhi Public School");
	}
	public Student(String stName , int rollno , int std) {
		// TODO Auto-generated constructor stub
		this("DPS");
		this.stName=stName;
		this.rollno=rollno ; this.std=std;
	}
	void disp() {
		System.out.println("Name :"+stName);
		System.out.println("RoolNo : "+rollno);System.out.println("Std :"+std);
	}
}

//child class 
public class School extends Student{
	

	public School() {
		super("Ritu", 222, 7);//will call super class constructor with passing three argument values 
		
	}
	
	public School(String stName) {
		this();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    School sc = new School("DPS");
    sc.disp();
	}

}
