package week3;

public class CountPrefixes2255 {

	public static int countPrefixes(String[] words, String s) {
        int ans=0;
        for(int i=0;i<words.length;i++) 
        	if(s.startsWith(words[i])) ans++;
        return ans;
    }
	public static void main(String[] args) {
		String[] word= {"a","b","c","ab","bc","abc"};
		System.out.println(countPrefixes(word, "abc"));
	}
}
