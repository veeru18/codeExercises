package codes;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemDup {

	public static void main(String[] args) {
		String s="Veereshv";
		remDup(s);
	}
	public static void remDup(String str) {
//		for(int i=0;i<=str.length()-1;i++) {
//			int flag=0;String s="";
//			for(int j=0;j<=str.length()-1;j++) {
//				if(i==j) continue;
//				else if(str.toLowerCase().charAt(i)==str.toLowerCase().charAt(j)) {
//					flag++;
//					break;
//				}
//			}if(flag==0) {
//				System.out.println(str.charAt(i));
//			}
//		}//gives 
		Set<Character> nonDuplicates=new LinkedHashSet<>();
		for(int i=0;i<=str.length()-1;i++) 
			nonDuplicates.add(str.toLowerCase().charAt(i));
		String nonDupString="";
		for(Character c:nonDuplicates) {
			nonDupString+=c;
		}System.out.println(nonDupString);
	}
}
