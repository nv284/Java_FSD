package com.gen.day3;

public class TwoDimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[][] = {{1,2,3} ,{3,3,3} , {5,6,7}}; //3x3
		int y[][] = {{1,2,3,4} ,{3,3,3,3}};//2x4
		
		System.out.println(" Enter the value into 2D array name x ");
		
		for(int i =0 ; i<x.length;i++) {//for row 
			for(int j =0 ;j<x.length ;j++) {//for col
				System.out.print(x[i][j] +"\t");
			}
			System.out.println();
			
		}
	}

}
