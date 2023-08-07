package com.gen.day8;
import java.util.*;
public class MainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(10);pq.add(5);pq.add(12);pq.add(13);pq.add(6);
		System.out.println("Head "+pq.element());
		System.out.println("Head : "+pq.peek());
		System.out.println("iterating the pq elements ");
		Iterator< Integer>itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println(" After removing two elements "+pq);
		Iterator<Integer> itr2 = pq.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
