package javaexp.a07_classObject;

public class A12_StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 상수
 - 객체마다 한번 할당되면 변경되지 않는 수를 상수라고 한다.
 - final 키워드 할당
   1) 객체별 상수
      클래스 내에 선언한 상수로 객체별로 변경되지 않는 수
      class Person{
         final static name;
      }
      Person p01 = new Person();
      p01.name = "홍길동";
      p01.name = "김길동";(X)
      Person p02 = new Person();
      p02.name = "신길동";(O)
      p02.name = "신길동";(X)
   2) 객체공유 상수
      class Person{
         static final String KIND = "황인";
      }
      Person.KIND로 class 안에 초기로 선언된 상수를 사용할 때 사용되고 이것을 변경할 수 없다.
      주로 대문자로 선언하여 사용한다.
      Person p01 = new Person();
      p01.KIND = "흑인"; (X)
      Person.KIND = "백인"; (X)
      // 일반적으로 static final상수는 대문자로 사용한다.

# 클래스와 객체를 생성해서 사용하다보니 동일한 클래스를 통해서 나온 
  객체들이 공유하는 메모리의 필요성으로 생성된 것이 static변수이다.
    
  static은 객체 공유 메모리이므로 변수로는 클래스명.static변수로 사용하고 메서드로는 클래스명.static메서드()를 사용한다.
  ex) Math.random() : api(내부사용정의객체) Math 객체를 공유하여 사용하는 공유 필드가진 데이터를 리턴하는 메서드이다.
  
# 객체가 공유하고 한번 할당되면 변경할 수 없는 데이터를 설정하는 것을 static final이라고 한다.
  클래스가 Math일 때
  Math m = new Math();
  m.random() ==> 보통은 이런 형식으로 사용했는데
  Math.random() => 랜덤함수는 그냥 이렇게만 사용함

 */
		System.out.println("객체 생성 없이 사용하는 static final 변수");
		System.out.println(Number01.NO4);
		// static 메서드 객체가 생성없이 호출할 수 메서드이기 때문에
		// 객체 생성이 필요한 일반 메서드 포함할 수 없다.
		BankAccount.callMethod();
		System.out.println(Math.PI);
		
		Number01 n = new Number01(5,6);
		System.out.println(n.no1);
		System.out.println(n.no2);
		// 건출비용 : 건물자재 + 도면
		// static
		n.no1 = 8;
		Number01.no3 = 10;
