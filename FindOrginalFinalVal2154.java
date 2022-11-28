package week3;

public class FindOrginalFinalVal2154 {

	public static int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original) original=findFinalValue(nums, original*2);
        }
        return original;
    }
	public static void main(String[] args) {
		int[] nums={5,3,6,1,12};
		System.out.println(findFinalValue(nums, 3));
	}
}
