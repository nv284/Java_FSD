package com.gen.day4;

//super
class Corejava{
	int jdkVersion;
	String typeOfApp ; 
	
	public Corejava(int jdkVersion, String typeOfApp) {
		super(); // java.lang.object
		this.jdkVersion = jdkVersion;
		this.typeOfApp = typeOfApp;
	}
	public void variable() {
		System.out.println(" Local , instance , static");
	}
	public void inheritance() {
		System.out.println("simple , multilevel, hybrid");
	}
	int javaVersion() {
		return 8;
	}
	
}
  //subclass or child class 
  class AdvanceJava extends Corejava{
    String applet , servlet , jsp;
	  int newVersion;
	public AdvanceJava(int jdkVersion, String typeOfApp , String applet , String servlet , int newVersion) {
		super(jdkVersion, typeOfApp); //corejava 
		// TODO Auto-generated constructor stub
		this.applet = applet;
		this.servlet = servlet;
		this.newVersion = newVersion;
				
	}
	int javaVersion() {
		super.javaVersion();
		return 20;
	}
	//method overriding 
	public void variable() {
		super.variable();
		System.out.println(" can define new variable and xml files ");
	}
	
}


public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  AdvanceJava obj = new AdvanceJava(8, "Servlet", "Applet7", "abc", 17);
  obj.variable(); // subclass 
  int x = obj.javaVersion();
  System.out.println("version =>"+x);
  obj.inheritance();
	}

}
