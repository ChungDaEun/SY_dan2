package javaexp.a08_relation.a05_pck;

import javaexp.a08_relation.a06_pck.Bus;

public class passenger {
	Bus b1;
//	Car c1; 선언시 public 안되기에 에러남
	void call() {
		b1 = new Bus();
//		b1 = new Bus(7780); public이 아니기에 에러남
		b1 = new Bus("부산", 7780);
		System.out.println(b1.no);
//		System.out.println(b1.target); public이 아니기에 에러남
		b1 = new Bus("인천",999,"마길동");
		b1.callInfo();//결과 모두 출력
	}

}
