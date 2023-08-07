package com.gen.day2;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value , sum1 = 0 ; char choice ;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter any Integer value ");
			value = sc.nextInt();
			sum1 = sum1+value;
			System.out.println("Enter Y for Yes or N for no ");
			choice = sc.next().charAt(0);
		}while((choice=='y') || (choice=='Y'));
		System.out.println(" Sum of the int "+sum1 );
		
		
		
		
		
		
		
		int x = 10 , y=20;
		while (++x < --y) ;
			System.out.println("Mid value is "+ x);
	
int sum = 0, i=1;
while(i<=10) {
	sum = sum+i;
	i++;
}
System.out.println("Sum is = "+sum);
	}

}
