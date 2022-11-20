package codes;

public class SqrtNoFunction {
	public static  int mySqrt(int x) {
		System.out.println(x);
		Long sqNum=1l;int indx=1;
		if(x==0) return 0;
		else {
			for(int i=1;i<=(x/2)+1;i++) {
				sqNum=(long)i*i;
				if(sqNum>x) {
					indx=i-1;
					break;
				}else if(sqNum==x) return i;
			}
			return indx;
		}
    }
	public static void main(String[] args) {
		
		System.out.println(mySqrt(Integer.MAX_VALUE));
	}

}