package com.zeta.conditions;
import java.util.*;

import com.zeta.ZetaBoundsException.*;
import com.zeta.helper.help;
public class CustomExceptionQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte b1 = sc.nextByte();
		byte b2 = sc.nextByte();
		try{
			if((b1+b2)>Byte.MAX_VALUE || (b1+b2)<Byte.MIN_VALUE){
				throw new CustomException("Out of byte range");
			}
			else{
				help.getLog(CustomExceptionQuestion.class).info(b1+b2);;
			}
		}
		catch(Exception e){
			help.getLog(CustomExceptionQuestion.class).error(e);
		}
		
	}

}
