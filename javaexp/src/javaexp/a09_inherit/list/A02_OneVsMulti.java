package javaexp.a09_inherit.list;

import java.util.ArrayList;

public class A02_OneVsMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 실제 처리할 객체에서 다형성 처리로 등록, 전체 리스트 확인
1. 포함될 클래스
   1) 상위(Part)
   2) 하위(Cpu,Ram,Ssd)
2. 포함할 클래스
   class Computer{
   		String company
   		ArrayList<Part> plist;
   		void addPart(Part part)
   			plist.add(part)
   	    void ahowAllParts()
   	    	컴퓨터 종류 : company
   	    	for(Part p:plist)
   	    		p.showInfo();
   }
 */
		Computer com1 = new Computer("맥북");
		com1.addPart(new Cpu("i7 3.4GHZ"));
		com1.addPart(new Ram("16G"));
		com1.addPart(new Cpu("512G"));
		com1.addPart(new GraphCard("128bits 6core"));
		com1.addPart(new PowerSupplier("220V"));
		
		com1.showAllInfo();
	}
}
class Computer{
	private String kind;
	private ArrayList<Part>plist;
	public Computer(String kind) {
		this.kind = kind;
		plist = new ArrayList<Part>(); //생성자를 만들때 부품리스트 객체 생성
	}
	public void addPart(Part part) {
		plist.add(part);
		System.out.println(kind + "에 " + part.getKind() + " 부품 추가됩니다.");
	}
	public void showAllInfo() {
		System.out.println(kind + " 컴퓨터 부품 리스트");
		if(plist.size() > 0) {
			for(Part p:plist) {
				p.inp();
			}
		}else {
			System.out.println("부품이 없습니다.");
		}
	}
}
//추가할 내용을 상속받아서 클래스를 구현하고 메서드를 재정의 한 후 포함할 클래스의 메서드에 객체 생성 추가하면 된다.
class GraphCard extends Part{

	public GraphCard(String spec) {
		super("그래픽카드", spec);
	}
	@Override
	public void inp() {
		super.inp();
		System.out.println("그래픽카드를 장착했습니다.");
	}	
}
//ex) 전원공급장치 추가 부품 PowerSupplier
class PowerSupplier extends Part{
	public PowerSupplier(String spec) {
		super("POWER", spec);
	}
	@Override
	public void inp() {
		super.inp();
		System.out.println("전원을 킵니다.");
	}		
}