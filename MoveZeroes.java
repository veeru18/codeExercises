package leetcode;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		int j=0,zeroCount=0,len=nums.length;
        for(int i=0;i<len;i++) {
        	if(nums[i]==0) {
        		zeroCount++;	continue;
        	}
        	else nums[j++]=nums[i];
        }
        for(int i=len-zeroCount;i<len;i++) nums[i]=0;
    }
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,21};
		moveZeroes(nums);
		for(int i:nums)
		System.out.print(i+" ");
		
	}
}
