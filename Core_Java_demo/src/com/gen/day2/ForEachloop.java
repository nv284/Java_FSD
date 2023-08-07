package com.gen.day2;

/*feature is specially designed to retrieve elements of the array efficiently rather than using array indexes.
 * Java for-each loop can also be used to retrieve elements of a collection.
 * for(Type identifier : Expression){
 * type = datatype 
 * identifier = name of an iteration 
 * expression = object of Iterable interface
 * }
 * */

public class ForEachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name[] = {"Apple" ,"Mango" , "Barry" , "Guava" ,"Melon"};
System.out.println("Print it ...");
for(String x : name) {
	System.out.println(x);
}
	}

}
