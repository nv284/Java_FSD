package com.gen.day7;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> h = new Hashtable<>();
		
		boolean check = h.isEmpty();
		
		System.out.println("Is Hashtable empty ->"+check );
		h.put(1, "One");
		h.put(2, "two");

		h.put(3, "three");

		h.put(4, "One");

		h.put(5, "five");
		
		System.out.println("Displaying entries in hash table: " +h);
		   int size = h.size();
		   System.out.println("Size of hash table: " +size);
		   
		   System.out.println(" Value of 3"+ h.get(2));
		   
		
	}

}
