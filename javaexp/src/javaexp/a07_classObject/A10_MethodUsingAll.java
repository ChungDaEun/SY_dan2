package javaexp.a07_classObject;

public class A10_MethodUsingAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingMall sm = new ShoppingMall();
		String ret = sm.login("hi", "7777");
		System.out.println("결과1" + ret);
		System.out.println("결과2" + sm.login("아", "7777"));

		//isAdult(나이를 입력) 성인/미성년자를 18이상 기준으로 리턴하게 처리하세요
		System.out.println("결과1 : " + sm.isAdult(15) );
		System.out.println("결과2 : " + sm.isAdult(20));
	}
/*
# 메서드의 입력처리, 로직처리, 리턴값처리를 다 하는 경우
1. 외부의 데이터를 받아서(매개변수로 데이터 처리)
2. 로직처리(아래 내용 전부 또는 일주를 처리하고)
   1) 저장
   2) 출력
   3) 반복문/조건문 처리
3. 최종 결과 데이터를 return값으로 전달하여 메서드가 호출되는 곳에서 처리하는 경우를 말한다.
 */

}
class ShoppingMall{
	// 입력 id,pass
	String login(String id, String pass) {
		String result ="로그인 실패";
		// 로직 처리 : 아이디와 패스워드가 맞을 때만 "로그안 성공"
		if(id.equals("hi")&& pass.equals("7777")) {
			result = "로그인 성공";
		}
		//결과 리턴처리
		return result;
	}
	String isAdult(int age) {
		String result = "미성년자입니다.";
		if(age >= 18) {
			result = "성인입니다.";
		}
		return result;
	}
	
}
