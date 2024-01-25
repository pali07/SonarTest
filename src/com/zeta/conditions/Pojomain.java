package com.zeta.conditions;
import com.zeta.Zetapojocls.*;
import com.zeta.helper.help;
public class Pojomain {
public static void main(String args[]){
	Pojocls pj = new Pojocls();
	pj.setName("Pali Manohar");
	help.getLog(Pojomain.class).info(pj.getName());
	
	
}
}
