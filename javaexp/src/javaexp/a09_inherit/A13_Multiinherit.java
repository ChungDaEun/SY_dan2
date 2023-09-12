package javaexp.a09_inherit;

public class A13_Multiinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 인터페이스의 다중 상속 지원
1. 상위로 여러개의 인터페이스를 상속받아서
2. 하위 실제 클래스를 선언할 수 있다.
3. 기본형식
   interface 인터페이스1
   		추상메서드1
   interface 인터페이스2
   		추상메서드2
   인터페이스만 여러개를 상속 받아 사용 할 수 있다.
   class 다중상속한 실제 객체 implements 인터페이스1, 인터페이스2 {
   		추상메서드1 재정의
   		추상메서드2 재정의
   }
   ex) Wing 인터페이스, Swimming 인터페이스
       class MultiSkillRobot implements Wing, Swimming
 */
		MultiSkil01 ms01 = new MultiSkil01();
		MultiSkil02 ms02 = new MultiSkil02();
		ms01.allskill();
		ms02.allskill();
		
		Students01 s01 = new Students01();
		Students02 s02 = new Students02();
		s01.all();
		s02.all();
		
	}

}
class MultiSkil01 implements SwimmingWay, Wing{

	@Override
	public void fly() {
		System.out.println("우리 동네를 날다.");
	}
	@Override
	public void swimming() {
		System.out.println("호수를 수영하다.");
	}
	public void allskill() {
		fly();
		swimming();
	}
}
class MultiSkil02 implements SwimmingWay, Wing{

	@Override
	public void fly() {
		System.out.println("우리나라 전국을 날다.");	
	}
	@Override
	public void swimming() {
		System.out.println("바다에서 수영을 한다.");
	}
	public void allskill() {
		fly();
		swimming();
	}
}

//ex) StudyWay study(), PlayerWay play() 인터페이스를 선언하고 두개를 implements한 실제객체 Student01, Student02를 선언하여 
//    위 인터페이스를 재정의 한 내용을 출력하는 메서드를 호출하세요.

interface StudyWay{
	void study();
}
interface PlayerWay{
	void play();
}
class Students01 implements StudyWay, PlayerWay{
	@Override
	public void play() {
		System.out.println("놀기를 열심히 하지 않는다.");
	}
	@Override
	public void study() {
		System.out.println("공부를 열심히 하지 않는다.");
	}
	public void all() {
		play();
		study();
	}
}
class Students02 implements StudyWay, PlayerWay{
	@Override
	public void play() {
		System.out.println("놀기를 열심히 한다.");	
	}
	@Override
	public void study() {	
		System.out.println("공부를 열심히 한다.");
	}
	public void all() {
		play();
		study();
	}
}