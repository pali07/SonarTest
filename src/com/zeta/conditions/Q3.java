package com.zeta.conditions;

import java.util.Scanner;

public class Q3 {

	public static void main(StringQuestions[] args) {
		int i =1;
		System.out.print(0+" ");
		while(i<=26){
				System.out.print(i+""+(char)('z'-i+1)+" ");
			i++;
		}
		System.out.println();
		 i=26;
		do{
			System.out.print(i+""+(char)('z'-i+1)+" ");
			i--;
		}while(i>0);
		System.out.println();
		for( i=1;i<=10;i++){
			System.out.println("2*"+i+"="+2*i);
		}

	}

}
