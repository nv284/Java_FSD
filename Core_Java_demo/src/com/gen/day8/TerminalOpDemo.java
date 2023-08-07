package com.gen.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream.of("A","B","C").parallel().forEach(x->System.out.println("forEach: "+x));
		
		Stream.of("A","B","C").parallel().forEachOrdered(x-> System.out.println("foreachordered "+x));
		
		List<Integer> evenList = Stream.of(1, 2, 3, 4, 5).filter(x-> x%2 ==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		final List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 1, 3, 4, 2));
		final long count = list1.stream().count();
		System.out.println(" Count - "+count);
		
		
		final int red = list1.stream().reduce(0, (value,sum)->sum =sum+value);
		System.out.println(" Sum - "+red);
				
	}

}
