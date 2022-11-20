package leetcode;

public class AddDigits {

	public static int addDigits(int num) {
		if(num==0) return 0;
		else if(num%9==0) return 9;
		return num%9;
//		wiki from hints
		
//		int sum=0;
//		while(num>0) {
//			int rem=num%10;
//			sum+=rem;
//			num/=10;
//		}
//		if (sum<=9) return sum;
//		return addDigits(sum);
    }
	public static void main(String[] args) {
		System.out.println(addDigits(97513));
	}
}
