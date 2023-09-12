package javaexp.a09_inherit;

public class A09_PolyExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ex) Duck 상위 
			종류
    	flying() 재정의
   NormalDuck
   		집오리
   		flying() 날지 못한다.
   Mallard
   		청둥오리
   		flying() 날아다닌다.
   ==> 상/하위 구조로 상속하고 다형성을 처리하여 메서드로 호출
    	 */
		Duck d1 = new NormalDuck();
		d1.flying();
		Duck d2 = new Mallard();
		d2.flying();
	}
}
class Duck{
	private String kind;

	public Duck(String kind) {
		this.kind = kind;
	}
	public void flying() {
		System.out.println(kind + "가 있다.");
	}	
}
class NormalDuck extends Duck{
	public NormalDuck() {
		super("집 오리");
	}
	public void flying() {
		super.flying();
		System.out.println("집 오리는 날 수 있다.");
	}
}
class Mallard extends Duck{
	public Mallard() {
		super("청둥오리");
	}
	public void flying() {
		super.flying();
		System.out.println("청둥오리는 날 수 있다.");
	}
}