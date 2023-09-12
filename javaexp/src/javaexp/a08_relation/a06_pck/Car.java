package javaexp.a08_relation.a06_pck;

class Car {
	Bus b1; //같은 패키지에 있어서 가능
	void call() {
		b1 = new Bus();
		b1 = new Bus(7780);
		b1 = new Bus("부산", 7780);
		System.out.println(b1.no);
		System.out.println(b1.target);
//		System.out.println(b1.driver);
//		같은 패키지에 있더라도 private이기에 직접적이 접근은 안된다.(간접적 접근 가능)
		b1 = new Bus("인천",9999,"마길동");
		b1.callInfo();
	}

}
