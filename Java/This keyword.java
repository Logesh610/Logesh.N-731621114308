package com.Logesh;

public class this_Keyword {
           String name;
           this_Keyword(String name){
        	   this(10,20);
        	   this.name = name;
        	   this.greeting();
           }
           this_Keyword(int a,int b){
        	   System.out.println("Addition :" +(a+b));
           }
           void greeting() {
        	   System.out.println("Welcome "+ name);
           }
	public static void main(String[] args) {
		this_Keyword obj = new this_Keyword("Logesh");
		

	}

}
