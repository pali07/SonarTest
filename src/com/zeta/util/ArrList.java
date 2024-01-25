package com.zeta.util;

import java.util.*;

import com.zeta.helper.help;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ls = new ArrayList();
		ls.add(new Integer(34));
		ls.add(new Integer(34));
		ls.add(new Integer(24));
		ls.add(340);
		ls.add(new Integer(34));
		ls.add(new Integer(34));
		ls.add(new Integer(34));
		ls.add(new Integer(34));
		ls.add(new String("string"));
				help.getLog(ArrList.class).info(ls);
				ListIterator it = ls.listIterator();
				while(it.hasNext()){
					help.getLog(ArrList.class).info(it.next());
				}
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(5);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v2.add(1);
		v2.add(2);
		v2.add(1);
		v2.add(1);
		v2.add(1);
		help.getLog(ArrList.class).info(Collections.replaceAll(v2,2,1));
		help.getLog(ArrList.class).info(v2);
		
				
	}

}
