package com.gen.day5;

public class NestedTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = " Java Core SE8";
int x[]= {0,1,2,3,4};
int p =0;
try {//outer try 
	str = null ; 
	int len = str.length();
	System.out.println(" String length = "+len);
	
	    try {//inner try 
	    	int y = 3;
	    	System.out.println(x[y]);
	    	
	    	    try { // super inner try 
	    	    	System.out.println(x[4]/p);
	    	        }catch (ArithmeticException e) {
						// TODO: handle exception
	    	        	System.out.println(" Do not divide by zero");
					}
	    	
	             }catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
	        	System.out.println(" Check th array index ");
			}
}catch (NullPointerException e) {
	// TODO: handle exception
	System.out.println(" Put the value in string ");
}

	}

}
