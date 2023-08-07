package com.gen.day7;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        // lower , ceiling , floor , poolfirst , polllast  , headSet() , tailset , subset 
        System.out.println("Using higher: " + numbers.higher(4));
        
        System.out.println("TreeSet "+numbers);
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed ?"+value1);
        
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("TreeSet using Iterator: ");
        while(iterate.hasNext()) {
        	System.out.println(iterate.next());
        	System.out.println(",");
        }
        System.out.println("Using subset boolean value = "+numbers.subSet(4, 6));
        System.out.println("subset2 "+numbers.subSet(2, false, 6, true));
        
        
        
	}

}
