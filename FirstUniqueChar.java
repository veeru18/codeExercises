package leetcode;

public class FirstUniqueChar {

	public static int firstUniqChar(String s) {
        int[] smallCase=new int[26];
        int indxOfChar=-1;
        for(int i=0;i<s.length();i++) smallCase[s.charAt(i)-97]++;
        printArr(smallCase);
        int i=0;
        while(i<s.length()) {
        	if(smallCase[s.charAt(i)-97]==1) indxOfChar=i; 
        	i++;
        	break;
        }
		return indxOfChar;
    }
	public static void printArr(int[] n) {
		for(int i:n) {
			System.out.print(i+" ");
		}System.out.println();
	}
	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
}
