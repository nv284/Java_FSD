package com.gen.day4;

public class AmazonShopping implements HDFC , Axis{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonShopping a = new AmazonShopping();
		a.payment();
		a.Aixspayment();

	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println(" 10% discount on using HDFC caredit card ");
	}

	public void Aixspayment() {
		// TODO Auto-generated method stub
		System.out.println(" 8% discount on using Axis caredit card ");
	}

}
