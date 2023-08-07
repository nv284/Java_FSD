package com.gen.day6;

import java.util.ArrayList;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(101, "A", 20);
		Employee e1 = new Employee(103, "A", 20);
		Employee e2 = new Employee(104, "A", 20);
		Employee e3 = new Employee(105, "A", 20);
		
		ArrayList<Employee> s = new ArrayList<>();
		
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e);
		
	}

}
