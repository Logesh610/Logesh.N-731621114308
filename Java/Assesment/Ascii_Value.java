package Assesment;
import java.util.*;
public class Ascii_Value {
	public static void main(String []jh){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the char:");
		char c1=sc.next().charAt(0);
		System.out.println("enter the char 2:");
		char c2=sc.next().charAt(0);

		//assigning to var
		/*
		int n1 = c1;
		int n2 = c2;

		*/
		int n1=(int)c1;
		int n2=(int)c2;
		System.out.println(n1);
		System.out.println(n2);

		}
}
