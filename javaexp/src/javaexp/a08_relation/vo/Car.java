package javaexp.a08_relation.vo;

public class Car {
	// 자동차 종류, 배기랑
	// driving() @@ 자동차가 운행을 합니다.
	
	private String kind;
	private int cc;
	public Car() {
		// TODO Auto-generated constructor stubr
	}
	public Car(String kind, int cc) {
		this.kind = kind;	
		this.cc = cc;
	}
	public void driving() {
		System.out.println(kind + " 자동차를 운행을 합니다.");
	}
	
	public String getKind() {
		return kind;
	}
	public void setKindC(String kind) {
		this.kind = kind;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
}
