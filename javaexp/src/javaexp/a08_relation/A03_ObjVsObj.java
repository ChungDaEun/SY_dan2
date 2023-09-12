package javaexp.a08_relation;

import javaexp.a08_relation.vo.Car;
import javaexp.a08_relation.vo.CarRacer;
import javaexp.a08_relation.vo.Computer;
import javaexp.a08_relation.vo.Cpu;
import javaexp.a08_relation.vo.HPUser;
import javaexp.a08_relation.vo.HandPhone;
import javaexp.a08_relation.vo.Ram;

public class A03_ObjVsObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhone hp = new HandPhone("삼성", 120000);
		
		HPUser hs = new HPUser("홍길동");
		String name = "홍길동";
		hs.setName(name); //질문,,!!!!! 왜 홍길동은 호출 안되는 거야..? 답: 밑 호출이 덮음
		hs.setName("마길동");
		
		hs.buyPhone(hp);
		hs.buyPhone(new HandPhone("애플", 300000));

		hs.callByPhone();
		
		//Car, CarRacer 객체 생성
		CarRacer cr = new CarRacer("정다은");
		cr.buyCar(new Car("그랜저",3500));
		cr.drivingCar();

		/*
		 ex) 1:1 관계
		 Package javaexp.a08_relation.vo에 추가하세요
		 	Cpu(제조사, 사양, showInf() 제조사 사양 출력) 클래스를 선언
		 	computer(종류(조립/완성품), cpu, addCpu(...), showCom 컴퓨터가 cpu가 없다/ cpu의 정보는 ...)
		 
		 1. javaexp.a08_relation.vo에 
		    1) Cpu 클래스 선언 및 필드/생성자/메서드 추가
		    		주의) 메서드 : showInf()에서 제조사 사양 출력
		    2) computer 클래스 선언 Cpu 클래스를 포함한 필드 선언 생성자 기능메서드 선언
		    		주의) 메서드 : addCpu() cpu객체 할당
		    			         showCom() 통해서 Cpu객체가 할당되어 있을 때와 그렇지 않을 때를 구분하여 처리
		 */
		Cpu cp1 = new Cpu("인텔", "i7 3.4Ghz");
		Ram r1 = new Ram("정다은", 64);
		Computer com1 = new Computer("조립");
		com1.addCpu(cp1);
		com1.showCom();
	}

}
