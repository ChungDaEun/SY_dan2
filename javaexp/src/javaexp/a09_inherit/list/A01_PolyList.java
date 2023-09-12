package javaexp.a09_inherit.list;

import java.util.ArrayList;

public class A01_PolyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 다형성 구조의 ArrayList 할당 처리
1. 1:다 관계의 구조의 다형성을 ArrayList로 상위로 하여
2. 여러가지 추가되는 다형성 객체들을 할당하고
3. 재정의 된 메서드를 호출하여 처리하는 형식을 말한다.
4. 기본 형식
   1) 상위 클래스 선언
   2) 추가하는 하위 클래스 선언
   3) 호출하는 곳에서
      ArratList<상위 클래스> plist = new ArratList<상위 클래스>();
      plist.add(new 하위클래스());
      plist.add(new 하위클래스());
   4) 반복문을 통해 재정의된 메서드로 각각의 기능을 처리하는 내용을 확인할 수 있다.
      for(하위클래스 참조: plist){
      		하위객체의 재정의 메서드 호출
      }
 */
		ArrayList<Duck> dlist = new ArrayList<Duck>();
		dlist.add(new NormalDuck());
		dlist.add(new RubberDuck());
		dlist.add(new Mallard());
		for (Duck d:dlist) {
			d.swimming();
		}	
		
		ArrayList<Part> plist = new ArrayList<Part>();
		plist.add(new Cpu("i7"));
		plist.add(new Ram("8G"));
		plist.add(new Ssd("128G"));
		for (Part p : plist) {
			p.inp();
		}
	}
}
class Duck{
	private String kind;

	public Duck(String kind) {
		this.kind = kind;
	}
	public void swimming() {
		System.out.println(kind + " 수영을 한다.");
	}
}
class NormalDuck extends Duck{

	public NormalDuck() {
		super("집 오리");
	}
	@Override
	public void swimming() {
		super.swimming();
		System.out.println("집 앞 호수에서 즐겁게 수영을 하고 있다.");
	}	
}
class RubberDuck extends Duck{

	public RubberDuck() {
		super("러버덕");
	}
	@Override
	public void swimming() {
		super.swimming();
		System.out.println("집 목욕탕에서 아이들과 함께 수영을 하고 있다.");
	}	
}
class Mallard extends Duck{

	public Mallard() {
		super("청둥오리");
	}
	@Override
	public void swimming() {
		super.swimming();
		System.out.println("강가에서 무리들과 즐겁게 수영을 하고 있다.");
	}	
}

//ex) Part클래스 하위에 Cpu, Ram, Ssd 만들고 위 ArrayList<Part>에 담아서 재정의 된 메서드로 호출
class Part{
	private String kind;
	private String spec;

	public Part(String kind, String spec) {
		this.kind = kind;
		this.spec = spec;
	}
	public void inp() {
		System.out.println(kind + " 득템");
		System.out.println(kind + "의 스펙은 " + spec);
	}
	public String getKind() {
		return kind;
	}
	
}
class Cpu extends Part{
	public Cpu(String spec) {
		super("CPU", spec);
	}
	@Override
	public void inp() {
		super.inp();
		System.out.println("CPU를 장착했습니다.");
	}
}
class Ram extends Part{
	public Ram(String spec) {
		super("RAM", spec);
	}
	@Override
	public void inp() {
		super.inp();
		System.out.println("RAM을 장착했습니다.");
	}	
}
class Ssd extends Part{
	public Ssd(String spec) {
		super("SSD", spec);
	}
	@Override
	public void inp() {
		super.inp();
		System.out.println("SSD를 장착했습니다.");
	}
}