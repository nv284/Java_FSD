package com.gen.day8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> greets = Arrays.asList("Hi", "Hey", "Hello");
		Consumer<String> c = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		
		greets.forEach(c);
	}

}
