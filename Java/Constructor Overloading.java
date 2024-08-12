package com.Logesh;

public class constructor_Overloading {
	 //Constructor overloading
	constructor_Overloading(String name) {
  	  System.out.println("Welcome : "+ name);
    }
    
	constructor_Overloading(int a,int b) {
	  	  System.out.println("Sum : "+ (a+b));
	    }
	
	constructor_Overloading(int n) {
  	  System.out.println("Sum : " + (n+n));
    }
    
	
	public static void main(String[] args) {
		constructor_Overloading obj1 = new constructor_Overloading ("Logesh");
		constructor_Overloading obj2 = new constructor_Overloading (8);
		constructor_Overloading obj3 = new constructor_Overloading (10,20);

	}

}
