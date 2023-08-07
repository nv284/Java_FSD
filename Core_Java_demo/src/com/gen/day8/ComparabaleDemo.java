package com.gen.day8;
import java.util.*;

class SuperHero implements Comparable<SuperHero>{
	private final String id;
    private final String name;
    private final int age;
	public SuperHero(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(final SuperHero o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}
	@Override
	public String toString() {
		return String.format("ID: %s | Name: %s | Age: %d", id, name, age);
	}
	
    
}




public class ComparabaleDemo {

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



Collections.sort(superhero);
superhero.forEach(superh -> System.out.println(superhero.toString()));

	}

}
