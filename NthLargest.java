package codes;

import java.util.Scanner;

public class NthLargest {

	public static void main(String[] args) {

		int[] arr= {12,444,57,9,3,34,5,6};
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		s.close();
		nthSort(arr, n);
		
	}

	public static void nthSort(int[] x,int n) {
		int len=x.length;
		for(int i=0;i<=len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(x[j]>x[j+1]) {
					x[j]=x[j]^x[j+1];
					x[j+1]=x[j]^x[j+1];
					x[j]=x[j]^x[j+1];
				}
			}
		}
//		sorting shud be done first by merge,quick or bubble or any other sort
		System.out.println(x[len-n]);
//		for smallest nth element
//		System.out.println(x[n-1]);
	}
}
