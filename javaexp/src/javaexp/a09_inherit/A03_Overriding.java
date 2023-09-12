package javaexp.a09_inherit;

public class A03_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 메소드 재정의 (overriding)
1. 부모 클래스의 상속 메서드를 동일한 이름(매개변수)으로 다시 자식 클래스에서 정의하는 것을 말한다.
2. 목적
   1) 최종 목적은 상속관계에서 상위 클래스를 기반으로 상속받은 여러 클래스가 다양한 형태로 변경하는 다형성이라고 할 수 있다.
3. 기본형식
   class 상위{
   		void 기능메서드(){
   		}
   }
   class 하위1 extends 상위{
   		void 기능메서드(){ 
   		//상위와 동일한 메서드 정의
   		// 주의!) 
   		   1. 매개변수의 유형과 갯수가 달라지면 오버로딩 된다.
   		      메서드 명과 매개변수 유형과 갯수도 동일할 때를 말한다.
   		   2. 상위에서 선언한 내용과 하위마다 기능적 차별성이 있어야한다.
   		   3. 접근제어자는 하위 객체에서 재정의하는 메서느는 상위와 같거나 더 넓어져야한다.
   		      상위 default  하위 default/protected/public(O)
   		      상위 public   하위 default (X)
   		}
   }
4. 주의 : 접근제어자는 하위 객체에서 재정의하는 메서드는 상위와 같거나 더 넓어져야 한다.
         상위 default 하위 default/protected/public(o)
         상위 public 하위 default(x)
 */
		HyunDae com1 = new HyunDae();
		com1.earnMoney();
		Samsung com2 = new Samsung();
		com2.earnMoney();
		
		// ex1) Company를 상속받은 회사클래스를 만들고 earnMoney()를 재정의 하고 main()에서 호출하세요
		Zigzag com3 = new Zigzag();
		com3.earnMoney();
		
		/* ex2) 
		      상위 Worker
		      		kind : 직업종류
		      		worker(String kind)
		      		working() : 일하는 내용
		      하위 Police 상위 생성자 호출 및 메서드 재정의
		      		Programmer
		 */
		Police w1 = new Police();
		w1.working();
		Programmer w2 = new Programmer();
		w2.working();

	
	}

}
class Company{
	private String name;
	public Company(String name) {
		this.name = name;
	}
	public void earnMoney() {
		System.out.println(name + "회사가 돈을 벌다.");
	}
}
class HyunDae extends Company{
	public HyunDae() {
		// 상속시 상위에 있는 생성자를 호출하여야한다.
		// 직접적으로 접근하지 못하는 상위 private name을 간접적으로 접근하여 처리하였음
		super("현대 중공업");
	}
	//overriding은 상위에 있는 메서드를 동일하게 처리하면서 상위 기능과 다르게 처리하는 것을 말한다.
	public void earnMoney() {
		System.out.print("배를 만들어서 ");
		super.earnMoney();
	}
}
class Samsung extends Company{
	public Samsung() {
		super("삼성전자");
	}
	public void earnMoney() {
		System.out.print("전자제품을 만들어서 ");
		super.earnMoney();
	}
}

// ex1)
class Zigzag extends Company{
	public Zigzag() {
		super("지그재그");
	}
	public void earnMoney() {
		System.out.print("쇼핑몰 사이트를 모아서 ");
		super.earnMoney();
	}
}
/*
 		company
 			  earnMoney()
HyunDae		Samsung		DaumKaKao
eanrMoney   eanrMoney   eanrMoney

상위 공통된 company를 통해서 상속받은 하위객체들이 다양한 객체로 같은 메서드이지만 다른 기능을 처리한다.
이것을 다양한 객체들로 만들어 진다고 하여 다형성(polymorphism)이라는 개념으로 사용하는 것이다.

Company com1 = new HyunDae();
Company com2 = new Samsung();
Company com3 = new DaumKaKao();
# 하나의 상위 메모리를 통해 상속관계와 overriding이 되어있으면 다양한 하위 기능을 가진 동일한 이름의 메서드 호출을 통해서 처리될 수 있다.
Company[] arry = {new HyunDae(), new Samsung(), new DaumKaKao()}
arry[0].earnMoney();
arry[1].earnMoney();
arry[2].earnMoney();
 */

// ex2)
class Worker{
	private String kind;
	public Worker(String kind) {
		this.kind = kind;
	}
	public void working() {
		System.out.println(kind + " 일을 한다.");
	}
	
}
class Police extends Worker{
	public Police() {
		super("경찰관");
	}
	public void working() {
		System.out.print("치안을 유지하기 위해 ");
		super.working();
		// 상위 working과 구부나기 위해 super.오버라이딩메서드() 선언
	}
	public void call() {
		this.working(); // 현재 클래스의 working()메서드 호출
		working(); // 현재 클래스의 working 메서드 호출 this 생략
		super.working(); // 상위 클래스의 working()메서드 호출
	}
}
class Programmer extends Worker{
	public Programmer() {
		super("프로그래머");
	}
	public void working() {
		System.out.print("소프트웨어 개발로 ");
		super.working();
	}
}