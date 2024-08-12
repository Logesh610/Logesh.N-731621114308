package Assesment;
import java.util.*;
public class Palindrome {
 public static void main(String[] args) {
	 Scanner log= new Scanner(System.in);
	String n = log.nextLine();
	 StringBuffer sb= new StringBuffer(n);
	 sb.reverse();
	 String n2 = sb.toString();
	 System.out.println(n2);
	 if(n2.equals(n)) {
		 System.out.println("It is a palindrome");
	 }
	 else {
		 System.out.println("It is not a palindrome");
	 }
 }
}
