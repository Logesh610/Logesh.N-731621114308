package com.Logesh;
class A{
	int a =10;
	A(String name){
		System.out.println("Welcome :"+name);
	}
	void myMethod1() {
		System.out.println("Super class");
	}
}
class B extends A {
	B(){
		super("Logesh");
	}
	void myMethod2() {
		System.out.println("Super Class variable : "+super.a);
		super.myMethod1();
	}
}
public class SuperClass_keyword {

	public static void main(String[] args) {
       B b = new B();
       b.myMethod2();
	}

}
