package week6n7;

import java.util.Arrays;

public class SortedSquares977 {

	public static int[] sortedSquares(int[] nums) {
		int[] n=new int[nums.length];
		
		for(int i=0;i<nums.length;i++) n[i]=nums[i]*nums[i];
		Arrays.sort(n);
		return n;
		
		//trying for O(n) soln.
//		int i=0,j=nums.length-1;
//		while(nums[i]<=0&&j>-1) {
//			int res=nums[i]*nums[i];
//			int revRes=nums[j]*nums[j];
//			if(res>revRes) {
//				n[j]=res;
//				i++;
//			}
//			j--;
//		}
		
		//not mine
//		Stack<Integer> s = new Stack<>();
//		int i = 0;
//		for (; i < A.length && A[i] < 0; ++i) { if (A[i] < 0) s.push(A[i] * A[i]); } // push negative square to stack.
//		Queue<Integer> q = new LinkedList<>();
//		while (i < A.length || !s.empty()) {
//			if (s.empty() || i < A.length && A[i] * A[i] < s.peek()) { q.offer(A[i] * A[i++]); } // A[i] * A[*] greater.
//			else { q.offer(s.pop()); } // square of negative number greater or equal.
//		}
//		return q.stream().mapToInt(k -> k).toArray();

    }
	public static void main(String[] args) {
		int[] n= {-4,-1,0,3,10};
		
//		System.out.println(n[0]); //gives 0
		int[] res=(sortedSquares(n));
		for(int i:res) System.out.print(" "+i);
	}
	
}
