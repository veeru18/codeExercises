package codes;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class BubbleSort {

	public static int[] bubSort(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
//					int temp;
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {

		int[] arr= {5,3,4,7,1};
//		Scanner s=new Scanner(System.in);
//		List<Integer> a=new ArrayList<>();
//		while(true) {
//			if(s.hasNextInt()) {
//				a.add(s.nextInt());
//			}else break;
//		}
//		s.close();
		bubSort(arr);
	}

}
