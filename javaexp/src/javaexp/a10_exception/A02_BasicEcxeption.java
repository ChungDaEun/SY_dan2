package javaexp.a10_exception;

public class A02_BasicEcxeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex) A02_BasicEcxeption.java를 만들고 try{}catch블럭을 만들어 각 라인별로 표시하고 특정 라인에 1/0코드를 넣어 에러 발생하게 하고 
		//     추리 내용을 수행 하게 하세요. 
		//     2단계 try{}안에 1~100 for문 처리하여 조건으로 50일 때 1/0코드가 수행되게 하세요.
		
		System.out.println("1");
		try {
			System.out.println("# TRY 구문 #");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println(1/0);
			System.out.println("5");
			System.out.println("6");
		}catch(Exception e) {
			System.out.println("# catch 구문 #");
			System.out.println("에러 내용" + e.getMessage());
			System.out.println("7");
			System.out.println("8");
		}
		System.out.println("9");
		System.out.println("\n");
		
		
		
		try {
			for(int i = 0; i <= 100; i++) {
				if(i == 50) {
					System.out.println("코드가 이상해 던질게!!");
					System.out.println(1/0);
				}else {
					System.out.println(i +" : 코드가 잘 돌아가고 있다.");	
				}
			}
		}catch(Exception e) {
			System.out.println("!!!!! CATHCH !!!!!");
		}
		
	}
}
