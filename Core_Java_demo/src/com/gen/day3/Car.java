package com.gen.day3;

public class Car {
	//data member 
private int year ;
private String make;
private double speed;

public Car(int year, String make, double speed) {
	super();
	this.year = year;
	this.make = make;
	this.speed = speed;
}

public int getYear() {
	return year;
}

public String getMake() {
	return make;
}

public double getSpeed() {
	return speed;
}



}
