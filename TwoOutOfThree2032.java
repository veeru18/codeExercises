package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//done 

public class TwoOutOfThree2032 {
	public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		List<Integer> distincts=new ArrayList<>();
		Set<Integer> set1=new HashSet<>(),set2=new HashSet<>(),set3=new HashSet<>(),temp=new HashSet<>();
		for(int i:nums1) set1.add(i);
		for(int i:nums2) set2.add(i);
		for(int i:nums3) set3.add(i);
		temp.addAll(set1);
		temp.retainAll(set2);
		if(temp.size()>0) {
			Iterator<Integer> i=temp.iterator();
			while(i.hasNext()) distincts.add(i.next());
		}
		temp.clear();
		temp.addAll(set2);
		temp.retainAll(set3);
		if(temp.size()>0) {
			Iterator<Integer> i=temp.iterator();
			while(i.hasNext()) distincts.add(i.next());
		}
		temp.clear();
		temp.addAll(set1);
		temp.retainAll(set3);
		if(temp.size()>0) {
			Iterator<Integer> i=temp.iterator();
			while(i.hasNext()) distincts.add(i.next());
		}
		temp.clear();
		Iterator<Object> i=Arrays.stream(distincts.toArray()).distinct().iterator();
		distincts.clear();
		while(i.hasNext()) distincts.add((Integer) i.next());
		return distincts;
    }
	public static void main(String[] args) {
		int[] n= {3,1},p= {1,2},u= {2,3};
		System.out.println(twoOutOfThree(p, n, u));
	}
}
