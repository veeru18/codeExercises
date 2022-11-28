package week3;

public class RunningSum1480 {

	public static int[] runningSum(int[] nums) {
        int[] news=new int[nums.length];
        news[0]=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            news[i]=sum;
        }
        return news;
    }
	public static void main(String[] args) {
		int[] ma= {232,23,67,21,2,5};
		for(int i:runningSum(ma)) {
			System.out.print(i+" ");
		}
	}
}
