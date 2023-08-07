package com.gen.day1;

public class TypeCastingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" Widining Type Casting ");
System.out.println("========================");
int x = 100 ; 

long y = x;
System.out.println(" Y = "+y);
double d = y ; 
System.out.println(" widening = "+d);
System.out.println(" Narrowing Type Casting ");
System.out.println("========================");
double dd = 101.225 ;
short s = (short) dd;
int i = (int) dd;
System.out.println(" double to short"+s);
System.out.println("double to int "+i);

System.out.println(" LossyCasting ");
System.out.println("========================");
long l = 2147483648L; 
int i1 =  (int) l;
System.out.println("value of i = "+i1);
float f = 34.56f;
long g = (long) f;








	}

}
