package codes;

import java.util.Scanner;

public class FibonacciRecur {

	private static int count;
	static int x=0,y=1,z;
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		count=s.nextInt();
		s.nextLine();
		if(count<=1) {
			System.out.println("0");
		}else {
			System.out.print(x+" "+y);
			count-=2;
			recurFibo(count);
		}
		System.out.println();
		s.close();
	}

	public static void recurFibo(int n) {
		
		while(count>0) {
			z=x+y;
			x=y;
			y=z;
			System.out.print(" "+z);
			count--;
			recurFibo(count);
		}
	}
}
