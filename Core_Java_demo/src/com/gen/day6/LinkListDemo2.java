package com.gen.day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list = new LinkedList<String>(); // an empty list.

		// Adding elements in the list. 
		    list.add("Red"); 
		    list.add("Yellow"); 
		    list.add("Green"); 
		    list.add("White"); 
		    
		    System.out.println(list);
		    
		    System.out.println("Iterator ");
		    
		    Iterator<String> itr = list.iterator();
		    while(itr.hasNext()) {
		    	Object obj =itr.next();
		    	System.out.println(obj);
		    	
		    }
		    
		    ListIterator< String > lst = list.listIterator();
		    while(lst.hasNext()) {
		    	Object obj =lst.next();
		    	System.out.println(obj);
		    	
		    }
		    
	}

}
