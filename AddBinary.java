package codes;

public class AddBinary {

	public static String addBinary(String a, String b) {
		String s="";
		
		int p=1,q=1,res=0,sumA=0,sumB=0;
		System.out.println(a.length()-2); //for to reach 2 power 1 in binary
		for(int i=a.length()-2;i>=0;i--) {
			if(a.charAt(i)=='1') {
				sumA+=(Math.pow(2, p));
			}
			p++;
		}if(a.charAt(a.length()-1)=='1') sumA+=1;
		
		for(int i=b.length()-2;i>=0;i--) {
			if(b.charAt(i)=='1') {
				sumB+=(Math.pow(2, q));
			}
			q++;
		}if(b.charAt(b.length()-1)=='1') sumB+=1;
		res=sumA+sumB;
		System.out.println(sumA+" "+sumB+" "+res);
		s=Integer.toBinaryString(res);
		return s;
	}
	public static void main(String[] args) {
		//for large strings this wont work
		String s=(addBinary("101011101", "10101"));//349 + 21
		System.out.println(s);
	}

}
