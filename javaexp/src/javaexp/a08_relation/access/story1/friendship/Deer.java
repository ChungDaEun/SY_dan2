package javaexp.a08_relation.access.story1.friendship;

public class Deer {
	void callWoodCutterInfo() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private 접근 제언" + wc.hiddenCloth);
//		private 접근 제어자는 같은 패키지 클래스에서도 접근이 안된다.
		System.out.println("default접근 제어: " + wc.hiddenDeer);
	}
}
