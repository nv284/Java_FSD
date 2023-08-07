package com.gen.day1;

public class Product {

	int pid ; String pname ;  int price ;
	
	public Product(int pid, String pname, int price) {//2
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	void prod_info() { //3
		System.out.println("Product name -" +pname);
		System.out.println("Product code -"+pid);
		System.out.println("Product price -"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product digi = new Product(123, "Laptop", 45000); //Argument const  1
        digi.prod_info();//4
	}

}
