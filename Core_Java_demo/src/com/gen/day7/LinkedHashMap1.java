package com.gen.day7;
import java.util.*;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashMap<String , String > lhmap = new  LinkedHashMap<>(16, 0.75f,true);
		LinkedHashMap<String, String> lhmap2 = new LinkedHashMap<>(16, 0.75f, false);
		
		final int max = 5;	
		  LinkedHashMap<String, String> lhmap = new LinkedHashMap<String,String>() { 
		  protected boolean removeEldestEntry(Map.Entry<String, String> e)
		  { 
		    return size() > max; 
		  } 
		  };
		

lhmap.put("En", "English");
lhmap.put("Hi", "Hindi");
lhmap.put("Ta", "Tamil");
lhmap.put("De", "German");
lhmap.put("Fr", "French");
System.out.println(" Linkedhashmap => "+lhmap);
System.out.println("value to key =  "+lhmap.get("Hi"));


lhmap2.put("En", "English");
lhmap2.put("Hi", "Hindi");
lhmap2.put("Ta", "Tamil");
lhmap2.put("De", "German");
lhmap2.put("Fr", "French");

System.out.println(" replace -> "+lhmap.replace("En", "English-US"));
System.out.println(" Updated hashmap -> "+lhmap);

//removeeldestEntry()


	}

}
