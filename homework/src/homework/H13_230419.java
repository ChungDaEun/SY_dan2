package homework;

import homework.H13_1.Kmelon;

public class H13_230419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[1단계:조별] 1. 접근제어자에 이해와 구현
      1) 접근제어자의 4가지 이해하고 설명할 수 있는가?
      2) 접근제어자에 맞게 구현할 수 있는가?
      3) default와 protected의 상속관계 객체내에서 호출시 어떤 문제가 있고, 원인은 무엇인가?
         default는 상속되었더라도 다른 패키지에서 호출할 수 없고
         protected도 상속해서 처리하는 방식이 아닌 객체 생성 후 처리라 다른 패키지에 있는 클래스에서 호출불가하다.
         
         # 상위 관계 외부 패키지에서 클래스에서 protected 접근제어자가 설정된 필드에 대하여 객체 생성형식으로 호출하면 접근할 수 없고
           반드시 상속관계에서 호출하는 형식으로 처리해야 접근이 가능하다.
           class Son extends WoodCutter{
           		void callWoodCutter(){
           			WoodCutter w = new WoodCutter();
           			System.out.println(w.inheritMoney);
           			// protected이지만 객체생성 참조변수.필드이기에 접근 불가
           			System.out.println(inheritMoney);
           			// 상속관계 바로 필드 호출 가능
           		}
           } 
         
      4) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
         패키지2 : 당근, 양파
         패키지3 : 수박(참외상속)
         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
1. 참외
package homework.H13_1;

public class Kmelon {
	private String kmelon = " 나는 한국에서만 먹는 참외이다. ";
	String ktaste = " 한국의 과일은 달다.";
	protected String taste = "과일은 야채가 될 수 없다.";
	public String fruit = "모든 과일은 달다.";
	
	void callFruit() {
		Kmelon km = new Kmelon();
		System.out.println("private: " + km.kmelon);
		System.out.println("(X)default: " + km.ktaste);
		System.out.println("protected: " + km.taste);
		System.out.println("public: " + km.fruit);
	}
}

2. 사과
package homework.H13_1;

public class Apple {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon); private는 해당 클래스에서만 정의가능하다
		System.out.println("(X)default: " + km.ktaste);
		System.out.println("protected: " + km.taste);
		System.out.println("public: " + km.fruit);
	}
}

3. 멜론
package homework.H13_1;

public class Melon extends Kmelon {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon); 상속되었어도 private는 해당 클래스에서만 정의가능하다.
		System.out.println("(X)default: " + km.ktaste);
		System.out.println("protected: " + km.taste);
		System.out.println("public: " + km.fruit);
	}
}


4. 바나나
package homework.H13_1;

public class Banana {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon); private는 해당 클래스에서만 정의가능하다
		System.out.println("(X)default: " + km.ktaste);
		System.out.println("protected: " + km.taste);
		System.out.println("public: " + km.fruit);
	}
}

5. 딸기
package homework.H13_1;

public class strawberry {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon); private는 해당 클래스에서만 정의가능하다
		System.out.println("(X)default: " + km.ktaste);
		System.out.println("protected: " + km.taste);
		System.out.println("public: " + km.fruit);
	}
}

6. 당근
package homework.H13_2;

import homework.H13_1.Kmelon;

public class Carrot {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon);
//		System.out.println("(X)default: " + km.ktaste);
//		System.out.println("protected: " + km.taste);
		// 클래스, 패키지도 다르고 Kmelon클래스에 상속되지 않아서 오류가 난다.
		System.out.println("public: " + km.fruit);
	}
}

7. 양파
package homework.H13_2;

import homework.H13_1.Kmelon;

public class Onion {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon);
//		System.out.println("(X)default: " + km.ktaste);
//		System.out.println("protected: " + km.taste);
		// 클래스, 패키지도 다르고 protected도 상속해서 처리하는 방식이 아닌 객체 생성 후 처리라 오류가 생긴다.
		System.out.println("public: " + km.fruit);
	}
}


8. 수박
package homework.H13_3;

import homework.H13_1.Kmelon;

