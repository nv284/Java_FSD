package com.gen.day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ls = new LinkedList<>();
ls.add("One");ls.add("Two");ls.add("Three");ls.add("Four");
ls.add("Five");ls.add(null);ls.add("One");

// at index 
ls.add(4,"Eight");
ls.addLast("Ten");ls.addFirst("Zero");
System.out.println(" List 1 ="+ls);

ArrayList<String >al = new ArrayList<>();
al.add("Twenty");al.add("Twenty-One");al.add("Twenty-three");
//linklist adding arraylist 
ls.addAll(al);

System.out.println(" List after adding arraylist element - "+ls);


Vector< String > v = new Vector<>();
v.add("Monday");v.add("tusday");v.add("Wednesday");v.add("Wednesday");v.add("Wednesday");v.add("Wednesday");

ls.addAll(v);

System.out.println(" List after adding vector element - "+ls);

LinkedList<String> list = new LinkedList<String>(); 

//Adding elements to the list. 
list.add("INDIA"); 
list.add("USA"); 
list.add("JAPAN"); 
list.add("UK"); 
list.add("CANADA"); 
System.out.println("Initial LinkedList order"); 
System.out.println(list); 

System.out.println(" My friends lives in "+list.get(3));
System.out.println(" My country "+list.getFirst() + "Is on the Top ");


list.peekFirst();//retrive the first element but nor remove 
list.pollFirst();//retrieves and removes the first element from the list

	}

}
