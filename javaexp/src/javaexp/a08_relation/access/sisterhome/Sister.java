package javaexp.a08_relation.access.sisterhome;

import javaexp.a08_relation.access.ourhome.Father;

public class Sister extends Father {
	// # 예제2 #
	void CallFatherInfo1() {
		Father f = new Father();
//   	System.out.println("private: " + f.privSec);
//   	System.out.println("default(x): " + f.ourHomeSec);
		// protected라도 상속해서 처리하는 방식이 아닌 객체 생성 후 처리는 접근 되지 못한다.
//   	System.out.println("protected: " + f.inheritSec);
   		System.out.println("public: " + f.announce);
	}
	//상속자
	void CallFatherInfo2() {
		//상속이라는 패키지가 다르면 private, default 접근 되지 못한다.
//   	System.out.println("private: " + privSec);
//   	System.out.println("default(x): " + ourHomeSec);
   		System.out.println("protected: " + inheritSec);
   		System.out.println("public: " + announce);		
	}
}
