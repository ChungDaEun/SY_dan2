package homework;

public class H07_230410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[1단계:개념] 1. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
{
		LotteTower seoul = new LotteTower();
		LotteTower busan = new LotteTower();
		LotteTower jeju = new LotteTower();
}
class LotteTower{}
 ==>  위 코드에서 롯데타워 클래스가 있으면 서울, 부산, 제주에도 똑같은 롯테타워를 만들 수 있다.

[1단계:개념] 2. 필드의 특성을 예제를 통해 기술하세요
Computer(String comN){
		this.comN = comN;
}
초기화를 하지 않아도 기본값이 자동으로 초기화됨 => 위와 같이 클래스에서 이미 초기화 했기 때문이다.

[1단계:개념] 3. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
생성자는 클래스 생성시에 단 한번만 호출되고 일반 메서드와 달리 필요할 때마낟 호출될 수 없다.

[1단계:코드] 4. Computer 클래스에서 속성으로 제조사, cpu종류, ram 메모리용랑, ssd용량을 속성을 지정하여,
      기본생성자, 매개변수가 3개인 생성자(오버로딩규칙에 의해 2개 선언)를 선언하고, 객체를 생성하고 확인하세요.
      
[1단계:개념] 5. html의 meta 정보의 의미를 기술하세요.
1. 데이터를 설명하는 데이터 ==> 사진, 오디오, 이미지 데이터 등
2. html 페이지에 대한 메타 데이터를 담기 위한 태그
3. 웹 페이지들의 기본 url과 페이지가 출력된 윈도우 지정

[1단계:개념] 6. base 태그를 처리하는 방법을 예제를 통해서 기술하세요.
 		<head>
 		<base href = "http://localhost:8080/frontWeb/a02/a01_test.html"> </head>
 		<body>
		<a href = "a01_test.html">연습페이지 이동(base 이동)</a><br></body>
		==> 주소를 다 작성하지 않아도 a01_test.html 파일이름만 작성하면 이동이 가능하다


[1단계:개념] 7. img 태그가 가지고 있는 속성을 기술하세요.
img src="이미지경로/이미지 파일"
alt = "이미지없을 때 대체할 문자열"
width = "이미지 폭"
height = "이미지 높이"

[1단계:확인] 8. webapp 하위에 a00_img안에 img03.jpg를 복사해와서 현재 폴드에서 
      img 태그로 호출해서 수행 하는 것과,  a00_img하위  img05.jpg
      파일을 해당 경로 그대로 두고, img 태그로 호출해서 수행하는 것의 차이점을 기술하세요.
      첫번째 경우는 파일 경로만 알면 코드생략하고 호출가능하고
      두번째의 경우는 파일 경로 모두가 필요하다.
 */
	}
	//4. Computer 클래스에서 속성으로 제조사, cpu종류, ram 메모리용랑, ssd용량을 속성을 지정하여,
    //   기본생성자, 매개변수가 3개인 생성자(오버로딩규칙에 의해 2개 선언)를 선언하고, 객체를 생성하고 확인하세요.
	
	Computer p01 = new Computer("삼성");
	Computer p02 = new Computer("삼성","intel - i7",16);
	Computer p03 = new Computer("intel - i7",500 ,"삼성");

}
class Computer{
	String comN;
	String cpu;
	int ram;
	int ssd;
	Computer(String comN){
		this.comN = comN;
		System.out.println("#기본생성자#");
		System.out.println("제조사의 이름은?: " + comN);
	}
	Computer(String comN, String cpu, int ram){
		this.comN = comN;
		this.cpu = cpu;
		this.ram= ram;
		System.out.println("#매개변수가 3개인 생성자1#");
		System.out.println("제조사의 이름은?: " + comN);
		System.out.println("cpu의 종류는?: " + cpu);
		System.out.println("ram 용량은?: " + ram);
	}
	Computer(String cpu, int ssd, String comN){
		this.comN = comN;
		this.cpu = cpu;
		this.ssd= ssd;
		System.out.println("#매개변수가 3개인 생성자2#");
		System.out.println("cpu의 종류는?: " + cpu);
		System.out.println("ssd 용량은?: " + ssd);
		System.out.println("제조사의 이름은?: " + comN);

	}

}