package com.gen.day2;

//this -  it is used to call a constructor from within another constructor in the same class .

// super - it is used to call the parent(super) class constructor from within child (subclass) class constructor .
public class Developed {
	

	public Developed() {
		//1
	System.out.println("Java developed by James ");
	}
	public Developed( int year) {
		//2
		this("Java " , 1990);//calling const 2
		System.out.println("James is knows as father of java programing ");
	}
	public Developed(String name , int year ) {
		//3
		this();//----> calling const 1
		System.out.println("at sun Microsystem and released in 1995");
	}
	void display () {
		System.out.println("The java compiler is within th java but java runtime in ANSI C");
	}
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main(10);
		Developed obj = new Developed(1995);
		obj.display();
	}

}
