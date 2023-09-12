package homework.H13_1;

public class Kmelon {
	private String kmelon = " 나는 한국에서만 먹는 참외이다. ";
	String ktaste = " 한국의 과일은 달다.";
	protected String taste = "과일은 야채가 될 수 없다.";
	public String fruit = "모든 과일은 달다.";
	
	void callFruit() {
		Kmelon km = new Kmelon();
		System.out.println("private: " + km.kmelon);
		System.out.println("(X)default: " + km.ktaste);
		System.out.println("protected: " + km.taste);
		System.out.println("public: " + km.fruit);
	}
}
