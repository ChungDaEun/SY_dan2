package javaexp.a07_classObject;

public class A04_ParameterData {
	// 생성자 메서드
	// static : 객체 생성 없이 사용 키워드
	// void :  리턴값 없이 사용 메서드
	
	// 하단에서 호출할 때, 어떤 메서드를 호출할지 구분이 되지 않으므로 선언할 수 없다.
	//변수명을 이름만으로 식별하지만, 함수형은 *이름+매개변수로 식별하여 호출할 수 있다.
//	static void call() {
//	System.out.println("함수0 ");
//	System.out.println("매개변수가 없는 메서드");
//}	
	
	static void call(int num01) {
		System.out.println("함수1");
		System.out.println("매개변수로 온 숫자: "+ num01);
	}
	static void call(String num04) {
		System.out.println("함수5");
		System.out.println("매개변수로 온 숫자: "+ num04);
	}
	static void call(int num01, int num02) {
		System.out.println("함수2");
		System.out.println("매개변수로 온 숫자: "+ num01);
		System.out.println("매개변수로 온 숫자: "+ num02);		
	}
	static void call(String num01, int num02) {
		System.out.println("함수6");
		System.out.println("매개변수로 온 숫자: "+ num01);
		System.out.println("매개변수로 온 숫자: "+ num02);		
	}
	static void call(int num01, String num02) {
		System.out.println("함수7");
		System.out.println("매개변수로 온 숫자: "+ num01);
		System.out.println("매개변수로 온 숫자: "+ num02);		
	}
	static void call(int num01, int num02, int num03) {
		System.out.println("함수3");
		System.out.println("매개변수로 온 숫자: "+ num01);
		System.out.println("매개변수로 온 숫자: "+ num02);
		System.out.println("매개변수로 온 숫자: "+ num03);
	}
	static void call02(double num02) {
		System.out.println("매개변수로 온 숫자2: "+ num02);
	}
	static void call03(String name, int age) {
		System.out.println("#두개의 매개변수로 온 함수#");
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
//		call("사과"); (X) 안되는 이유는 int num01 = "사과"이렇게 선언한 것과 같기 때문
		call(25); //이렇게는 가능함
//		call(25.7); (X) 이것도 안됨
		call((int)25.7); // casting해서 사용
		
		call02(75); // double num02 = 75; 
		call02(75.2);
		
//		call03("사과"); (x) 에러남 이유는 값을 두개를 받아야하는데 한개만 받아서
//		call03("사과","25"); (x) 에러남 이유는 int값인 실수가 들어가야하는 자리에 "25"문자열 들어감
		// TODO Auto-generated method stub
/*
# 매개변수처리
1. 매개변수 생성자와 메서드에서 사용되는 데이터 전달 기능 수행하는 변수이다.
2. 매개변수의 유형에 따라서 데이터를 전달할 수 있다.
   - 함수의 명과 데이터유형이 맞아야 된다.
3.매개변수는 순서, 타입, 갯수에 맞게 전달하여야 한다.

# 생성자, 메서드의 overloading  < 주의) overriding 구분 >
0. 궁극적인 원인
   변수는 이름을 구분하지만 함수는 이름과 매개변수로 구분
   호출하는 곳에서 다르게 호출이 가능하느냐 여부에 따른 것이다.
   어느 함수를 호출하는 구분할 수 있느냐 여부
      
1. 동일한 이름으로 정의 가능한 경우를 말한다.
   1) 매개변수의 갯수가 다르면 선언이 가능하다.
   2) 매개변수의 갯수가 같아도 타입이 다르면 선언이 가능하다.
   3) 매개변수의 갯수가 같아도 타입이 같더라도 순서가 다르면 선언이 가능

 */
		call(10); 
		call("정다은"); 
		call("정다은",25); //선언가능
		call(25,"정다은"); 
		call(10,20);// 호출, 데이터 식별가능
		call(10,20,30);
	}

}
