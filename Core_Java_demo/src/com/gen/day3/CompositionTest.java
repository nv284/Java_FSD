package com.gen.day3;

class HumanBody{
	private String name;
	private int age;
	public HumanBody(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Heart{
	private  int heartRate;
	private  HumanBody human; // composition 
	public Heart(int heartRate, HumanBody human) {
		super();
		this.heartRate = heartRate;
		this.human = human;
	}
	public int getHeartRate() {
		return heartRate;
	}
	public HumanBody getHuman() {
		return human;
	}
	
}

public class CompositionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HumanBody h1 = new HumanBody("Alive", 50);
      Heart  heart = new Heart(72, h1);
      System.out.println("Person is healthy beacuse "+heart.getHeartRate() +" and "+h1.getName());
      
      
	}

}
