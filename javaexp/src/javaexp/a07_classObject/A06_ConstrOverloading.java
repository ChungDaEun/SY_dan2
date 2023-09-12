package javaexp.a07_classObject;

public class A06_ConstrOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 클래스에서 선언된 생성자 중에 하나를 선택해서 객체 생성이 가능하다.
		
		Person2 p01 = new Person2();
		System.out.println(p01.name + ":"+p01.age);
		Person2 p02 = new Person2("정다은",25);
		System.out.println(p02.name + ":"+p02.age);
		Person2 p03 = new Person2("정민규",22);
		System.out.println(p03.name + ":"+p03.age);
		
		Product2 pro1 = new Product2("딸기");
		Product2 pro2 = new Product2("사과",3000);
		Product2 pro3 = new Product2(2000,"바나나");

/*
# 생성자 오버로딩
1. 생성자는 기본적으로 default 생성자로부터 여러 생성자를 클래스내에서 
   오버로딩 규칙에 의해 여러개를 선언할 수 있다.

 */
	}
}
class Person2{
	String name;
	int age;
	Person2(){
		System.out.println("매개변수가 없는 생성자");
	}
	// 오버로딩 규칙 : 매개변수 갯수가 다르다.
	Person2(String name){
		this.name = name;
		System.out.println("이름을 초기화 하는 생성자: " + name);
	}
	// 오버로딩 규칙2 : 매개변수의 데이터 유형이 다르다.
	Person2(int age){
		System.out.println("나이 초기화 생성자: " + age);
	}
	// 오버로딩 규칙3 : 매개변수의 타입에 따른 순서가 다르다.
	Person2(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("매개변수 타입 순서 변경1");
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
	Person2(int age, String name){
		this.name = name;
		this.age = age;
		System.out.println("매개변수 타입 순서 변경1");
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
// ex) 클래스에 물건명과 가격 속성을 필드로 선언하고
//     생성자1: 물건명 할당/ 생성자2: 물건명,가격/ 생성자2: 가격, 물건명으로 오버로딩 규칙에 의해 선언하고
//     호출하고 할당된 속성값을 출력하세요.
class Product2{
	String proN;
	int proC;
	Product2(String proN){
		this.proN = proN;
		System.out.print("생성자1 - ");
		System.out.println("물건명: " + proN);
	}
	
	Product2(String proN, int proC){
		// this(name); 현재 선언된 생성자 중에 매개변수가 문자열로 선언된 것을 호출
		this.proN = proN;
		this.proC = proC;
		System.out.print("생성자2 - ");
		System.out.print("물건명: " + proN+", ");
		System.out.println("물건가격: " + proC+"원");
	}
	Product2(int proC, String proN){
		this.proN = proN;
		this.proC = proC;
		System.out.print("생성자3 - ");
		System.out.print("물건가격: " + proC + "원, ");
		System.out.println("물건명: " + proN);
	}
}
