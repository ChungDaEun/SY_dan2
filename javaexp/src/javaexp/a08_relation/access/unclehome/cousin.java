package javaexp.a08_relation.access.unclehome;

import javaexp.a08_relation.access.ourhome.Mine;

public class cousin {
	void callMineInfo() {
//		System.out.println("private 접근: " + secrt);
		Mine m = new Mine();
//		System.out.println("private 접근: " + m.secret);
//		System.out.println("default 접근: " + m.travelPlan);
	}
}
