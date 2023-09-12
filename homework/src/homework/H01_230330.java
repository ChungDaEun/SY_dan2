package homework;

public class H01_230330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 [1단계:코드] 2. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
           - 이름, 나이, 키 
           - 좋아하는 음악명, 발매연도
           - 오늘 지출금액 목록과 비용, 합산
 */
		String name = "정다은"; // 이름
		int age = 25; // 나이
		int heigh = 160; //키
		String s_name = "yesterday"; // 좋아하는 음악명
		int s_year = 2017;// 발매연도
		String item01 = "커피"; //오늘 지출 목록1
		String item02 = "쌀국수"; //오늘 지출 목록2
		int item01_p = 7000; // 오늘 지출 목록1 비용
		int item02_p = 10000;// 오늘 지출 목록2 비용
		int sum01 = item01_p + item02_p; // 지출 합산
		
		System.out.println("이름: " + name + ", " + "나이: " + age + ", "+ "키: " + heigh);
		System.out.println("좋아하는 음악명: " + s_name +", " + "발매연도: " + s_year);
		System.out.println("오늘 지출 목록: " + item01 + ", " + item02);
		System.out.println("오늘 지출 비용: " + item01 +" = "+ item01_p + ", " + item02 + " = " + item02_p);
		System.out.println("오늘 지출 합산: " + sum01);
		System.out.println();
		
		
//[1단계:코드] 7. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요

		int n01 = 2100000000; 
		int n02 = 1500000000;
		long sum = (long)n01 + (long)n02;
		System.out.println(sum);
		System.out.println();
		

//[1단계:코드] 9. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
		
		for (int num02 = 65; num02<=90; num02++) {
	    	System.out.print(num02 + ":");
	     	System.out.println((char)num02);
	    }// 65~90은 알파벳 대문자

		for (int num03 = 97; num03<=122; num03++) {
	    	System.out.print(num03 + ":");
	     	System.out.println((char)num03);
	    }// 97~122은 알파벳 소문자
		
	    for (int num01 = 48; num01<=57; num01++) {
	    	System.out.print(num01 + ":");
	     	System.out.println((char)num01);
	    }// 48~57은 문자 0부터 9
	}
}
