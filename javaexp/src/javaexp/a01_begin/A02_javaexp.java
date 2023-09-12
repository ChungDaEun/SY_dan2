package javaexp.a01_begin;

public class A02_javaexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
- 다중행 주석
1. 출력 처리의 여러가지 형식
    1) 자바는 기본적으로 System.out.println("출력문자열");
       명령을 통해서 줄바꿈과 함께 문자열을 출력하낟.
       sysout+ctrl+space : 자동 출력물 생성
 */
		System.out.println("안녕하세요");
     	System.out.println("안녕하세요");
		System.out.println("안녕하세요");
//  2) 줄 바꾸지 않는 출력 : System.out.print()
		System.out.print("정다은");
		System.out.print("정다은");
		System.out.print("정다은\n");
		
/*		System.out.print("국어 70 ");
		System.out.print("영어 80 ");
		System.out.print("수학 90 "); */
		
		System.out.print("국어");
		System.out.println(70); // print뒤에 ln붙이면 줄 바뀜
		System.out.print("영어");
		System.out.println(80);
		System.out.print("수학");
		System.out.println(90);

		
		
/* ex) 국어 70
 *     영어 80
 *     수학 90
 * 국어, 70, 영어, 80, 수학, 90
 * 각각 System.out.println("국어")에 넣어 위 형식으로 출력 되게 하고		
 * 각각 System.out.println(70)에 넣어 위 형식으로 출력 되게 하고		
 * 각각 System.out.println("영어")에 넣어 위 형식으로 출력 되게 하고		
 */
	}

}
