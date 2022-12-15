package week4;

public class SearchInsert35 {

	public static int searchInsert(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) 
			if(nums[i]>=target) return i;
		return nums.length;
    }
	public static void main(String[] args) {
		int[] n= {1,3,5,6};
		System.out.println(searchInsert(n, 2));
	}
}
