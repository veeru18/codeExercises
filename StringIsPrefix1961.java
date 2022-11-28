package week3;

public class StringIsPrefix1961 {

	public static boolean isPrefixString(String s, String[] words) {
		int i=0;
		if(s.equals(words[0])) return true;
		String temp="";
		while(i<words.length) {
			if(s.startsWith(temp)) {
				temp+=words[i];	
				if(temp.equals(s)) return true;
			} ++i;
		}
		return false;
    }
	public static void main(String[] args) {
		String[] words= {"a","a","a","a","a"};
		System.out.println(isPrefixString("aaaaaaa", words));
	}
}
