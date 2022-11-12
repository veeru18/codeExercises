package codes;

import java.util.Scanner;

public class BricksProbAnB {
	static int a=1,b=2;
	public static void bricksNum(int n) {
		if(n<=0) System.out.println("invalid");
		int rem=recurSub(n);
		System.out.println(rem+" a "+a+" b "+b);
		rem-=a;
		if(rem<=b&&rem>0) System.out.println("b takes the last "+rem+" bricks");
		else System.out.println("a takes the last "+rem+" bricks");
	}
	private static int recurSub(int n) {
		if(n-(a+b)>=0) 
			n=n-(a+b);
		else return n;
		++a;
		b=a*2;
		return recurSub(n);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		bricksNum(n);
		s.close();
	}
}