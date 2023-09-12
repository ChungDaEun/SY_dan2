package javaexp.z02_util;

public class A06_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		/*
		 # 임의의 수를 처리해주는 Math 객체의 random()메서드
		   1. 여러가지 임의의 수를 가져와서프로그램에 적용하여 처리할때,
		      활용하는 내장된 기능 함수(메서드)
		   2. 기본형식
		       1) 기본범위
		           0.0 <= Math.random() < 1.0
		       2) 임의의 정수 범위 처리
		           0~9 정수 범위 처리
		           0.0*10 <= Math.random()*10 < 1.0*10
		           0.0 <= Math.random()*10 < 1.0
		           0 <= (int)(Math.random()*10) < 10  // 0~9까지 10개의 경우가 나온다.
		           1~10까지 정수범위 처리
		           0 <= (int)(Math.random()*10 + 1) < 11
		       3) 공식 처리
		           (int)(Math.random() * 경우의 수 + 시작 수)
		           Q1) 주사위 던지는 수를 처리하려면?
		           Q2) 0/1 두가지 경우가 나오는 처리하려면?
		 */
/*		System.out.println("임의의수");
		double num01 = Math.random();
		System.out.println(num01);
		System.out.println(num01*10);
		System.out.println((int)num01*10);
		System.out.println((int)num01*10 + 1);  */
		
/*		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		System.out.println((int)Math.random()*10); */
		
		//Q1 내 답
		System.out.print("주사위를 던져라  ");
		System.out.println((int)(Math.random() * 6 + 1));

		//Q2
		System.out.print("0과 1: ");
		System.out.println((int)(Math.random() * 2 + 0));
		
		// 강사님 답
		int dice01 =(int)(Math.random() * 6 + 1);
		System.out.println("나온 주사위 : " + dice01);
		int gameDiv = (int)(Math.random() * 2 );
		System.out.println("나온 수 (0/1): " + gameDiv);
		String gDiv = gameDiv == 0? "짝" : "홀";
		System.out.println("임의의 짝/홀: " + gDiv);
		
		// ex1) 0~100까지 임의의 수를 point에 할당하여 출력하세요.
		int point = (int)(Math.random()* 101 + 0);
		System.out.println("0~100까지 임의의 수: " + point);
		// ex2) 구슬 8개를 임의로 쥘 때, 나오는 수를 출력?
		int marble = (int)(Math.random() * 8 + 1);
		System.out.println("구슬의 수: " + marble);
		// ex3) 위 수가 홀일지 짝인지 처리하여 출력(hint %-나머지 연산자)
	    int point2 = point % 2;
	    String pointDiv = point2 == 0? "짝" : "홀";
	    System.out.println("짝 / 홀? : " + pointDiv);

	    
	}

}
