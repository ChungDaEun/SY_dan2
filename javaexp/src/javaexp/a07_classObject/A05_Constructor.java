package javaexp.a07_classObject;

public class A05_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_ p01 = new Person_("정다은",25,"서울");
		Person_ p02 = new Person_("정민규",22,"강릉");
	    System.out.print(p01.name);
	    System.out.print(p01.age);
	    System.out.println(p01.loc);
	    System.out.print(p02.name);
	    System.out.print(p02.age);
	    System.out.println(p02.loc);
	    
	    Product_ prd1 = new Product_("핸드크림",6000,3);
	    Product_ prd2 = new Product_("립밤",2000,6);
	    System.out.println(prd1.obj+"의 가격은 "+prd1.pri + "원이고 갯수는 " + prd1.cnt+"개이다.");
	    System.out.println(prd2.obj+"의 가격은 "+prd2.pri + "원이고 갯수는 " + prd2.cnt+"개이다.");
	    System.out.println("총 가격은 " + (prd1.pri * prd1.cnt + prd2.pri * prd2.cnt)+"원이다.");

	    ProductVO p100 = new ProductVO("사과");
	    // p100 : 객체의 특정한 heap영역의 주소를 간단하게 선언한 것이다. 참조변수
	    System.out.println(p100);
	    System.out.println(p100.name);
	    ProductVO p101 = new ProductVO("바나나");
	    System.out.println(p101.name);	 
	    ProductVO p102 = new ProductVO("오렌지",2000,5);
	    System.out.println("#물건객체#");
	    System.out.println(p102.name);
	    System.out.println(p102.price);
	    System.out.println(p102.cnt);
	}

}
// ex01) Product_ 클래스 선언 필드로 물건, 가격, 갯수 영문으로 선언 / 생성자를 통해서 초기화
//       main()에서 prd1, prd2를 참조 변수로 객체를 생성해서 필드값을 출력하세요
class Product_{
	String obj;
	int pri;
	int cnt;
	Product_(String obj, int pri, int cnt){
		this.obj = obj;
		this.pri = pri;
		this.cnt = cnt; // 만약 this로 초기화를 안해주면 int값에는 0, String값에는 null이 출력됨
	}
}

// class 선언시 에러가 발생하면
// package javaexp.a07_classObject;
// 동일한 패키지명 하위에 동일한 클래스 선언시 에러발생
// class Person{} => 에러남 A03_Constructor파일에 있어서 오류발생
class Person_{
	String name;
	int age;
	String loc;
	
	// default 생성자는 사용자 정의 생성자를 선언하는 순간 사라진다.
	// 1. 생성자의 핵심 임무 - 필드의 초기화 처리
	Person_(String name, int age, String loc){
		// 필드로 선언한 name과 매개변수로 전달된 name 구분
		// 그 구분자가 this. 이다.
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	
}
