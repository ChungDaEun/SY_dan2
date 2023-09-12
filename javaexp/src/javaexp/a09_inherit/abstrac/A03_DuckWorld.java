package javaexp.a09_inherit.abstrac;

public class A03_DuckWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck d1 = new NormalDuck();
		Duck d2 = new Mallard();
		
		d1.Swimming();
		d1.Flying();
		d2.Swimming();
		d2.Flying();
		
		Duck d3 = new RubberDuck();
		d3.Swimming();
		d3.Flying();
//		d3.UsingForKids(); 추가된 다형성에서 처리되지 않는다.(다형성 한계)		
		RubberDuck d4 = (RubberDuck)d3; //타입 캐스팅
		d4.UsingForKids();
		
		RubberDuck d5 = new RubberDuck();
		d5.UsingForKids();
/*
하위에 RubberDuck
     추상 클래스 상속받아서 처리하되 
     Swimming()을 재정의 해서 목욕탕에서 놀다.
     추가 메서드 usingForKids() 아이들을 위해 만들어 졌다.
 */

	}

}
/*
ex) 아래와 같이 추상 클래스 Duck을 선언하여 main()에서 호출하세요.
    Duck(추상)
    	kind 종류
    	매개변수 1개 생성자
    	swimming() 수영을 하다.(공통)
    	getkind() 공통
    	fly() 추상 메서드
    NormalDuck(실제 클래스) 일반오리 : fly () 날지 못한다.
    Mallard(실제 클래스) 청둥오리 : fly() 훨훨 날고 있다.
*/
abstract class Duck{
	private String kind;

	public Duck(String kind) {
		this.kind = kind;
	}
	public void Swimming() { // 공통 메서드
		System.out.println(kind +" 수영을 한다.");
	}
	public String getKind() {
		return kind;
	}
	abstract void Flying(); // 추상 메서드
}
class NormalDuck extends Duck{
/*
# 상속을 하면
1. 상위 생성자를 호출해야한다.
   super(매개변수) : 상위 클래스에서 선언된 생성자 호출
2. 추상 클래스일때는 추상 메서드를 반드시 재정의 해야 한다.
 */
	public NormalDuck() {
		super("일반 오리");
	}
	public void Flying() {
		System.out.println(getKind() + "는 날지 못한다.");
	}
	
}
class Mallard extends Duck{
	public Mallard() {
		super("청둥 오리");
	}
	public void Flying() {
		System.out.println(getKind() + "는 훨훨 날고 있다.");
	}
}
class RubberDuck extends Duck{

	public RubberDuck() {
		super("러버덕");
	}
	
	@Override
	public void Swimming() {
		super.Swimming();
		System.out.println(getKind() + "은 목욕탕에서 놀고 있다.");
	}
	@Override
	void Flying() {
		System.out.println(getKind() + "은 장난감이라 날지 못해요");
	}
	
	public void UsingForKids() {
		System.out.println(getKind() + "은 아이들을 위해 만들어졌다.");
	}
		
}