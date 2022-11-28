package week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber268 {

	public static int missingNumber(int[] nums) {
		Set<Integer> num=new LinkedHashSet<>();
		for(int i=0;i<nums.length;i++) {
			num.add(nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			if(!num.contains(i)) return i;
		}
		return nums.length;
		
		//not mine but good one
//		int sum = 0;
//        for(int i = 0;i < nums.length;i++)
//            sum = sum + i - nums[i];
//        return sum + nums.length;
	}
	public static void main(String[] args) {
		int[] num= {0,1,2,4};
		System.out.println(missingNumber(num));
	}
}
