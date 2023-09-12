package javaexp.a01_begin;

public class A12_StringTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  ex) 파일에 저장된 숫자, 네트웍을 통해 전달되는 숫자
		       ==> 문자열형
		       3000^2000^4000 ==> "3000" ==> 3000
          1. 문자열을 정수형 변환
		       => 내장된 Integer 객체의 parseInt()를 
		          메서드를 통해서 숫자형 문자열을 숫자형으로 변환해준다.
		          ex) "25.7"(X) "이십오"(X) "30"(O)
		              int num01 = Integer.pareInt("25");
		  2. 문자열을 실수형 변환
		       => 내장된 Doubler 객체의 parseDouble()을
		          메서드를 통해서 실수형문자열을 실수형으로 변환해준다.
		          ex) "25"(O) "이십오점사"(X) "3.14"(O)
		          double num02 = Double.parseDouble("3.14");
		 */
		
		int num01 = Integer.parseInt("25");
		System.out.println(num01+25);
		String num02Str = "30.15"; // 반드시 정수형 문자열이어야 한다.
		//int num02 = Integer.parseInt(num02Str); 
		// ==> 실행에러 : 컴파일까지 되지만 실행 시 에러 발생
		//System.out.println(num02+20);
		double num02 = Double.parseDouble(num02Str);
		System.out.println(num02+30.5);
		// 실수형변환에서 정수형 문자열을 전환이 된다.
		System.out.println(Double.parseDouble("30") + 0.7);
		
		/* ex) 1. 문자열 "70"과 "20"을 정수형으로 형변환하여, 합산된 결과를 출력하세요.
		       2. 문자열 "30.7"과 "40.2"를 실수형으로 형변환하여, 합산된 결과를 출력하세요. */
		
		// 1문제
		String astr = "70";
		String bstr = "20";
		int a = Integer.parseInt(astr);
		int b = Integer.parseInt(bstr);
		System.out.print("1번 문제 : "+ astr + " + " + bstr + " = ");
		System.out.println(a+b);
		
		// 2문제
		String cstr = "30.7";
		String dstr = "40.2";
		double c = Double.parseDouble(cstr);
		double d = Double.parseDouble(dstr);
		System.out.print("2번 문제 : " + cstr + " + " + dstr + " = ");
		System.out.println(c+d);
				

	}

}
