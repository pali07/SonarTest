package com.zeta.conditions;
import java.util.*;
import java.util.regex.*;
public class StringQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Zeta Sodexo Zeta Sodexo Zeta Sodexo Zeta Sodexo";
		//Q1
		System.out.println(s.replaceAll(" ", ""));
		//Q2
		String temp = "lenovo";
		String res = "";
		for(int i=0;i<temp.length();i++){
			if(i%2==0){
				res=res+(char)(temp.charAt(i)+'A'-'a');
			}
			else{
				res=res+temp.charAt(i);
			}
		}
		System.out.println(res);
		//Q3
		System.out.println(s.length());
		System.out.println(s.length()-s.replaceAll("a", "").length());
		System.out.println(s.length()-s.replaceAll("S", "").length());
		//Q4
		    Matcher matcherF = Pattern.compile("(.)").matcher("Zeta");
		    if (matcherF.find()) {
		        System.out.print(matcherF.group(1));
		    }
		    Matcher matcherL = Pattern.compile("(.$)").matcher("Zeta");
		    if (matcherL.find()) {
		        System.out.print(matcherL.group(1));
		    }
		     Matcher matcherT = Pattern.compile("(.{2})").matcher("INFY");
		    if (matcherT.find()) {
		        System.out.print(matcherT.group(1));
		    }
	}

}
