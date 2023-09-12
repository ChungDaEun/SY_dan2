package javaexp.a10_exception;

public class A11_UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("# 사용자 정의 예외 시작 #");
		try {
			int ran = (int)(Math.random() * 2 + 1);
			System.out.println(ran);
			if(ran == 1) {
				throw new User02Exception();
			}
		}catch(User02Exception e) {
			System.out.println("예외 메세지 내용: " + e.getMessage());
		}
		System.out.println("# 사용자 정의 예외 종료 #");
	}

}


// ex) User02Exception으로 예외 클래스를 사용자 정의로 선언하고 main()에서 임의의 수(Math.random() - 1~2)가 발생할 때,
//     1이 나오면 예외 객체를 던져 처리되게 하세요.

class User02Exception extends Exception{
	public User02Exception() {
		super("\n1이 나왔습니다. [예외]"); //상위 생성자 중 매개변수가 문자열로 된 생성자 호출
	}

	@Override
	public String getMessage() {
		return "[재정의된 메서드 호출]"+super.getMessage();
	}
	//여러가지 처리할 기능적인 메서드

}