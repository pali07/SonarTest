package com.zeta.conditions;

import org.apache.log4j.Logger;

public class Q1 {
 public static void main(String[] args){
	 Logger lg = Logger.getLogger(Log4jTest.class);
	// int x = args[0].charAt(0)-'0';
	 int x =0;
	 if(x>=0 && x<=9){
		 lg.info("Integer");
	 }
	 else{
		 lg.info("Character");
	 }
 }
}
