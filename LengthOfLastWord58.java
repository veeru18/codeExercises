package week3;

//done
public class LengthOfLastWord58 {

	public static int lengthOfLastWord(String s) {
		
//		String[] p=s.trim().split(" ");
//		System.out.println(slen);
//		for(String si:p) System.out.println(si);
		return s.trim().split(" ")[s.trim().split(" ").length-1].length();
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   fly me   to   the moon                                                  \n"));
	}
}
