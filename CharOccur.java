package codes;

import java.util.LinkedHashSet;
import java.util.Set;

public class CharOccur {

	public static void main(String[] args) {
		String p="googole ,";
		charOccurence(p);
	}
	
	public static void charOccurence(String s) {
		Set<Character> charSet=new LinkedHashSet<>();
//		for(int i=0;i<=s.length()-1;i++) charSet.add(s.charAt(i));
		int len=s.length();
		int[] arr=new int[256];
//		size of char
		for(int i=0;i<=len-1;i++) {
//			int flags=0;
//			for(int j=0;j<=len-1;j++) {
//				if(i==j) continue;
			if(!charSet.contains(s.charAt(i))) {
				charSet.add(s.charAt(i));
				arr[s.charAt(i)]++;
			}else if(charSet.contains(s.charAt(i))) {
				arr[s.charAt(i)]++;
			}
		}
//			arr[i]=flags;
//		}

		for(Character c:charSet) {
			System.out.println("\""+c+"\""+" has ocuured "+arr[c]+" times");
		}
	}
}
