package week3;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargest215 {

	public static void main(String[] args) {

		int[] arr= {12,444,57,9,9,3,34,5,6};
		printArr(arr);
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		s.close();
		findKthLargest(arr, n);
		
	}

	public static void printArr(int[] n) {
		for(int i=0;i<n.length;i++) System.out.print(n[i]+" ");
		System.out.println();
	}
	public static int findKthLargest(int[] x,int k) {
		int len=x.length;
		Arrays.sort(x); 
		System.out.println("the "+k+"Th largest is "+x[len-k]);
		printArr(x);
		return x[len-k];
	}
}
