package com.gen.day7;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet<String> lhset = new LinkedHashSet<>();
		  lhset.add("New York");
		  lhset.add("Dhanbad");
		  lhset.add("Sydney");
		  lhset.add("Cape Town");
		  lhset.add("London");
		  
		  System.out.println(lhset);
		  
		  Iterator<String> itr = lhset.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		  System.out.println();
	}

}
