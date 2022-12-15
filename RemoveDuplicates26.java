package week5;

import java.util.Arrays;

public class RemoveDuplicates26 {

	public static int removeDuplicates(int[] nums) {
//		//not mine
//		for(int tail = 1, head = 0; ; tail++)
//            if(tail >= nums.length) return ++head;
//            else if(nums[head] != nums[tail]) nums[++head] = nums[tail];
		
		int[] temp=new int[nums.length];
		temp=Arrays.stream(nums).distinct().toArray();
		for(int i=0;i<temp.length;i++) nums[i]=temp[i];
		return temp.length;
    }
	public static void main(String[] args) {
		int[] n={1,1,3,3,4,9,32};
		System.out.println(removeDuplicates(n));
		for(int i:n) System.out.print(i+" ");
	}
}
