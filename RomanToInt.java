package codes;

//import java.util.HashMap;

public class RomanToInt {

	public int romanToInt(String s) {		    
		int answer = 0, number = 0, prev = 0;

		for (int j = s.length() - 1; j >= 0; j--) {
			switch (s.charAt(j)) {
			case 'M' : number = 1000;
			case 'D' : number = 500;
			case 'C' : number = 100;
			case 'L' : number = 50;
			case 'X' : number = 10;
			case 'V' : number = 5;
			case 'I' : number = 1;
			}
			if (number < prev) {
				answer -= number;
			}
			else {
				answer += number;
			}
			prev = number;
		}
		return answer;
		
//		int res=0;
//		HashMap<Character, Integer> vals=new HashMap<>();		
//		vals.put('I', 1);vals.put('V', 5);vals.put('X', 10);
//		vals.put('L', 50);vals.put('C', 100);vals.put('D', 500);  
//		vals.put('M', 1000);
//		for(int i=0;i<s.length();i++) {
//			if(i+1<s.length()&& vals.get(s.charAt(i))<vals.get(s.charAt(i+1))) {
//				res-=vals.get(s.charAt(i));
//				}
//			else {
//				res+=vals.get(s.charAt(i));
//				}
//		}
//        return res;
        
    }
}
