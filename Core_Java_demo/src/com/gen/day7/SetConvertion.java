package com.gen.day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(); 
		   int size = list.size(); 
		   System.out.println("Size before adding elements: " +size); 
		   
		   list.add(5); 
		   list.add(10); 
		   list.add(5); 
		   list.add(15); 
		   list.add(20); 
		   list.add(10); 
		   list.add(20); 
		   list.add(30); 
		   System.out.println(" Arraylist => "+list);
		   
		   Set<Integer> s = new HashSet<Integer>(list);
		   
		   System.out.println(" Converted List =>"+s);
		   
		   
		   
		   
	}

}
