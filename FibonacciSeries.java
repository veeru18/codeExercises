package codes;

import java.util.Scanner;

public class FibonacciSeries {

	public static void fibonacci(int n) {
		int n1=0,n2=1,n3;
		if(n<=1) {
			System.out.println(n1);
			return;
		}
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fibonacci(n);
		s.close();
	}
}