//		n.no2 = 9; ==>오류발생, final 키워드는 한번 할당하면 변경할 수 없기 때문에 에러발생
		Number01 n2 = new Number01(5,6);
		System.out.println("n2 객체의 속성들");
		System.out.println(n2.no1);
		System.out.println(n2.no2);
		System.out.println(n2.no3);
		
		BankAccount acc01 = new BankAccount("정다은",1000);
		BankAccount acc02 = new BankAccount("김다은",1500);
		BankAccount acc03 = new BankAccount("박다은",2000);
		System.out.println(acc01.rest + ":" + BankAccount.totRes);
		System.out.println(acc02.rest + ":" + BankAccount.totRes);
		System.out.println(acc03.rest + ":" + BankAccount.totRes);
		// 객체가 공유하는 메모리를 사용하기에 객체공유라기 보다 클래스변수로 사용된다.
		// 클래스명.변수명
		// BankAccount.toRes
		acc01.savingMoney(1000);
		acc01.savingMoney(1000);
		acc01.savingMoney(1000);
		acc02.savingMoney(1000);
		acc02.savingMoney(1000);
		acc03.savingMoney(1000);
		acc03.savingMoney(1000);
		
		System.out.println("acc01의 계좌: " + acc01.rest);
		System.out.println("acc03 다른 사람의 계좌: " + acc03.rest);
		System.out.println("acc03 다른 사람의 계좌: " + acc03.totRes);
		
		System.out.println("static메서드: " + BankAccount.savingMoney2(1000));
		System.out.println("static메서드: " + BankAccount.savingMoney2(1000));
		System.out.println("acc03에서 공유 메모리 확인: " + acc03.totRes);
	}

}
class Number01{
	int no1;
	final int no2;
	static int no3; // Number01.no3 = 30
	//객체가 공유하는 데이터 중에 변경할 수 없는 데이터를 말한다.
	// 클래스 상수로 한번 할당하면 변경되지 않는다.
	// 자바에서는 static final을 상수로 사용하고 대문자로 사용하여 구분한다.(가독성)
	static final int NO4 = 5;
	//sat
	Number01(int no1, int no2){
		this.no1 = no1;
		this.no2 = no2;
	}
}
// BankAccount 클래스를 통해서 은행의 각 계좌별 정보는 new BankAccount()객체를 통해서
// 일반 변수나 메서드를 통해서 처리하고 은행의 모든 계좌가 공유하는 정보(전체계좌의 총계/계좌의 갯수)
// Static이라는 키워드를 통해서 선언하면 효과적으로 처리할 수 있다.
class BankAccount{
	String name; // 계좌명
	int rest; // 계좌별 총 잔액
	static int totRes; // 모든 계좌의 총 합산 
	// static은 모든 객체의 공유 메모리
	BankAccount(String name, int rest){
		this.name = name;
		//객체마다 가지고있는 변수
		this.rest += rest;
		System.out.println("# 계좌 개설 #");
		System.out.println("계좌명: " + name);
		System.out.println("계좌의 잔액: " + rest);
		// 모든 객체가 공유하는 공유 메모리 영역 ==> static
		// 누적해서 저장
		totRes += rest;
		System.out.println("모든 계좌의 총 합산: " + totRes);
	}
	void savingMoney(int money) {
		this.rest += money; // 계좌별로 돈이 누적
		totRes += money; // 전체 계좌 총 계 누적
		System.out.println("계좌: " + name);
		System.out.println("계좌 잔고: " + rest);
		System.out.println("모든 계좌 잔고: " + totRes);
	}
	// 객체 생성없이 static 변수를 증가/변경시키는 메서드가 필요할 때 static 메서드로 선언
	// static 메서드, static 변수를 수정하거나 변경할 때 활용하는 메서드
	// 객체별로 사용하는 변수들을 이메 서드에서 사용하지 못한다.
	// static 변수, static 메서드 객체의 공유부분이기에 즉, 객체 종속이 아니기에 일반적으로 객체 생성하지 않고 
	// 바로 클래스명.static변수, 클래스명.static메서드로 사용이 가능하다. 
	// ex) BankAccount.totRes, BankAccount savingMoney2(30)\
/*실무적으로 내장된 클래스를 사용하는 경우
  Math.random()
  Math.PI
  Math.floor() 내림
  Math.ceil() 오림
  에서 주로 사용된다.
   */
	static int savingMoney2(int money) {
//		rest++; => 일반변수는 에러발생
//		this.rest += money; // 계좌별로 돈이 누적 => 오류남(공유메모리이기 때문)
		totRes += money; // 전체 계좌 총 계 누적
//		System.out.println("계좌: " + name); =>오류남(객체종속이기 때문)
//		System.out.println("계좌 잔고: " + rest); =>오류남(객체종속이기 때문)
		System.out.println("은행 잔고: " + totRes);
		return totRes;
	}
	// 메서드에서 호출 static 메서드/일반메서드 호출
	// 1. static 메서드는 static 변수만 사용할 수 있다.
	// 2. static 메서드는 static 메서드만 호출하여 사용할 수 있다.
	// 3. 일반 메서드는 static변수, static메서드를 호출할 수 있다.
	static void callMethod() {
//		savingMoney(25); => 에러남 : 2번의 이유
		savingMoney2(75);
	}
	void callMethod2() {
		callMethod();
	}
}