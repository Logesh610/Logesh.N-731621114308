package com.Logesh;

class Vehicle{
	void noOfEngine() {
		System.out.println("One Engine");
	}
	
}
class TwoWheeler1 extends Vehicle{
	void noOfWheels() {
		System.out.println("Two wheels");
	}
}
class Bike1 extends TwoWheeler1{
	void brandName() {
		System.out.println("Honda");
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 bike = new Bike1();
		bike.noOfWheels();
		bike.brandName();
		bike.noOfEngine();
	}

}
