package com.gen.day2;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee No Arg");
	}
	Employee(String name ){
		System.out.println("Employee Name -"+name);
	}
	Employee(String nCompany , int id){
		System.out.println("Company Name -"+nCompany);
		System.out.println("Employee ID -"+id);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1 = new Employee();
Employee emp2 = new Employee("Atul");
Employee emp3 = new Employee("Gen", 123);
	}

}
