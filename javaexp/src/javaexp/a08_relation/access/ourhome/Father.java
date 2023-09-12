package javaexp.a08_relation.access.ourhome;

public class Father {
	// # 예제1 #
	void callMineInfo() {
		Mine m = new Mine();
		System.out.println("default 접근: " + m.travelPlan);
//		System.out.println("private 접근: " + m.secret); 오류남 secret이 private이므로 같은 패키지에 있더라도 호출불가
	}
	
	// # 예제2 #
	private String privSec = "개인적인 비밀 내용";
	String ourHomeSec = "우리 가족이 사용할 돈은 뒷마당에 있음";
	protected String inheritSec = "상속할 재산 배분 내용";
	public String announce = "우리 가족은 5월에 여행을 갑니다.";
	
	void CallFatherInfo1() {
		Father f = new Father();
   		System.out.println("private: " + f.privSec);
   		System.out.println("default(x): " + f.ourHomeSec);
   		System.out.println("protected: " + f.inheritSec);
   		System.out.println("public: " + f.announce);
	}
	//상속처리
	void CallFatherInfo2() {
   		System.out.println("private: " + privSec);
   		System.out.println("default(x): " + ourHomeSec);
   		System.out.println("protected: " + inheritSec);
   		System.out.println("public: " + announce);		
	}
}
