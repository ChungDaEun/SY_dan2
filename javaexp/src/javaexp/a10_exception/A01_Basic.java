package javaexp.a10_exception;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 예외 처리 기본 1단계 처리
		System.out.println("라인1");
		System.out.println("라인2");
		try { // 예외 처리 블럭으로 만약 처리하지 않으면 에러가 남과 동시에 해당 라인에서 진행이 중단
			  // 하지만 try{}catch문으로 인해 계속 수행 할 수 있음
			System.out.println("# 코드 블럭 #");
			System.out.println("라인3");
			System.out.println("라인4");
			System.out.println(args[0]); // 예외 던짐
			// 예외를 던지면 이 후 내용이 수행되지 않음
			System.out.println("라인5");	
			System.out.println("라인6");
		}catch(Exception e){
			// 예외가 발생했을 때 처리 코드
			System.out.println("# 예외 처리 블럭 #");
			// e.XXX : 여러 기능 메서드를 통해서 예외에 대한 상세 내용을 처리한다.
			// ex) A02_BasicEcxeption.java를 만들고 try{}catch블럭을 만들어 각 라인별로 표시하고 특정 라인에 1/0코드를 넣어 에러 발생하게 하고 
			//     추리 내용을 수행 하게 하세요. 2단계 try{}안에 1~100 for문 처리하여 조건으로 50일 때 1/0코드가 수행되게 하세요.
			System.out.println(e.getMessage());
			System.out.println("라인7");	
			System.out.println("라인8");
		}
		System.out.println("# 예외 처리 후 블럭 #");
		System.out.println("라인9");
	}
}
