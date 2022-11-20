package leetcode;

public class HappyNumber {

	public static boolean isHappy(int n) {
		boolean isHappy=true;
		int res=0;
		res=happySum(n);
		while(res!=1) {
			System.out.print("hi ");
			if(res==7) {
				//do nothing since 7 is a happy below 10 
			}
			else if((res%10==res&&res!=1)||res==0||(res%10==res&&res!=7)) {
				//without this condition loops infinitely
				isHappy=false; 
				break;
			}
			System.out.println(res);
			res=happySum(res);
		}
		
		return isHappy;
    }
	public static int happySum(int res) {
		int sum=0,temp=res,rem=0;
//		String s=String.valueOf(res);
//		System.out.println(s);
//		int cnt=0; 
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='1') cnt++;
//		}
//		if(s.length()==cnt)
//			return 1;
		while(res>0) {
			rem=res%10;
			sum+=(rem*rem);
			res/=10;
			if(sum==1 && res<=0) {
				temp=sum;
				break;
			}
			temp=sum;
			System.out.println(temp+" res "+res);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		System.out.println(isHappy(1111111));
		System.out.println(isHappy(19));
	}
}
