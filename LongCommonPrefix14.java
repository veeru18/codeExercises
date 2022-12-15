package week4;

public class LongCommonPrefix14 {

	public static String longestCommonPrefix(String[] strs) {
		String temp="";
		int j=0;
		String begin=strs[0];
		while(j<begin.length()) {
			temp+=begin.charAt(j);
            for(int i=1;i<strs.length;i++) {
				if(!strs[i].startsWith(temp)) return temp.substring(0,temp.length()-1);
			}
			j++;
		}
		return temp;
    }
	public static void main(String[] args) {
//		String[] strs = {"plower","low","flight"}; //returns ""
		String[] strs = {"flower","flow","flight"}; //returns "fl"
		System.out.println(longestCommonPrefix(strs));
	}

}
