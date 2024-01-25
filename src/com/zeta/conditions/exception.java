package com.zeta.conditions;
import com.zeta.helper.*;

public class exception {

	public static void main(StringQuestions[] args) {
		
		try{
			int z = 1/0;
		}
		catch(Exception e){
	
			help.getLog(exception.class).error(e);
		}

	}

}
