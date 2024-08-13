package com.Logesh;
class Vehicles{
	void noOfEngine() {
		System.out.println("One Engine");
	}
	
}
class Scooty extends Vehicles{
	void noOfWheels() {
		System.out.println("Two wheels");
	}
}
class Bike2 extends Vehicles{
	void brandName() {
		System.out.println("Honda");
	}
}

public class Hierarical_Inheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike2 bike = new Bike2();
		
		bike.brandName();
		bike.noOfEngine();
		
		Scooty scooty = new Scooty();
		scooty.noOfWheels();
		scooty.noOfEngine();
	}
}
