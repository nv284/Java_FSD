package com.gen.day2;

public class DemoStatic {

	int Empid ; String empName ; int sal; 
	static String Company = "Gen"; //class area 
	static void changeName() {
		Company = " NewGen ";
	}
	
	
	public DemoStatic(int empid, String empName, int sal) {
		super();
		Empid = empid;
		this.empName = empName;
		this.sal = sal;
		//Company = company;
	}

void display() {
	System.out.println(Empid+"  "+empName+"   "+sal+"   "+Company);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoStatic.changeName();
DemoStatic e1 = new DemoStatic(1, "Sourabh", 40000);
DemoStatic e2 = new DemoStatic(2, "Amit", 40000);//e1 , e2 , e3 , e4 store in the stack memory 

DemoStatic e3 = new DemoStatic(3, "Shreya", 40000);

DemoStatic e4 = new DemoStatic(11, "Om", 40000);//11, "Om", 40000 will store in the heap memory 
e1.display();e2.display();e3.display();e4.display();



	}

}
