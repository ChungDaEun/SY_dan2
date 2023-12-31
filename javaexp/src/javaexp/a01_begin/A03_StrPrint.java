package javaexp.a01_begin;

public class A03_StrPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * # 문자열 출력 특수 문자
		 * 1. \t : 탭 간격 출력 명령어
		 * 2. \n : 줄 바꿈 출력 명령어
		 * 3. \" : "" 사이 문자열 안에 "표시
		 * 4. ''는 ""사이에 있기에 허용
		 */
		
		System.out.println("홍길동\t김길동\t신길동");
		System.out.println("100\t90\t80");
		System.out.println("안녕\n하세요\n반갑습니다.\n");
		System.out.println("그녀의 이름은 \"정다은\" 이었습니다.\n");
		
		/* ex) 다음과 같이 출력하세요.
		 * 국어     영어       수학
		 * 90      80        90
		 * 내가 아는 학교 친구들
		 * 1. 김길동
		 * 2. 홍길동
		 * 3. 마길동   ==> 한라인에 문자열 표현
		 * 오늘은 "자바 프로그래밍과정" 시작입니다.
		 */
		
		System.out.println("국어\t영어\t수학");
		System.out.println("90\t80\t90\n");
		System.out.println("내가 아는 학교 친구들");
		System.out.println("1. 김길동\n2. 홍길동\n3. 마길동\n");
		System.out.println("오늘은 \"자바 프로그래밍과정\" 시작입니다!!");
		

	}

}
