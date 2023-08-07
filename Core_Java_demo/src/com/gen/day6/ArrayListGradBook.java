package com.gen.day6;

import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListGradBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<>();
	      ArrayList<Double> grades = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String newstudent;
		
		System.out.println("Enter your students (or enter to finish):");
		
		// get the student 
		  do {
		         newstudent = input.nextLine();

		         if (!newstudent.equals("")) {
		            students.add(newstudent); // adding the name into arrylist 
		         }

		      } while(!newstudent.equals(""));
		
		//get the grads 
		  for (String student : students) {
		         System.out.print("Grade for " + student + ": ");
		         Double grade = input.nextDouble();
		         grades.add(grade); // marks into arraylist 
		      }
		
		//print
		  System.out.println("\nClass roster:");
	      double sum = 0.0;

	      for (int i = 0; i < students.size(); i++) {
	         System.out.println(students.get(i) + " (" + grades.get(i) + ")");
	         sum += grades.get(i);
	      }

	      double avg = sum / students.size();
	      System.out.println("Average grade: " + avg);
	}

}
