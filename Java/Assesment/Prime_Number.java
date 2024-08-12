package Assesment;
import java.util.*;
public class Prime_Number {
	public static void main(String[] args) {
		Scanner log= new Scanner (System.in);
		System.out.println("Enter the number:");
		int n = log.nextInt();
		int count =0;
		for(int i =1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		
		}
        if(count==2) {
			
			System.out.println("Prime Number");
		}
		else {
			
			System.out.println("Not A Prime Number");
		}
		
	}

}
