package com.gen.day7;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> set = new LinkedHashSet<>();
set.add("A");
set.add("B");set.add("C");set.add("D");set.add("O");set.add(null);
System.out.println("Element in linkedhashset ="+set);
System.out.println(" Lest remove null = "+set.remove(null));
System.out.println(set.size() + "element in se");

LinkedHashSet<String> set2 = new LinkedHashSet<String>();
set2.add("S");
set2.add(null);
set.add("A");
set.add("B");

set.addAll(set2);
System.out.println(" afte adding set2 in set = "+ set);

set.retainAll(set2);
System.out.println("After removing common elements in set2 " + "from set, set is " + set);

int[] num = {20, 30, 50, 30, 40, 80, 10, 10};
ArrayList<Integer> ar = new ArrayList<Integer>();
for(int i =0;i<num.length ; i++) {
	ar.add(num[i]);
}
System.out.println("Original list "+ar);
LinkedHashSet< Integer> hs = new LinkedHashSet<>(ar);
System.out.println(" New List after removing duplicate numbers - "+hs);


	}

}
