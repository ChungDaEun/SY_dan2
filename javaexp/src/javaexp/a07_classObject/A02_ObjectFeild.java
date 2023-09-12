package javaexp.a07_classObject;

public class A02_ObjectFeild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 클래스(객체)의 구성요소
1. 필드 : 객체의 데이터가 저장되는 곳
	 	 ex) 사람의 두뇌의 저장 내용 처리
2. 생성자 : 기본적인 필드값을 초기화할 때 객체가 생성되면서 데이터를 입력받아서 처리한다.
		   주로 객체를 사용, 생성될 때 초기화할 데이터
           ex) new Baby("겸둥이1",0,...)
3. 메소드 : 데이터 입력, 리턴하는 데이터를 처리하는 함수
          참조변수와 함께 데이터의 변경처리할 때 주로 사용된다.
          c1.speedUp(10); // 속도를 10단위로 올린다.
          c1.takePerson(2); // 승객 2명이 탑승한다.
          int speed = c1.getCurspeed(); // 현재 속도를 확인하는 메서드(return값이 있음)
          int dist = c1.calDist(150,2); // 시속 150km, 시간입력
          시속 150km를 입력받고 시간을 입력받았을 때 갈 수 있는 거리를 연산해서 return 처리
          (입력값, 로직처리-연산, 리턴값)
          String canGo = c1.checkFuel(150); 
          가야할 거리를 입력, 필드에 저장되어 있는 연료와 함께 시간당

 */
		Bus b1 = new Bus();
		//참조변수.필드 = 데이터
		b1.nums = "8001";
		b1.target = "서울~인천";
		Bus b2 = new Bus();
		b2.nums = "9001";
		b1.target = "서울~부산";
		Bus b3 = new Bus();
		b3.nums = "7001";
		b1.target = "서울~대구";
		System.out.println(b1.nums);
		System.out.println(b2.nums);
		System.out.println(b3.nums);
		
		// ex1) Cat : 종류, 이름
		//      c1,c2,c3
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		c1.type = "코숏";
		c2.type = "페르시안";
		c3.type = "뱅갈";
		c1.name = "꿍이";
		c2.name = "팡이";
		c3.name = "뚱이";
		System.out.println(c1.type+"냥이의 이름은 "+c1.name+"이다.");
		System.out.println(c2.type+"냥이의 이름은 "+c2.name+"이다.");
		System.out.println(c3.type+"냥이의 이름은 "+c3.name+"이다.");
		
	}

}
class Bus{
	String nums;
	String target;
}
class Cat{
	String type;
	String name;
	int age;
	boolean gender;
	String [] foods;
	
}
