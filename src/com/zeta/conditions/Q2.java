package com.zeta.conditions;

public class Q2 {

	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		if(year%400==0){
			System.out.println("Leapyear");
		}
		else if(year%4==0 && year%100!=0){
			System.out.println("Leapyear");
		}
		else{
			System.out.println("not Leap year");
		}
	}

}
