package com.gen.day7;
import java.util.*;
import java.util.Map.Entry;

public class HashMapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hm = new HashMap<>(); // initial capacity - 16 , default load balancer - 0.75 
                                               // thershold = 16 * 0.75 => 12 (rehashing) 

hm.put(1, "Java");
hm.put(2, "Javascript");
hm.put(3, "Kotlin");
hm.put(4, "GoLang");
hm.put(5, null);
hm.put(6, null);

hm.replace(5, "Anguler");
hm.put(6, "React");
HashMap<Integer, String> hMap1 = new HashMap<>(10 ); // 10 *0.75 = > 
HashMap<Integer, String> hMap2 = new HashMap<>(5, 0.5f);//2.5f
hMap1.put(1, "Java");
hMap1.put(2, "C");
hMap1.put(3, "Python");

hMap2.put(4, "Javascript");
hMap2.put(5, "Kotlin");
hMap2.put(6, "Go");

System.out.println("HashMap hMap1 : "
		+ hMap1);

System.out.println("HashMap hMap2 : "
		+ hMap2);


Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();

while(itr.hasNext()) {
	Object key = itr.next();
	System.out.println(key);
}

System.out.println(" key ");
Iterator<Integer> itr1 = hm.keySet().iterator();

while(itr1.hasNext()) {
	Object key = itr1.next();
	System.out.println(key);
}





	}

}
