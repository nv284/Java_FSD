package com.gen.day3;


import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		String cities[] = {"Delhi" , "ranchi" , "New York" , "Gaya" , "Capetown" , "tata Nagar"};
		
		 int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};  
		 int temp =0;
		 System.out.println(" Original array");
		 for(int i =0 ; i<intArray.length ;i++) {
				System.out.println(i +" "+intArray[i]);	}
		 //sorting
		 for(int i =0 ; i<intArray.length ; i++) {
			 for(int j =0 ; j<intArray.length ; j++) {
				 if(intArray[i] > intArray[j] ){
					 temp = intArray[i];
					 intArray[i] = intArray[j];
					 intArray[j] = temp;
				 }
			 }
		 }
		
		 System.out.println("\nArray sorted in ascending order: ");    
	        for (int i = 0; i <intArray.length; i++) {     
	            System.out.print(intArray[i] + " ");    
	        }  
		
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		System.out.println("orgonal order ");
		for(int i =0 ; i<cities.length ;i++) {
			System.out.println(i +" "+cities[i]);
			
		}
		Arrays.sort(cities);
		System.out.println(" ");
		System.out.println("sorted order ");
		for(int i =0 ; i<cities.length ;i++) {
			System.out.println(i +" "+cities[i]);
			
		}
	}
}
