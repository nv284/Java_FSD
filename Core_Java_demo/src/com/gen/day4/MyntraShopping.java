package com.gen.day4;

public class MyntraShopping implements HDFC ,Axis{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyntraShopping m = new MyntraShopping();
m.Aixspayment();
m.payment();
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println(" 8% discount on using HDFC payment option");
	}

	@Override
	public void Aixspayment() {
		// TODO Auto-generated method stub
		System.out.println(" 5% discount on using Axis payment option");
	}

}
