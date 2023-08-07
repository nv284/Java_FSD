package com.gen.day8;
import java.util.*;


public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new LinkedList<>();
		boolean isEmpty = q.isEmpty();
		   System.out.println("Is queue empty: " +isEmpty);
		   
		   System.out.println("q.peek() "+q.peek()); //
		
		q.add("ABC");q.add("DEF");
		   q.add("GHI");
		   q.add("JKL");
		   q.add("MNO");
		  System.out.println("Elements in queue "+q);
		  System.out.println(" Head element = "+q.element()); // remove always perform from the head 
		  System.out.println("remove element = "+q.remove());
		  System.out.println("After removing element = "+q);
		  System.out.println("q.peek() "+q.peek());
		  System.out.println("q.poll() "+q.poll());
		  
		  boolean adde = q.offer("WER");
		  
		  System.out.println("lets add more element "+adde);
		  System.out.println(" after adding element "+q);
		
		
	}

}
