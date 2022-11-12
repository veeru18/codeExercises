package codes;

//import java.util.Arrays;

public class MoveToLast {

	public static int removeElement(int[] nums, int val) {
		int len=nums.length,k=0;
		String s="";
		for(int i=0;i<=len-1;i++) {
			if(nums[i]!=val) {
				nums[k]=nums[i];
				k++;
			}
		}
		for(int i=0;i<len;i++) s=s+" "+String.valueOf(nums[i]);
		System.out.println(s.trim());
		return k;
	}
	public static void main(String[] args) {
		int[] x= {2,3,6,7,3,1,2,3};
		System.out.println(removeElement(x, 3));
	}
}
