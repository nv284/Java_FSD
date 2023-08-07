package com.gen.day3;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int num[] = new int[5];
    int sum = 0 ;
    System.out.println("Enter "+num.length+"integer values");// enter 5 int values 
    for(int i=0 ; i<num.length ; i++) {
    	num[i] = sc.nextInt();
    	sum = sum + num[i];
    	
    	//calculate the sum of int value 
    	
    	
    	 
    } System.out.println("sum "+sum);
  
    
	}

}
