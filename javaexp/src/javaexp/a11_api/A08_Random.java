package javaexp.a11_api;

import java.util.Random;

public class A08_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 임의의 수를 보다 효과적으로 처리하는 api객체
1. boolean, int, long, float, double 등의 데이터를 메서드를 이용해서 임의로 처리할 수 있다.
2. 난수를 만드는 알고리즘에 사용되는 종자값(seed) 설정가능하여 처리된다.
   종자값이 설정되면 처음에 나온 임의 수는 계속 보존된다.
 */
		Random r1 = new Random();
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt()); // 정수 전체 범위
		// r1.nextInt(경우의 수) + 시작수
		System.out.println(r1.nextInt(5)+1);
		System.out.println("주사위 : "+r1.nextInt(6)+1);
		System.out.println("1~100: " + r1.nextInt(101));
		
		/* 
		 ex) 위 Random 객체의 기능 함수를 이용해서
		     1. 임의로 합격/불합격을 출력하게 하고
		     2. 주사위 2개의 합산값을 출력
		     3. 학생의 점수를 국어/영어/수학 임의로 처리하여 평균출력
		 */

		Random r2 = new Random();
		boolean isPass = r2.nextBoolean();
		if(isPass) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		Random r3 = new Random();
		int dice1 = r3.nextInt(6)+ 1;
		int dice2 = r3.nextInt(6)+ 1;
		System.out.println("주사위 1 : " + dice1);
		System.out.println("주사위 2 : " + dice2);
		System.out.println("임의의 주사위 값의 합 : " + (dice1 + dice2));
		
		
		Random r4 = new Random();
		int kor = r4.nextInt(101);
		int eng = r4.nextInt(101);
		int math = r4.nextInt(101);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		int tot = (kor + eng + math) / 3;
		System.out.println("국어, 영어, 수학 점수의 평균 : " + tot);
				
	}

}
