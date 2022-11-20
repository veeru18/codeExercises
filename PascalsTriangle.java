package leetcode;

import java.util.*;

public class PascalsTriangle {

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> innerRes=new ArrayList<>();
		if(numRows==0)
			return null;
		innerRes.add(1);
		res.add(innerRes);
		System.out.println(res);
		if(numRows==1)	return res;
		int i=1;
		while(i<numRows) {
			i++;
			innerRes=pascal(innerRes);
			res.add(innerRes);
		}
		return res;
	}

	private static List<Integer> pascal(List<Integer> array) {
		List<Integer> arrays=new ArrayList<>();
		if(array.size()==1) {
			arrays.add(1);
			arrays.add(1);
			return arrays;
		}else {
			for(int i=0;i<array.size();i++) {
				if(i==0)arrays.add(1);
				else if(i==array.size()-1) {
					arrays.add((array.get(i-1))+1);
					arrays.add(1);
				}
				else
					arrays.add(array.get(i-1)+array.get(i));
			}
		}
		return arrays;
	}

	public static void main(String[] args) {
		System.out.println(generate(6));
	}
}
