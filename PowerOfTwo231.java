package week6n7;

public class PowerOfTwo231 {

	public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        else{
        	double res=Math.log(Math.abs(n))/Math.log(2);
        	double res1=(int)(Math.log(Math.abs(n))/Math.log(2));
        	String s=String.valueOf(res);
        	if(res-res1!=0)
        		if(s.length()>3&&Double.parseDouble(s.substring(0,s.length()-3))-res1!=0) return false;
        		else return true;
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(-8));
	}
}
