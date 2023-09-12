package javaexp.a08_relation.access.story1;

import javaexp.a08_relation.access.story1.friendship.WoodCutter;

public class Hunter {
	void callWoodCutterInfo() {
		// public class WoodCutter
		// ==> WoodCutter wc 가능
		// default 생성자 : public WoodCutter(){}
		// ==> new WoodCutter(); 가능
		WoodCutter wc = null;
		wc = new WoodCutter();
//		System.out.println("private 접근 제언" + wc.hiddenCloth);

//		System.out.println("default접근 제어: " + wc.hiddenDeer);
		// 패키지가 다르므로 default 접근제어자의 구성요소는 접근이 불가능 하다.(에러 발생)
	}
}
