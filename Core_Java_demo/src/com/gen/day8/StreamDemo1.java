package com.gen.day8;
import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		list.stream().forEach(System.out::println);;
		
		final List<Integer> ans = list.stream().filter(value ->value %2 ==0).collect(Collectors.toList());
		
		System.out.println(" Even numbers list "+Arrays.toString(ans.toArray()));
				
		//sorted method 
		final List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 1, 3, 4, 2));
		
		System.out.println("Ascending order");
		list1.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n Descending order");
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		final List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,2,4,4,4,5,5,6,6,7,7,8,8,9));
		
	}

}
