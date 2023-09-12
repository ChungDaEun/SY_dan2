package javaexp.a08_relation.a03_pck;

import javaexp.a08_relation.a04_pck.Mouse;

public class Computer {
	Mouse m1; // public이므로 접근이 가능
//	KeyBoard K1; 외부패키지라 접근 불가능 (public이 아니라 접근이 불가능)
	void call() {
		m1 = new Mouse(); // public
//		m1 = new Mouse("Q마우스"); X 접근 불가
		
	}

}
//ex) Mouse에 생성자를 2개(생성자 오버로딩 규칙) public(x) 선언하고
//    call()에서 객체 생성 여부를 확인