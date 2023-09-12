package javaexp.a07_classObject;

public class A03_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 생성자
1. 객체를 생성할 때, 클래스 명과 동일한 함수를 생성자라고 한다.
2. 주요기능
   1) 객체를 생성할 때 사용된다.
      new 생성자();
   2) 필드를 초기화 할 때 사용된다.
      클래스에서 선언된 필드값에 데이터를 할당하여 초기값을 설정할 필요가 있을 때 사용된다.
      ex)
      new Baby("귀염아기"), new Person("정다은",25,3);
      new Product("딸기",6000,2);
3. 형태
   1) 기본 생성자
      클래스를 선언할 때 생성자를 선언하지 않으면 
      내부적으로 클래스명(){}를 가지고 있기에 해당 생성자를 호출하여 사용한다.
      즉, 컴파일러가 컴파일 하면서 기본 생성자를 자동으로 추가 한다.
      new 클래스명()
   2) 기본 생성자의 삭제***
      기본 생성자는 사용자 정의 생성자를 선언하는 순간 사라진다.
      즉, 컴파일 시에 자동으로 추가하지 않는다.
   3) 추가 선언하는 생성자
      - 생성자는 기본 생성자와 같이 매개변수가 없는 생성자를 선언하고 추가 코드를 처리할 수 있다.
      - 매개변수를 통해 필드값을 초기화 하는 생성자를 선언할 수 있다.
        클래스명(String name, int age, String loc){
             // this.name : 필드로 선언할 name
             // name : 매개변수에 의해 전달되는 데이터 name
             this.name = name;
             this.age = age;
             this.loc = loc;
4. 클래스의 생성자 선언가 객체 생성
   1) 생성자, 필드의 초기화를 위해서 사용된다.
   2) 객체의 생성은 클래스에서 선언된 생성자 중에 하나를 선택해서 생성한다.
      Overloading()에 의해 선언된 내용 중에 하나를 사용한다.
 */
		// 클래스명을 기준으로 객체를 사용할 준비;
		Person p01;
		p01 = new Person();
		ProductVO prod1 = new ProductVO();
		
		// ex1) Computer 클래스 선언하고 default생성자 호출
		Computer com01 = new Computer();
		
		// ex1) Mouse 클래스 선언하고 매개변수가 없는 생성자 선언
		//      마우스 객체 생성이라고 출력, 호출
		Mouse mou01 = new Mouse();
		Mouse mou02 = new Mouse();
		Mouse mou03 = new Mouse();
		System.out.println(mou01.company); // null 출력
		System.out.println(mou01.price); // 0 출력
		// 두 가지 다 초기화 안해도 객체속에 선언된 상태라 이미 default로 초기화 된 상황이므로 
		// 초기화 안해도 된다.
		System.out.println(mou02.price);
		System.out.println(mou03.company);
		int cnt;
//		System.out.println(cnt); => 에러남 초기화 안해서
	}
}
class Person{
	// 생성자를 아무것도 선언되지 않을 때
	// 컴파일시 자동으로 추가해서 생성
}
class Product{
	// 매개변수가 없는 생성자를 선언
	Product(){
		System.out.println("물건객체 생성자 호출");
	}
}
class Computer{
	//Computer(){} 라고 선언한 것과 같다.(위에서 선언)
}
class Mouse{
	// 객체 속에 있는 field는 모두가 default 초기화가 된 상황이기에 
	// 따로 default 데이터로 초기화 할 필요 없다.
	// 추가된 데이터로 할당만 하면 된다.
	String company; //제조자 선언
	int price;
	Mouse(){
		company = "회사입력 안됨";
		price = -1;
		System.out.println("마우스 객체 생성");
    }
}