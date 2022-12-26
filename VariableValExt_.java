package week6n7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class VariableValExt {

	public static void valInsert(List<String> senten,Set<Character> oper) {
		List<String> variables=new ArrayList<>();
		List<Integer> values=new ArrayList<>();
		for(String s:senten) {
			int indx=s.indexOf(':');
//			System.out.println(indx);
			if(s.startsWith("O")||s.startsWith("o")) continue;
			else if(s.substring(0,indx).trim().compareToIgnoreCase("equation")==0) {
				String varOpers=s.substring(indx+1, s.length()).replaceAll(" ", "");
//				System.out.println(varOpers);
				String var="";
				for(int i=0;i<varOpers.length();i++) {
					if(varOpers.charAt(i)=='('||varOpers.charAt(i)==')') continue;
					if(varOpers.charAt(i)=='=') {
						variables.add(var);
						var="";
						continue;
					}
					if(i==varOpers.length()-1) {
						var+=varOpers.charAt(i);
						variables.add(var);
						continue;
					}
					if(!oper.contains(varOpers.charAt(i)))
						var+=varOpers.charAt(i);
					else {
						variables.add(var);
						var="";
					}
				}
			}
			else if(s.substring(0,indx).trim().compareToIgnoreCase("corresponding values")==0) {
				String valueString=s.substring(indx+1, s.length()).replaceAll(" ", "");
//				System.out.println(valueString);
				String val="";
				for(int i=0;i<valueString.length();i++) {
					if(valueString.charAt(i)=='('||valueString.charAt(i)==')') continue;
					if(valueString.charAt(i)=='=') {
						values.add(Integer.valueOf(val));
						val="";
						continue;
					}
					if(i==valueString.length()-1) {
						val+=valueString.charAt(i);
						values.add(Integer.valueOf(val));
						continue;
					}
					if(!oper.contains(valueString.charAt(i)))
						val+=valueString.charAt(i);
					else {
						values.add(Integer.valueOf(val));
						val="";
					}
				}
			}
		}
//		System.out.println(values+"\n"+variables);
		
		for(int i=0;i<values.size();i++) {
			System.out.println(variables.get(i)+":"+values.get(i));
		}
	}
	public static void main(String[] args) {
//		String t=new String(" sin jn s=-s").replaceAll(" ", "");
//		System.out.println(t+Integer.valueOf("42323").getClass());
		Set<Character> oper=new HashSet<>();
		List<String> senten=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextLine()) {
			String s=scan.nextLine();
			if(s.compareTo("\\")!=0) senten.add(s);
			//loop breaking char '\'
			else if(s.compareTo("\\")==0) break;
			int indx=s.indexOf(':');
			if(s.substring(0, indx).trim().compareToIgnoreCase("operation array")==0) {
				String str=s.substring(indx+1, s.length()).replaceAll(" ", "");
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)==','||str.charAt(i)==']'||str.charAt(i)=='['||str.charAt(i)=='{'||str.charAt(i)=='}') continue;
					oper.add(str.charAt(i));
				}
			}
		}
//		System.out.println(senten);
//		System.out.println(oper);
		//oper is passed as param because in both expn's it needs to check for operators in this method
		valInsert(senten,oper);
		scan.close();
	}

}
