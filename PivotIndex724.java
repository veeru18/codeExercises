package week6n7;

public class PivotIndex724 {

	public static int pivotIndex(int[] nums) {
		//crct thats in comments but time limit exceeded
		int pivot=-1,len=nums.length;
		for(int i=0;i<len;i++) {
			int left=0,right=0;
			for(int j=i+1;j<len;j++) left+=nums[j];
			for(int k=0;k<i;k++) right+=nums[k];
			if(left==right) return i;
		}
		return pivot;
//inside 1st for loop only these 2 lines
//		leftSum[i]=Arrays.stream(Arrays.copyOfRange(nums, 0, i)).sum();
//		rightSum[i]=Arrays.stream(Arrays.copyOfRange(nums, i+1, len)).sum();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m= {2,1,-1};
		System.out.println(pivotIndex(m));
	}

}
