package Assesment;
import java .util.*;
public class Factorial {
	public static void main(String[] args){
	Scanner loge = new Scanner(System.in);
	int n=loge.nextInt();
	int fact=1;
	for(int i =1;i<=n;i++) {
		fact*=i;
	}
	System.out.println(fact);
	}
	
}
