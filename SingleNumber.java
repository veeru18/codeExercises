package leetcode;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		int res=-1;
        for(int i=0;i<nums.length;i++) {
        	int count=0;
        	for(int j=0;j<nums.length;j++) {
        		if(i==j) continue;
        		if(nums[i]==nums[j]) count++;
        	}
        	if(count==0) {
        		res=nums[i];
        		break;
        	}
        }
        return res;
    }
	
	public static void main(String[] args) {
		int[] num={1,4,1,2,2};
		System.out.println(singleNumber(num));
	}
}
