package com.zeta.conditions;

import java.util.Scanner;

public class EmailValidation {

	public static void main(StringQuestions[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuffer email = new StringBuffer(sc.next());
		int atTheRate =email.indexOf("@");
		int dot =email.indexOf(".");
		if(email.length()>18)  System.out.println("Email length is more than 18");
		else if(email.indexOf("@")<0) System.out.println("Email does not contain @");
		else if(email.indexOf(".")<0) System.out.println("Email does not contain @");
		else{
			String temp = email.substring(dot+1, email.length());
			System.out.println(temp);
			if(temp.equals("mill") ||temp.equals("biz") || temp.equals("com") || temp.equals("in") ){
				System.out.println("Email is valid");
			}
			else{
				System.out.println("Email does not validated org name");
			}
		}


	}

}
