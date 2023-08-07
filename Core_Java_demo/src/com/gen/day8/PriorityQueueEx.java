package com.gen.day8;
import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> pq = new PriorityQueue<>();
pq.offer("USA");
pq.offer("India");pq.offer("England");pq.offer("Germany");pq.offer("Australia");
System.out.println(" Element in queue - "+pq);

while(pq.peek()!=null) {
	System.out.println("Head element = "+pq.peek());
	System.out.println("Removed element from queue - "+pq.remove());
	System.out.println("Priority queue - "+pq);
}
	}

}
