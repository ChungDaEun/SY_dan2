package homework.H13_2;

import homework.H13_1.Kmelon;

public class Onion {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon);
//		System.out.println("(X)default: " + km.ktaste);
//		System.out.println("protected: " + km.taste);
		// 클래스, 패키지도 다르고 protected도 상속해서 처리하는 방식이 아닌 객체 생성 후 처리라 오류가 생긴다.
		System.out.println("public: " + km.fruit);
	}
}
