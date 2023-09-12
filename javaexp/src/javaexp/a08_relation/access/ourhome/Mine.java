package javaexp.a08_relation.access.ourhome;

public class Mine {
	/*
	javaexp.a08_relation.access
	ourhome 패키지 생성
		Father, Mother, Brother, 
		Mine
			X 우리가족 여행 계획 : 변수로 설정할당
	unclehome 패키지 생성
		Uncle
		
		Mine 클래스에 대한 우리가족 여행계획 호출 처리 메서드가 가능한 범위 확인
	 */
	//private로 Mine의 개인 비밀을 할당하고 같은 패키지/다른 패키지 접근 여부를 확인
	private String secret = "나의 비밀은 비밀이다.";
	String travelPlan= "우리 가족은 5월에 제주도로 여행을 가기로 함";
	void callMineInfo() {
//		System.out.println("private 접근: " + secrt);
		Mine m = new Mine();
		System.out.println("private 접근: " + m.secret); 
		System.out.println("default 접근: " + m.travelPlan);
	}
}
