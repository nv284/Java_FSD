package com.gen.day1;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner  sc = new Scanner(System.in);
   
   System.out.println(" Enter the age ");
    int age = sc.nextInt();
    
    if(age <18 )
    	System.out.println("Child ");
    else if (age>=18)
    	System.out.println("Adult");
    else if(age>=60)
    	System.out.println("Senior");
    else
    	System.out.println("invalid age ");
	}

}
