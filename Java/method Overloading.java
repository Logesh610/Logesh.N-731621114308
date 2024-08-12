package com.Logesh;

public class method_Overloading {
      void method_Overloading(String name) {
    	  System.out.println("Welcome : "+ name);
      }
      void method_Overloading(int n) {
    	  System.out.println("Sum : " + (n+n));
      }
      void method_Overloading(int a,int b) {
    	  System.out.println("Sum : "+ (a+b));
      }
      
      public static void main(String[] args) {
    	   method_Overloading obj= new method_Overloading();
    	   obj.method_Overloading(5); 	 
    	   obj.method_Overloading(10,20);
    	   obj.method_Overloading("Logesh");
    	   
    	 
      }
      
     
}
