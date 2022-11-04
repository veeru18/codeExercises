package codes;

public class LargestInt {

	public static void main(String[] args) {
		int[] x= {12,4,5,7,2,9};
		largest(x);
	}
	public static void largest(int[] n) {
		int len=n.length;
		for(int i=0;i<=len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(n[j]>n[j+1]) {
					n[j]=n[j]^n[j+1];
					n[j+1]=n[j]^n[j+1];
					n[j]=n[j]^n[j+1];
				}
			}
		}
		System.out.println(n[len-1]);
	}
}
