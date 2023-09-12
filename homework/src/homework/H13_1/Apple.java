package homework.H13_1;

public class Apple {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon); private는 해당 클래스에서만 정의가능하다
		System.out.println("(X)default: " + km.ktaste);
		System.out.println("protected: " + km.taste);
		System.out.println("public: " + km.fruit);
	}
}
