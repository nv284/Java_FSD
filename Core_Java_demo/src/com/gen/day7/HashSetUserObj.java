package com.gen.day7;

import java.util.HashSet;
import java.util.Objects;

class Student{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return  rollno;
	}
	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		return (this.rollno == other.rollno);
	}
	
}



public class HashSetUserObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(10, "Ram");
	    Student s2 = new Student(10, "Shyam");
	    Student s3 = new Student(20, "Sundar");
	    
	    HashSet<Student> studentData = new HashSet<>();
	    studentData.add(s1);
	    studentData.add(s2);
	    studentData.add(s3);
	    
	    for(Student s : studentData) {
	    	System.out.println(s.rollno +" "+ s.name);
	    }
	}

}
