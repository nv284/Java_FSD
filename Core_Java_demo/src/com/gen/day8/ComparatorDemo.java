package com.gen.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo  {
	
	public static void sortByName(List<SuperHero> super1) {
		Comparator<SuperHero> nameCom = (SuperHero s1 , SuperHero s2) -> 
		{return s1.getName().compareTo(s2.getName());};
		super1.sort(nameCom);
		
	}
	public static void sortByAge(List<SuperHero> super2) {
		Comparator<SuperHero> byAge = (SuperHero a1 , SuperHero a2 )->{
			return a1.getAge() - a2.getAge();
		};
		super2.sort(byAge);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<SuperHero> superhero = new ArrayList<>();
superhero.add(new SuperHero("8", "Iron Man", 35));
superhero.add(new SuperHero("1", "Captain America", 25));
superhero.add(new SuperHero("3", "Hulk", 23));
System.out.println(" Using  Comparator ");
System.out.println(" Sorting By Name Ascending...");
sortByName(superhero);
superhero.forEach(ss ->System.out.println(superhero.toString()));

System.out.println("");

System.out.println(" Sorting By Age Ascending .....");
sortByAge(superhero);
superhero.forEach(ss2->System.out.println(superhero.toString()));



	}

	
	
	

}
