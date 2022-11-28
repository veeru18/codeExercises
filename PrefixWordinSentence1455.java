package week3;

public class PrefixWordinSentence1455 {

	 public static int isPrefixOfWord(String sentence, String searchWord) {
		 int indx=-1;
		 String[] ins=sentence.split(" ");
		 for(int i=0;i<ins.length;i++) 
			 if(ins[i].startsWith(searchWord)) { indx=i+1; break; }
		 return indx;
	 }
	public static void main(String[] args) {
		System.out.println(isPrefixOfWord("nspect on intern dfipad", "in"));
	}
}
