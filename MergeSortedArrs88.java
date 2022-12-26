package week6n7;

import java.util.Arrays;

public class MergeSortedArrs88 {

	public static boolean merge(int[] nums1, int m, int[] nums2, int n) {
		if(m==0&&n!=0) {
            for(int i=0;i<n;i++) nums1[i]=nums2[i];
        }
//		for(int i:nums1) System.out.println(i);
//		for(int i:nums2) System.out.println(i);
        if(nums1.length<n) System.out.println("error");
        int j=0;
        for(int i=m;i<nums1.length;i++) {
        	if(j==nums2.length) break;
        	nums1[i]=nums2[j++];        	
        }
        Arrays.sort(nums1);
        return true;
    }
	public static void main(String[] args) {
		int[] x= {0},y= {1}; 
		System.out.println(merge(x, 0, y, 1));
//		for(int i:x) System.out.println(i);
//		for(int i:y) System.out.println(i);
	}
}
