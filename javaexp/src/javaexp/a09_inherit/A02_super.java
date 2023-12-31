package javaexp.a09_inherit;

public class A02_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d1 = new Daughter();
		System.out.println(d1.charac);
		System.out.println(d1.name);
		d1.call();
		
		Son s1 = new Son();
		s1.call();
/*
ex) Father, Son 선언하고
1. 변수 동일 선언 : 하위 메서드에서 구분 호출
2. 생성자 상위에 매개변수 1개 선언 후 하위에서 호출 
3. 메서드 동일 메서드 선언하여 상위에 구분처리
 */
		
	}
}
class Mother{
	String charac = "온화함";
	String name = "어머니";
	Mother(String name){
		System.out.println("어머니 생성자");
	}
	void call() {
		System.out.println("# 상위 call() 메서드 #");
		System.out.println("성격 : " + charac);
	}
}
// 현재 클래스와 상위 클래스에 정의된 구성요소를 구분하여 호출할 때 사용된다.
class Daughter extends Mother{
	String name = "딸";
	Daughter(){
		// super(); default로 컴파일 시 호출된다.
		super("상위"); //반드시 상위 선언된 생성자를 호출하여야 한다.
		System.out.println("딸 생성자");
	}
	Daughter(String name){
		this();// 현재 가지고 있는 생성자를 호출한다.
	}
	// 메서드 오버라이딩(overriding): 상위에 있는 메서드에 편승해서 올라타서 정의(똑같은 내용 정의)
	void call() {
		// 상위에 있는 메서드를 현재 메서드와 구분해서 호출 할때 super.사용
		super.call();
		System.out.println("# 메서드 호출 #");
		System.out.println(charac);
		System.out.println("super.name : " + super.name);
		System.out.println("this.name : " + this.name);
		System.out.println("name : " + name); // this.생략하더라도 하위 필드
	}
}
class Father{
	int age = 60;
	String name = "아빠";
	Father(String name){
		System.out.println("아빠 생성자");
	}
	void call() {
		System.out.println("아빠의 나이 : " + age + "세 이다.");
	}
	
}
class Son extends Father{
	int age = 30;
	//public Son(){super(); } : default 생성자의 선언
	Son(){
		super("아빠"); //상위에 있는 생성자를 반드시 호출
	}
	Son(String job){
		this();		
	}
	void call() {
		super.call(); // 상위에 있는 메서드 호출
		System.out.println(name);
		System.out.println("super.age = " + super.age);
		System.out.println("this.age = " + this.age);
		System.out.println("age : " + age);
	}
}
