package com.gen.day8;
/*Comparable is an interface in Java 
 * provide comapareTo() to sort object 
 *  its a part of java.lang package
 *  it is used for natural or default ordering 
 *  it provide a single sorting seq.
 *  ex - sort by the id or by the name 
 *  it modifies the class that impliments it 
 * 
 * 
 * 
 * comparator is functional interface 
 *   provide compare() to sort object 
 *   is the part of java.util package 
 *   can be used for custom ordering 
 *   provide multiple sorting seq 
 *   ex- sort by both id and name 
 *   dosesn't modify any class 
 * 
 * 
 * 
 * */






@FunctionalInterface
public interface DemoInterface {
	
	void print() ;
	//default , static 

}
