package com.gen.day3;

class Address1{
	String city , state , country ;int pincode;

	public Address1(String city, String state, String country, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
}


public class AggegationDemo {
String name ; int rollNo ; int marks ;Address1 address; // these fileds can modify 

	public AggegationDemo(String name, int rollNo, int marks, Address1 address) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	this.marks = marks;
	this.address = address;
}
void display() {
	System.out.println("Name : "+name +"RollNo "+rollNo);
	System.out.println("Address");
	System.out.println(address.city+" "+address.country+" "+address.pincode);
	System.out.println("\n");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address1 ad1 = new Address1("Pune", "MH", "India", 123);
Address1 ad2 = new Address1("Mumbai", "MH", "India", 5677);

AggegationDemo d1 = new AggegationDemo("Rahul", 111, 89, ad1);
AggegationDemo d2 = new AggegationDemo("Siya", 22, 89, ad2);
d1.display();d2.display();
	}

}
