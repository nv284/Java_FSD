package com.gen.day3;

import com.gen.day1.Product;

class Student{
	String name ; int rollno ; int marks ;

	public Student(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}}


class product {
	int productid ; String productname;
	public product(int productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
	}
}


public class ArrStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p[] = new product[] {new product(1, "laptop") , new product(2, "Mobile"),new product(3, "ipad")}; 
		for(int i1 =0 ;i1< p.length ;i1++) {
			System.out.println("ProductName -> "+p[i1].productname+" ProductId -> "+p[i1].productid);
		}
		
		
		// st[] array store student objects 
Student st[]  = new Student[] {new Student("Anoop", 123, 78) , new Student("Rajat", 234, 99), new Student("Kamal", 456, 87)} ; 
for(int i =0 ;i< st.length ;i++) {
	System.out.println("Name -> "+st[i].name+" Rollno -> "+st[i].rollno+" marks ->"+st[i].marks);
}

	}

}
