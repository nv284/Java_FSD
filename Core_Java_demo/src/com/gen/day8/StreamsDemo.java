package com.gen.day8;
/*
 * Every element in the Collection has to be computed before it can
 *  be added to the Collection. While a Stream is conceptually a pipeline in which elements are computed on demand.
 *  
 *  terminal operation - return result of a curtain type 
 *  intermediate operation - return the stream itself so we can chain multiple methods in a row to
 *   perform the operation in multiple steps 
 *   
 *   stream operation perform sequentially or parallel 
 * */
import java.util.*;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream<Integer> s = Stream.of(1,2,3,4,5,6,7,8,9);
s.forEach(p->System.out.println(p));


Stream<Integer> s1 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
s1.forEach(p1->System.out.println(p1));

List<Integer> mylist = new ArrayList<Integer>();
for(int i =0;i<100 ; i++) mylist.add(i);

//seq stream 
Stream<Integer> seq = mylist.stream();

//parallel stream 
Stream<Integer> par = mylist.parallelStream();

Stream<String > s3 = Stream.generate(()->{return "Hello";});


System.out.println("================= Converting Stream to collection or array===============================");
Stream<Integer> con = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
List<Integer> l1 = con.collect(Collectors.toList());
System.out.println(l1);


Stream<Integer> intStream = Stream.of(1,2,3,4);
Integer [] intArray = intStream.toArray(Integer[]::new);
System.out.println(Arrays.toString(intArray));

//intermidate operation 



	}

}
