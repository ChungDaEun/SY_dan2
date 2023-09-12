package homework.H13_2;

import homework.H13_1.Kmelon;

public class Carrot {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon);
//		System.out.println("(X)default: " + km.ktaste);
//		System.out.println("protected: " + km.taste);
		// 클래스, 패키지도 다르고 Kmelon클래스에 상속되지 않아서 오류가 난다.
		System.out.println("public: " + km.fruit);
	}
}
