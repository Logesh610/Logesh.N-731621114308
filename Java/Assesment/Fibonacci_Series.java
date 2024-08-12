package Assesment;
public class Fibonacci_Series {
	  public static void main(String[] args) {

	    int n = 10, n1 = 0, n2 = 1;
	   // System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(n1 + ",");

	      // compute the next term
	      int n3 = n1 + n2;
	      n1= n2;
	      n2 = n3;
	      System.out.print(" ");
	    }
	  }
	}