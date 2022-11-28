package week3;

//import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumber287 {

	public static int findDuplicate(int[] nums) {
		
		Set<Integer> num=new LinkedHashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(num.contains(nums[i])) return nums[i];
			num.add(nums[i]);
		}
		
//		due to time limit
//		HashMap<Integer, Integer> numMap=new HashMap<>();
//		for(int i=0;i<nums.length;i++) {
//			if(numMap.containsValue(nums[i])) return nums[i];
//			numMap.put(i,nums[i]);
//		}
		return 0;
	}
	public static void main(String[] args) {
		int[] nums= {1,35,24,35,2};
		System.out.println(findDuplicate(nums));
	}
}
