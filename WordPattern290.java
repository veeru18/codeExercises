package week6n7;

import java.util.HashMap;
import java.util.Map.Entry;

public class WordPattern290 {

	public static boolean wordPattern(String pattern, String s) {
		String[] words=s.split(" ");
		if(pattern.length()!=words.length) return false;
		HashMap<Character, String> ch=new HashMap<>();
		for(int i=0;i<pattern.length();i++) {
			if(!(ch.containsKey(pattern.charAt(i)))&& !(ch.containsValue(words[i]))) 
				ch.put(pattern.charAt(i), words[i]);
			else if(ch.containsKey(pattern.charAt(i))&& !(ch.containsValue(words[i]))) 
				return false;
			else if(!(ch.containsKey(pattern.charAt(i)))&& (ch.containsValue(words[i]))) 
				return false;
			else {
				String word=words[i];Character c='\0';
				for(Entry<Character, String> e:ch.entrySet()) {
					if(word.compareTo(e.getValue())==0) {
						c=e.getKey();break;
					}
				}
				if(pattern.charAt(i)!=c) return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {

		System.out.println(wordPattern("aba", "dog cat cat")); //false
		//"abba" "dog cat cat cat fish" gives false
	}

}
