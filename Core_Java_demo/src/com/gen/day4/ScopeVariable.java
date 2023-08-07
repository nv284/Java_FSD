package com.gen.day4;

public class ScopeVariable {
	
	
	
	//instance variable 
	public int rollno;
	public String name ;
	public int total_marks;
	public int number ;
	
	//static or class variable 
	public static int redius;
	
	public static final double pi = 3.14;

	public ScopeVariable(int rollno, String name, int total_marks, int number) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.total_marks = total_marks;
		this.number = number;
	}

	public void calculate() {
		int height = 0; // local variable 
		height = height+150;
		System.out.println(" height is => "+height + "cm ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    //assigning value of radius
		redius = 3;
		//System.out.println(name.getClass().getName());
		
		System.out.println("Circum of circle is - "+2*pi*redius);
    
    //instance variable use to create  the object 
    ScopeVariable s2 = new ScopeVariable(123, "Neelam", 500, 98);
    System.out.println(s2.name+"  "+s2.rollno+"  "+s2.total_marks);//instance variable is accessible with the object 
    
    s2.calculate();
    //s2.height not possible because of local scope of height 
    
    System.out.println( s2 instanceof ScopeVariable);//true
    //System.out.println(s4 instanceof ScopeVariable);
    
	}

}
