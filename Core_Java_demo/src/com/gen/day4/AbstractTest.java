package com.gen.day4;

 abstract class Hello {
	 public void m1() {System.out.println(" Hello abstract class");} //non abstract method 
	 abstract public void m2();//abstract method 
 }

abstract class Welcome extends Hello {
	private String name; 
	  private int id; 
	  
	public Welcome(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	void disp() {System.out.println("Non abstract method from welcome class");}
	abstract public void m3();
	
}

public class AbstractTest extends Welcome {

	public AbstractTest(String name, int id) {
		super(name, id);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AbstractTest test = new AbstractTest("Abstratc", 2);
 test.m1();test.m2(); test.m3();test.disp();
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(" overriding m2 ");
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println(" overriding m3 ");
	}

}
