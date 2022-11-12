package codes;

public class ArrayAsLargeIntPlusOne {

	public static int[] plusOne(int[] digits) {
		int len=digits.length,x=len-1;
		if(len==0) return null;
		int[] rem=new int[len+1];
		while(x>=0){
			if(digits[x]==9) {
				if(x==0) rem[x]=1;
				else rem[x]=0;
				digits[x]=0;
				x--;
			}
			else {
				digits[x]++;
				return digits;
			}
		}
		return rem;
	}
	
	public static void main(String[] args) {
		int[] ne= {8,9,9,9,9};
		int[] p=plusOne(ne);
		for(int i:p) {
			System.out.print(" "+i);
		}
	}
}