public class Watermelon extends Kmelon {
	void callFruit() {
		Kmelon km = new Kmelon();
//		System.out.println("private: " + km.kmelon);
//		System.out.println("(X)default: " + km.ktaste);
//		System.out.println("protected: " + km.taste);
		// 클래스, 패키지도 다르고 protected도 상속해서 처리하는 방식이 아닌 객체 생성 후 처리라 오류가 생긴다.
		System.out.println("public: " + km.fruit);
	}
}

[1단계:개념] 2. this.필드, this()의 사용에 있어서 차이점을 예제로 기술하세요.
class Person{
	String name;
	int age;
	String loc;
	public Person() {
		System.out.println("객체 생성");
	}
	public Person(String name) {
		this(); // 생성자를 호출하면서 매개변수가 없는 생성자도 호출
		this.name = name; // public안의 name과 밖의 name이 같다는 것을 알려준다.
		System.out.println("매개변수 1개");
	}

[1단계:확인] 3. Team(팀명,승,무,패,승률)을 생성자의 매개변수(0~5)로 오버 로딩 선언하여 this()로 호출 처리하게 하세요
package homework.H13_4;

public class Problem3 {

	public static void main(String[] args) {

	}
}
class Team{
	String nameT;
	String win;
	String tie;
	String lose;
	String odds;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Team(String nameT) {
		this();
		this.nameT = nameT;
	}
	public Team(String nameT, String win) {
		this(nameT);
		this.win = win;
	}
	public Team(String nameT, String win, String tie) {
		this(nameT, win);
		this.tie = tie;
	}
	public Team(String nameT, String win, String tie, String lose) {
		this(nameT, win, tie);
		this.lose = lose;
	}
	public Team(String nameT, String win, String tie, String lose, String odds) {
		this(nameT, win, tie, lose);
		this.odds = odds;
	}	
}

[1단계:개념] 4. this, super의 차이를 상속관계에서 필드, 생성자, 메서드의 관점에서 예제를 통해 기술하세요.
class Family{
	private String aptName;
	public Company(String aptName) {
		this.aptName = aptName;
	}
	public void familyHappy() {
		System.out.println(aptName + "화목하다.");
	}
}
class HyunDaeApt extends Family{
	public HyunDaeApt() {
		super("302호가족");
	}
	public void familyHappy() {
		System.out.print("항상 ");
		super.familyHappy();
	}
}
// this는 현재 클래스의 변수 및 메서드에 액세스할 수 있고 super는 부모 클래스를 나타낸다.
[1단계:개념] 5. 메서드 오버라이딩(overriding)을 메서드 오버로딩(overloading)과의 차이점을 기술해보세요.
오버로딩은 이름은 같지만 타입, 갯수가 다를때 다른 메소드를 중복으로 선언하는 것을 의미하고
오버라이딩은 부모 클래스이 메소드를 재정의하여 우선 사용하는 것이다.

[1단계:개념] 6. 선택자중 태그, 아이디, 클래스, 중첩적용의 예를 만들고 설명하세요.
1. 태그
<head>
<style>
	.cls01{color:Lavender;} //cls01의 글자색을 라벤더 색으로 정의
	.cls02{color:indigo;} //cls02의 글자색을 인디고 색으로 정의
</style>
</head>
<body>
	<h2 class = "cls01">안녕하세요1</h2> //안녕하세요가 라벤더색으로 출력된다.
	<h3 class = "cls02">안녕하세요1</h2> //안녕하세요가 인디고색으로 출력된다.
</body>

2. 아이디
<head>
<style>
	#id01{color:navy;} //id01의 글자색을 네이비로 지정한다.
</style>
</head>
<body>
<h3 id="id01">안녕하세요</h3> // 안녕하세요가 네이비로 출력된다.
</body>
3. 클래스
<head>
<style>
	.cls01{color:Lavender;} //cls01의 글자색을 라벤더 색으로 정의
</style>
</head>
<body>
	<h2 class = "cls01">안녕하세요1</h2> //안녕하세요가 라벤더색으로 출력된다.
</body>

4. 중첩적용

 */

	}

}
