package week6n7;

public class PowerOfFour342 {

	public static boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        else{
        	double res=Math.log(n)/Math.log(4);
        	if(Math.ceil(res)-res<=0.000000000000001) res=Math.ceil(res);
        	double res1=Math.round(Math.log(n)/Math.log(4));
        	String s=String.valueOf(res);
        	System.out.println(s+" "+res1);
        	if(res-res1!=0)
        		if(s.length()>3&&Double.parseDouble(s.substring(0,s.length()-3))-res1!=0) return false;
        		else if(s.length()==3&&s.substring(1, 3).compareTo(".5")==0) return false;
        		else return true;
        }
        return true;
        
        //not mine
//      if(n==0) return true;
//      while(n%4==0) {
//      	n/=4;
//      }return n==1;
    }
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(8));
	}
}
