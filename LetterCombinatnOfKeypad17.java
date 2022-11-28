package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//done
public class LetterCombinatnOfKeypad17 {
//	81=3^4 or 144=3^2*4^2 combinations of characters

	public static List<String> letterCombinations(String digits) {
		List<String> keypadCombs=new ArrayList<>();
		if(digits=="")
		return keypadCombs;
		HashMap<Integer, String> chars=new HashMap<>();
//		int[] val=new int[digits.length()];
//		int j=0;
//		for(int i=0;i<digits.length();i++) val[j++]=(int) digits.charAt(i)-48;
		for(int i=2;i<10;i++) {
			switch(i) {
			case 2: chars.put(i, "abc");break;	case 3: chars.put(i, "def");break;
			case 4: chars.put(i, "ghi");break;	case 5: chars.put(i, "jkl");break;
			case 6: chars.put(i, "mno");break;	case 7: chars.put(i, "pqrs");break;
			case 8: chars.put(i, "tuv");break;	case 9: chars.put(i, "wxyz");break;
			default: break;
			}
		}
		String p,q,r,s;
		if(digits.length()==1) {
			p=chars.get(digits.charAt(0)-48);
			for(int pont1=0;pont1<p.length();pont1++) {
				keypadCombs.add(""+p.charAt(pont1));
			}
		}else if(digits.length()==2) {
			p=chars.get(digits.charAt(0)-48); q=chars.get(digits.charAt(1)-48);
			for(int pont1=0;pont1<p.length();pont1++) {
				for(int pont2=0;pont2<q.length();pont2++) {
					String temp=""+p.charAt(pont1)+q.charAt(pont2);
					keypadCombs.add(temp);
				}
			}
		}else if(digits.length()==3) {
			p=chars.get(digits.charAt(0)-48); q=chars.get(digits.charAt(0)-48);
			r=chars.get(digits.charAt(0)-48);
			for(int pont1=0;pont1<p.length();pont1++) {
				for(int pont2=0;pont2<q.length();pont2++) {
					for(int pont3=0;pont3<r.length();pont3++) {
					String temp=""+p.charAt(pont1)+q.charAt(pont2)+r.charAt(pont3);
					keypadCombs.add(temp);
					}
				}
			}
		}else if(digits.length()==4) {
			p=chars.get(digits.charAt(0)-48); q=chars.get(digits.charAt(1)-48);
			r=chars.get(digits.charAt(2)-48); s=chars.get(digits.charAt(3)-48);
			for(int pont1=0;pont1<p.length();pont1++) {
				for(int pont2=0;pont2<q.length();pont2++) {
					for(int pont3=0;pont3<r.length();pont3++) {
						for(int pont4=0;pont4<s.length();pont4++) {
							String temp=""+p.charAt(pont1)+q.charAt(pont2)+r.charAt(pont3)+s.charAt(pont4);
							keypadCombs.add(temp);
						}
					}
				}
			}
		}
		return keypadCombs;
    }
	public static void prints(int[] a) {
		for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println(letterCombinations("2379"));
	}
}
