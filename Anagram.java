package leetcode;

import java.util.HashMap;

public class Anagram {

	public static boolean isAnagram(String s, String t) {
		if(s==null&&t==null) return true;
		if(s==null||t==null) return false;
		int slen=s.length(),tlen=t.length();
		if(slen!=tlen) return false;
		HashMap<Character, Integer> chars=new HashMap<>();
		for(int i=0;i<slen;i++) {
			char schar=s.charAt(i),tchar=t.charAt(i);
			Integer current=chars.get(schar);
//			System.out.println("s "+current);
			if(current==null)
				current=0;
			chars.put(schar, current+1);
			
			current=chars.get(tchar);
//			System.out.println("t "+current);
			if(current==null)
				current=0;
			chars.put(tchar, current-1);
		}
		for(Integer i:chars.values()) {
//			System.out.print(i+" ");
			if(i!=0) return false;
		}
		return true;
		
    }
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram","namgara"));
	}
}
