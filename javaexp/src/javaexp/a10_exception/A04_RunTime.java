package javaexp.a10_exception;

public class A04_RunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex) A04_RunTime args에 회원아이디와 패스워드를 입력받아 처리하는 프로그램으로 입력이 안될 때 예외처리하는 내용
		//     예외 처리 내용으로 아이디와 패스워드를 입력하세요.라고 표시되게 하세요.
		System.out.println("로그인 프로그램");
		try{
			String id = args[0];
			String password = args[1];
			System.out.println("당신의 아이디와 패스워드");
			System.out.println("회원아이디: " +id);
			System.out.println("비밀번호: " + password);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("아이디와 패스워드가 없습니다.");
			System.out.println("아이디와 패스워드를 입력하세요.");
		}
	}

}
