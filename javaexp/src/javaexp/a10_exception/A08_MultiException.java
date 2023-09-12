package javaexp.a10_exception;

public class A08_MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ex) A08_MultiException
		 *    NumberFormatException		Integer.parseInt("이십오")
		 *    ArithMehicException       1/0
		 *    Exception                 args[0]
		 *    위와 같이 예외처리를 다중으로 처리하고 최종적으로 finally 까지 처리하여 예외를 계층적으로 순차별로 처리하세요.*/
		
		try {
			System.out.println(Integer.parseInt("이십오"));
			System.out.println(1/0);
			System.out.println(args[0]);
			
		}catch(NumberFormatException e) { // 하위
			// 최상위가 아닐때 특정한 예외에 대한 처리를 구체화 필요할때
			System.out.println("숫자형 문자열 입력 부탁");
			System.out.println("예외1 : " + e.getMessage());
		}catch(ArithmeticException e) { //하위
			// 최상위가 아닐때 특정한 예외에 대한 처리를 구체화 필요할때
			System.out.println("불가능한 숫자");
			System.out.println("예외2 : " + e.getMessage());
		}catch(Exception e) { // 그외 모든
			// 기타 모든 내용을 한꺼번에 처리
			System.out.println("데이터 저장 안 됨");
			System.out.println("예외3 : " + e.getMessage());

		}finally {
			System.out.println("어쨋거나 저쨌거나 나를 봐야함");
		}
		System.out.println("종료");
	}

}
