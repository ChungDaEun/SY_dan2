package javaexp.a01_begin;

public class A11_TypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 형변환
		    1. 데이터 타입을 다른 타입으로 변환하는 것을 말한다.
		        1) 기본 데이터 타입끼리
		             작은 데이터 <==> 큰 데이터
		             실수 <==> 정수
		        2) 객체형끼리 변경
		            - 문자열 데이터와 숫자 변경
		               "301" vs 301 은 다르다. => "301"은 문자열 데이터
		               "301" + "101" vs 301 + 101
		                 => "301101" vs 402
		               ps) 실무형태
		                   모든 데이터는 기본적으로 문자열형태로만 전송하고 전달받을 수 있다.
		                   내장된 객체에서 지원하는 기능 메서드를 통해서 전환이 가능하다.
		                   문자열 ==> 숫자
		                     Integer.parseInt()
		                     Double.parseDouble()
		                   숫자 ==> 문자
		                     System.out.println("2+3=" +2+3);
		                     => 출력값 : 2+3=23 
		                        이유 => "2+3="이 문자열이므로 뒤에도 문자열로 인식
		                     int num01 = 20;
		                     int num02 = 30;
		                     String str = "" + num01 + num02
		                     => 출력값 :2030
		                     최대한 간단한 방법 문자열 ""을 선언하고 숫자를 붙이면 문자열로 변환이 된다.
		                     
		            - 상속 관계에서 형변환(객체이후 진행)
		    2. 종류
		        1) 자동형 (묵시적) 형변환 : 작은 유형이 큰 유형으로 할당할 때 (promotion)
		        2) 강제형(명시적) 형변환 : 큰유형을 작은 유형으로 할당할 때, 명시적으로 형변환 표현(casting)
		 */
		
		byte num01 = 30;
		int num02 = 230;
		/* 주의 : 데이터는 오른쪽에서 = (대입연산자)에 의해서 왼쪽으로 할당된다. 
		   순수데이터로 할당할 수 있는 것이 아니고, 
		   그것을 포함하는 용기(유형)으로 할당한다. */
		
		num02 = num01; // (O)
		// 작은 용기에 있는 데이터를 큰용기에 있는 데이터로 할당, 묵시적(자동) 형변환이 일어남
		
     /* num01 = num02; (X)
		   큰용기에 있는 데이터를 작은 용기에 있는 데이터로 할당 (에러남)
		    1. 데이터 할당 불가
		    2. 큰용기에 있는 데이터를 작은 용기에 할당하려면 casting 작업이 필요함
		       (byte) 해당 틀을 지정하여 처리 */   
		num01 = (byte)num02; // bit 단위로 casting 되기에 연산결과가 예측이 힘들다.
		// 01010100(8bit) 캐스팅 되면 => 0101(4bit)로 뒤 0100이 잘린다.
		/* 주의1) 해당 범위안에 있으면 정상적으로 할당되지만, 
		         해당 범위를 초과하는데 casting하는 경우 정수의 
		         경우에는 bit 단위로 잘려지기에 원치않는 결과를 확인할 수 있다. 
		    주의2) 캐스팅은 반드시 큰데이터가 작은 데이터로 할당하는 경우만 있는 것이 아니라 
		          작은데이터가 큰데이터로 강제변환해서 연산을 해야하는 경우에도 사용된다.
		          10/3 ==> 3, 10/(double)3 ==> 3.3333 */
		System.out.println(num01);

		/*
		   3. 정수 vs 실수 변환
		       1) 정수 ==> 실수
		            20 ==> 20.0
		       2) 실수 ==> 정수(casting)
		            3.14 ==> 3 
		 */
		
		int num03 = 20;
		double num04 = num03;
		System.out.println(num04);
		
		double num05 = 3.14;
		int num06 = (int)num05; // 실수 정수 casting
		System.out.println(num06);
		
		/*
		 주의) 자바에만 있음 - 연산자 할 때, 한번 더 언급
		       1. 자바는 정수/정수형은 정수형 처리된다.
		          소숫점 이하를 처리해주지 않는다.
		          => 소숫점 이하를 처리하기 위해서는 
		             나눗셈의 데이터 중 적어도 하나는 실수형으로 형변환하여 처리하여야 한다.
		             (강제 형변환- casting)
		             cf) casting을 무조건 큰 데이터를 작은 데이터에 할당하는 것이 아니라, 
		                 데이터유형의 크기/종류에 상관없이 강제 형변환시 사용한다.
		 */
		
		int num07 = 10;
		int num08 = 3;
		System.out.println(num07/num08);
		System.out.println(num07/(double)num08);
		System.out.println((double)num07/num08);
		System.out.println((double)num07/(double)num08);
		
		/* ex) 25와 7을 정수로 선언하여, 소숫점이하가 나오지 않는 경우와
		     소숫점이하가 나오게 하는 경우를 처리하여 출력하세요.*/
		
		int a = 300;
		int b = 27;
		System.out.println(a/b);
		System.out.println((double)a/b);
		
		int num20 = 25;
		System.out.println(""+num02 + 30);
		Integer intRam = num20;
		System.out.println(intRam.toString()+30);

	}

}
