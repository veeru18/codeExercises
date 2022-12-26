package week6n7;

public class PowerOfThree326 {

	public static boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        else{
        	double res=Math.log(n)/Math.log(3);
        	if(Math.ceil(res)-res<=0.0000000000001) res=Math.ceil(res);
        	double res1=Math.round(Math.log(n)/Math.log(3));
        	String s=String.valueOf(res);
        	System.out.println(s.length());
        	if(res-res1!=0)
        		if(s.length()>3&&Double.parseDouble(s.substring(0,s.length()-3))-res1!=0) return false;
        		else return true;
        }
        return true;
        
        //not mine
//        if(n==0) return true;
//        while(n%3==0) {
//        	n/=3;
//        }return n==1;
    }
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(243));
		System.out.println(Math.round(4.499999));
	}

}
