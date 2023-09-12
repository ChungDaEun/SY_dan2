package javaexp.z02_util;

public class A01_Input {

	public static void main(String[] args) {
		// Run => Runconfigurations => 정보 입력 => apply => Run
		System.out.println("입력처리");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args.length);
		String name = args[0];
		System.out.println(name == "정다은"); 
		System.out.println(name.equals("정다은")); 
		System.out.println(name.equals("정다은2")); 
		String ageStr = args[1];
		// 정수형문자열 숫자로 변경해주는 기능 메서드
		int age = Integer.parseInt(ageStr);
		System.out.println("2년 후:"+(ageStr+2));
		System.out.println("2년 후:"+(age+2));
		
		
		// TODO Auto-generated method stub
		/*
		 # 자바에서 입력데이터 처리
		 1. String[] args 입력
		    java A01_Input : 실행 명령어
		    실행시, 입력값을 전달 처리
		    java A01_Input 정다은 25
		    main()의 매개변수
		    String[] args = {"정다은", "25"};
		    cf) 주의 대부분 프로그래밍 - String[] args = ["정다은", "25"];
		    배열명[index번호 - 0부터 시작]
		    args[0] : "정다은"
		    args[1] : "25"
		    srgs.length : 배열의 크기 = 2
		 2. Scanner 객체(내장 api) 활용
		 */

	}

}
