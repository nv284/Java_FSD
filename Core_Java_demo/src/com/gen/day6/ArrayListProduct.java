package com.gen.day6;
import java.util.*;

public class ArrayListProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    ArrayList< String> p = new ArrayList<>(); //list1 
    p.add("Laptop"); //0
    p.add("Mouce");//1
    p.add("Ipad");//2
    p.add("Monitor");//3
    p.add(2, "charger"); //
    System.out.println(" product List "+p);
    
    
    ArrayList<String> p1 = new ArrayList<>();//list2
    
    p1.add("Blue");p1.add("Pink");p1.add("White");p1.add("Green");
    System.out.println(" Colors "+p1);
    
    p.addAll(1, p1); // adding list 2 into list 1 
    
    System.out.println(p);
    
		
	}

}
