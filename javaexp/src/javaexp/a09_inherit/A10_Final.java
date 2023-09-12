package javaexp.a09_inherit;

public class A10_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# final
1. 필드에서 final
   객체단위 final : 하나의 클래스에서 생성되는 여러개 객체에 객체별로 변경하지 않는 상수
   class Person{
   		static final String Kind = "황인";
   		final String name;
   		Person(String name){
   			this.name = name;
   		}
   }
   Person.Kind : 객체 생성없이도 사용할 수 있고
   Person.Kind = "백인" : final이기에 변경할 수 없다.
   객체 공유 즉 class 상수
   
   // 객체별로 초기화는 가능하나
   Person p01 = new Person("홍길동")
   Person p01 = new Person("김길동")
   p01.name = "오길동"; // 한번 할당된 데이터는 변경하지 못한다.
   p02.name = "마길동";
   
   객체 공유 클래스 final
   
2. class명 앞에 final : 더이상 하위에 상속을 할 수 없는 클래스 선언
3. 메서드명 앞에 final : 더이상 하#4위에서 재정의가 불가능 한 메서드 선언
 */
	}
}
final class Riger{}
// class NewSpec extends Riger{}
class Book{
	void showPrice() {
		System.out.println("책 가격 보기");
	}
	final void showAll() {
		System.out.println("책 정보 보기");
	}
}
class SubBook extends Book{
	// showAll()메서드 오버라이드 못함(final)
}