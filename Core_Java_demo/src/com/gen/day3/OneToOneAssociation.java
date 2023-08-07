package com.gen.day3;

class Person {
private	String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Address{
	private String state;
	private String city; private String zipcode;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}



public class OneToOneAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();    p1.setName("maya  ");
		Person p2 = new Person();     p2.setName("Shubh");
		
		Address a1 = new Address();a1.setCity("Mumbai");a1.setState("Maharashtra");a1.setZipcode("1234");
		Address a2 = new Address();a2.setCity("Chandigarh");a2.setState("Punjab");a2.setZipcode("4566");
		
		System.out.println(p1.getName() +"lives at address "+a1.getCity()+" ,"+a1.getState()+" ,"+a1.getZipcode());
		System.out.println(p2.getName()+" worked at address "+a2.getCity()+","+a2.getState()+","+a2.getZipcode());

	}

}
