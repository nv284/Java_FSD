package com.gen.day5;

public class SBIBank implements RBIinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIBank b1 = new SBIBank();
		System.out.println(" Rate of int ="+ b1.rateOfInt(8.2f));
		b1.rulesOfRBI();

	}

	@Override
	public float rateOfInt(float p) {
		// TODO Auto-generated method stub
		float x= 2.0f;
		 x = x+p;
		return x;
	}

}
