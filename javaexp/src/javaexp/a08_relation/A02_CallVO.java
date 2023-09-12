package javaexp.a08_relation;

import javaexp.a08_relation.vo.Music;
import javaexp.a08_relation.vo.Person;

public class A02_CallVO {
	// ex) javaexp.a08_relation.vo 안에 Music VO클래스 선언
	//      Music 제목, 가수, 발매연도
	//      Main() 호출

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person("표지훈",31,"서울");
		System.out.println(p01.getName());
		System.out.println(p01.getAge());
		System.out.println(p01.getLoc());
		
		Music m1 = new Music("소년처럼", "표지훈", 2018);
	    System.out.println(m1.getNameM());
	    System.out.println(m1.getSinger());
	    System.out.println(m1.getYearM());

	}


}
