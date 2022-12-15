package week5;

public class ApplyOperations2460 {

	public static int[] applyOperations(int[] nums) {
		for(int i=0;i<nums.length-1;i++)
			if(nums[i]==nums[i+1]) {
				nums[i]*=2;
				nums[i+1]=0;
			}
		int move=0,zerCount=0;
		int[] temp=nums.clone();
		
		for(int i=0;i<temp.length;i++) {
			if(nums[i]==0) {
				zerCount++;
			}
			else {
				temp[move++]=nums[i];
			}
		}
		for(int i=nums.length-zerCount; i<nums.length;i++) 
			temp[i]=0;
//		for(int i:temp) System.out.print(i+" ");
//		System.out.println();
//		for(int i:nums) System.out.print(i+" ");
//		System.out.println();
		return temp;
    }
	public static void main(String[] args) {

		int[] nums = {1,2,2,1,1,0};
		System.out.println(applyOperations(nums));
		int[] blank=applyOperations(nums);
		for(int i:blank) System.out.print(i+" ");
	}

}
