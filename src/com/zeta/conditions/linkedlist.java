package com.zeta.conditions;
import java.util.*;

import com.zeta.helper.help;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList ll = new LinkedList();
//		ll.add(22);
//		ll.add(40);
//		ll.addFirst("Zeta");
//		ll.add("HDFC");
//		help.getLog(linkedlist.class).info(ll);
//		Collections.shuffle(ll);
//		help.getLog(linkedlist.class).info(ll);
		LinkedHashSet st = new LinkedHashSet();
		TreeSet st1 = new TreeSet();
		st1.add(67);
		st1.add(897);
		st1.add(89);
		help.getLog(linkedlist.class).info(st);
		ArrayList l = new ArrayList(0);
		l.add(23);
		l.add(23);
		l.add(24);
		l.add(24);
//		HashSet st1 = new HashSet(l);
		help.getLog(linkedlist.class).info(st1);
		Collections.unmodifiableSet(st1);
		//st1.add(0);
	List ls=	Collections.unmodifiableList(l);
	ls.add(9);
		st1.add(456);
		help.getLog(linkedlist.class).info(st1);
		help.getLog(linkedlist.class).info(ls);
		Collections.max(st1);
		//Collections.max(ls);
		help.getLog(linkedlist.class).info(Collections.max(l));
//		
		
	}

}
