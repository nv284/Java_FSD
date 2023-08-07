package com.gen.day3;

class PuneBank{
	private int accountNo;
	private int amt;
	private String contact;
	public int getAccountNo() {
		return accountNo;
	}
	//mutator
	public void setAccountNo(int accountNo) {
		if(accountNo == 12345) {
		this.accountNo = accountNo;}
		else {
			System.out.println("Account no is invalid");
		}
	}
	//access 
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PuneBank pb = new PuneBank();
pb.setAccountNo(1234); pb.setAmt(6789900);pb.setContact("Pune ShivajiNagar");

System.out.println("My Account no -"+pb.getAccountNo()+" locted in "+pb.getContact()+" holding the amount "+pb.getAmt());
	}

}
