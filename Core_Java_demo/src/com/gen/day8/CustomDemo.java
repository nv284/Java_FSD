package com.gen.day8;
import java.util.*;

class Demo implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		int value = o1.compareTo(o2);
		if(value >0) {
			return -1;
		}else if(value < 0) {
			return 1;
		}
		return 0;
	}
	
	
}


public class CustomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer> nums = new PriorityQueue<>(new Demo());

nums.add(4);nums.add(2);nums.add(1);nums.add(3);
while(!nums.isEmpty()) {
	System.out.println(nums.poll());
}
	}

}
