package com.gen.day7;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hset = new HashSet<>();
		hset.add(5); 
		   hset.add(10); 
		   hset.add(15); 
		   hset.add(20); 
		   System.out.println("initial list of element" +hset );
		   System.out.println(" Remove 10 from the set => "+ hset);
		   HashSet<Integer> hset2 = new HashSet<>();
		   hset2.add(10); 
		   hset2.add(25); 
		   hset.addAll(hset2);
		   
		   System.out.println(" Get the size of Hashset =>"+hset.size());
		   
		   if(hset.contains(40)) {
			   System.out.println(" present ");
			   
		   }else {
			  
			   System.out.println(" 40 is not in the set lets add this "+hset.add(40));
		   }
		   
		   
		
		
		
		
		
	}

}
