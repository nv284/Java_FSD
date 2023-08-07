package com.gen.day2;

import java.util.Scanner;

/*switch(expression)
 * {
 * case value-1:
 *     stmt 
 *     break;
 *   case value- 2 :
 *     stmt
 *     break;
 *     def:
 * */
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  in = new Scanner(System.in);
		System.out.println(" Enter the Number ");
		Scanner  input = new Scanner(System.in);
		System.out.println(" Enter the code ");
		 int number =  in.nextInt();
		 int num1 = input.nextInt();
		 String Message ; 
		 
		 switch (number) {
		case 1:
			//Message="Hello One";
			switch (num1) {
			case 121:
				Message = "You are good ";
				break;

			default:
				Message = " Try again";
				break;
			}
			break;
       case 2:
    	   Message =" Welcome to";
    	   break;
       case 3:
    	   Message = " Using Switch case ";
    	   break;
		default:
			Message = "Sorry Please try another Number ";
			break;
		}
		 System.out.println("Message: " + Message);
	}

}
