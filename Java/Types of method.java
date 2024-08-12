package com.Logesh;
//Types of Methods in java
public class method_Types {
	void myMethod1() {
		System.out.println("Instance method");
	}
     static void myMethod2() {
    	 System.out.println("Static Mthod");
     }
     static void myMethod3() {
    	 System.out.println("LOGESH");
     }
	public static void main(String[] args) {
		method_Types obj = new method_Types();
		obj.myMethod1();

		method_Types.myMethod2();
		method_Types.myMethod3();
	}

}
