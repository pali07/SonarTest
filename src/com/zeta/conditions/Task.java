package com.zeta.conditions;

import java.util.*;
import java.util.Scanner;

import com.zeta.helper.help;

public class Task {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
StringBuilder sb = new StringBuilder(sc.next());
List character = new ArrayList();
List symbol = new  ArrayList();
int i=0;
while(i<sb.length()){
	if(!Character.isDigit(sb.charAt(i)) && !Character.isAlphabetic(sb.charAt(i))){
		symbol.add(sb.charAt(i));
	}
	else if(Character.isAlphabetic(sb.charAt(i))){
		character.add(sb.charAt(i));
	}
	
else if(Character.isDigit(sb.charAt(i))){
	character.add(sb.charAt(i));
	int temp =i+1;
	int count =0;
		while(i<sb.length()-1 && Character.isDigit(sb.charAt(i+1)) && sb.charAt(i+1)-sb.charAt(i)==1){
			i++;
			count++;
		}
		
		if(count==1){
			symbol.add('$');
		}
		else if(count>1){
			while(temp<=i){
				character.add(sb.charAt(temp));
				temp++;
			}
		}
	}
	i++;
}

help.getLog(Task.class).info(character);
help.getLog(Task.class).info(symbol);
	}

}
