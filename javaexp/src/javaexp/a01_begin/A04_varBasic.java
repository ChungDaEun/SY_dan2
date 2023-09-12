package javaexp.a01_begin;

public class A04_varBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자형 데이터 선언과 할당
		// 형식 : 유형 이름 = 데이터
		int num01 = 25;
//		int str02 = "다은";
//		크기와 유형에 맞지 않는 데이터는 에러 발생함
		var num02 = 30;
//		var str01 = "다은";
//		var은 데이터에 따라서 유형이 정해지기에 에러 발생하지 않음
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num01 + num02);
		int point01 = 70;
		// + : 숫자 형태는 합산해주지만, 문자열과 함께 사용하면 연결해주는 역할
		System.out.println("점수 : "+ point01);
		
		/* 국어, 영어, 수학 점수를 영문명으로 변수를 선언하고 항목별로 출력
		 * 총계도 출력하세요.
		 */
		
		int kor = 90;
		int eng = 75;
		int math = 100;
		int sum = kor + eng + math;
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총계 : " + sum);
		
		/* 사과, 바나나, 딸기 가격을 영문 변수로 선언하고,
		 * 가격데이터를 할당한 후, 항목별로 출력하고, 총 비용을 출력
		 */
		
		int ap = 3000;
		int ba = 5000;
		int st = 7000;
		System.out.println("사과의 가격은 : " + ap);
		System.out.println("바나나의 가격은 : " + ba);
		System.out.println("딸기의 가격은 : " + st);
		System.out.print("총 가격은 : ");
		System.out.println(ap + ba + st);
		System.out.println("총계 : " + (ap + ba + st));
//		() 소괄호는 최우선순위 연산을 처리하기에 먼저 계산
//		계산이 된 결과를 가지고 앞에 문자열의 영향을 받아 처리된다.
//	    System.out.println([3+4]);(x)
		System.out.println("총계(?) : " + ap + ba + st);
//		주의) 앞에 문자열이 선언되어 있으면 "총계:"
//      뒤에 +숫자는 자동 형변환과정이 일어나서 숫자가 문자형이 된다.
//		1000 ==> "1000"
		var tot = ap+ba+st;
		System.out.println("총계 :" + tot);	
		
		
	}

}
