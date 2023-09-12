package javaexp.a08_relation.access.unclehome;

import javaexp.a08_relation.access.ourhome.Father;
import javaexp.a08_relation.access.ourhome.Mine;

public class Uncle {
	// # 예제1 #
	void callMineInfo() {
//		System.out.println("private 접근: " + secrt);
		Mine m = new Mine();
//		System.out.println("private 접근: " + m.secret);
//		외부 패키지에서는 접근이 불가
//		System.out.println("default 접근: " + m.travelPlan);
	}
	
	// # 예제2 #
	void CallFatherInfo1() {
		Father f = new Father();
//   	System.out.println("private: " + f.privSec);
//   	System.out.println("default(x): " + f.ourHomeSec);
//   	System.out.println("protected: " + f.inheritSec);
   		System.out.println("public: " + f.announce);
	}
	//상속자
	void CallFatherInfo2() {
//   	System.out.println("private: " + privSec);
//   	System.out.println("default(x): " + ourHomeSec);
//   	System.out.println("protected: " + inheritSec);
//   	System.out.println("public: " + announce);		
	}
}
