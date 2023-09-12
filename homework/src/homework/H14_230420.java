package homework;

public class H14_230420 {

	public static void main(String[] args) {
		//문제 1번
		Polygon p1 = new Triangle();
		p1.drawing();
		Polygon p2 = new Square();
		p2.drawing();
		Polygon p3 = new Pentagon();
		p3.drawing();
	}
}
//문제 1번
class Polygon{
	private String kind;

	public Polygon(String kind) {
		this.kind = kind;
	}
	public void drawing() {
		System.out.print(kind + "모양으로 ");
	}
}
class Triangle extends Polygon{
	public Triangle() {
		super("삼각형");
	}
	@Override
	public void drawing() {
		super.drawing();
		System.out.println(" 세모난 새집을 그리다.");
	}
}
class Square extends Polygon{
	public Square() {
		super("사각형");
	}	
	public void drawing() {
		super.drawing();
		System.out.println(" 네모난 빌딩을 그리다.");
	}
}
class Pentagon extends Polygon{
	public Pentagon() {
		super("오각형");
	}
	public void drawing() {
		super.drawing();
		System.out.println(" 벌집을 그리다.");
	}	
}
/*
[1단계:조별] 
1. 다형성을 대한 내용에 대하여 정리해보자.
다형성은 상위클래스를 상속받은 하위클래스에서 기능적으로 분리해 다양한 기능을 처리하는 것이다.
상위객체 가 여러가지 하위객체를 통해 다양한 기능을 처리한다.     
          
      1) 다형성을 위해 오버라이딩을 사용하는 이유를 아는가?
         상위 메서드의 기능을 하위 메서드에서 사용하기 위해 오버라이딩을 한다.
         
      2) 다형성을 처리하기 위한 클래스 구조를 이해하고 만들 수 있는가?
      3) 상위클래스를 다각형으로 하고, 하위 클래스를 삼각형, 사각형, 오각형으로 선언하여, 필드 kind, 기능메서드 drawing()을 처리하여 출력되게 하세요
      삼각형 ==> 삼각형 모양으로 (세모난 새집을 그리다.), 사각형 ==> 사각형 모양으로 (네모난 빌딩을 그리다)...
==> 코드는 위에 있습니다.      
      
[1단계:개념] 2. 선택자 중에서 계층적 선택자의 종류와 특징을 기본예제와 함께 기술하세요
계층적 선택자의 종류
1. 자식 선택자 ( 부모 자식 관계인 두 선택자는 '>'  기호를 사용)
3. 자손 선택자 (여러 계층이 있더라도 적용되는 경우)
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
        <style>
            h1{background-color: floralwhite; color: blueviolet;}
			div > strong{color:indigo; border:3px double pink;} // 자식 선택자 사용
			ul strong{background-color:papayawhip;} 
        </style>
    </head>
    <body>
    	<div>
    		<strong>계층구조</strong>
    		<ul> // 위 아래 모두 계층으로 이루어져 있으므로 자손 선택자이다.
    			<li>첫번째 문장</li>
    			<li><strong>두번째 문장</strong></li>// 자식 선택자 사용
    			<li>세번째 문장</li>
    			<li>네번째 문장</li>	
    		</ul>
    	</div>
    </body>

</html>

[1단계:개념] 3. 속성 선택자 종류를 기본예제와 함께 기술하세요
속성 선택자의 종류
1. 선택자[속성=속성값]
input[type = text]{background-color: pink;}

2. [속성=속성값]
[type = password]{background-color: mistyrose;}

3. [속성]
[name]{border: 3px double blue;} 

[1단계:확인] 4. 회원등록화면을 table안에 만들고, 전체선택자와 속성선택자의 단계(선택자[속성=속성값],[속성=속성값],[속성])에 따라 css가 다르게 선언된 것을 적용되게 하세요
<!DOCTYPE html>
<html>
	<head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
		<style type = "text/css">			
        *{color: dimgray;}
        input[type = text]{background-color: pink;}
        [type = password]{background-color: mistyrose;}
        [name = jihoon]{color: palevioletred;}
        [name]{border: 3px double blue;}       
		</style>
	</head>
	<body>
	<form>
		<table>
	    	<tr><th>회원 등록 화면</td></th>
	    	<tr><td>회원 아이디</td><td> <input type="text"/></td></tr>
	    	<tr><td>회원 비밀번호</td><td> <input type = "password"/></td></tr>
		    <tr><td>회원 이름</td><td> <input name = "jihoon"/></tr>
		    <tr><td>정보 입력 후 등록 버튼을 누르세요.</td><td> <input type = "button" vlaue = "등록"/></td></tr>
		</table>
	</form>
	</body>
</html>
[1단계:확인] 5. 가상클래스의 종류를 간단한 예제와 함께 기술하세요.
가상클래스의 종류
1.마우스
  - :hover
  - :active
2.폼 하위 요소 객체
  - :focus 
3. 링크
  - :link
  - :visited
4.블럭 태그에 적용
  - :first-letter
  - :first-line
5.구조 처리
  - :nth-child(even|odd)

<!DOCTYPE html>
<html>
	<head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
		<style type = "text/css">
		td:hover{background-color: aliceblue; color : indigo;} //마우스 커서를 올리면 배경색과 글자색이 변경된다.
        tr:active{font-size: 30px;} // 폰트사이즈가 커진다.
		</style>
	</head>
	<body>
    <table align="center">
        <tr><td>클릭해보세요.</td></tr>
        <tr><td>마우스 커서를 올려보세요</td></tr>
        <tr><td>나는 아무것도 안할거야</td></tr>
    </table>   
	</body>
</html>

[1단계:개념] 6. 다형성을 위한 상위 클래스를 멤버(필드,생성자,재정의메서드) 예제와 함께 설명하세요.
class ShoppingSite{
	private String kind; //필드

	public ShoppingSite(String kind) { //생성자
		this.kind = kind;
	}
	public void search() { //재정의메서드
		System.out.println("쇼핑몰 사이트에 " +kind + "가 있다.");
	}	
}

[1단계:개념] 7. 다형성을 위한 하위 클래스의 구성을 예제와 함께 설명하세요.
class Onepice extends ShoppingSite{
	public Onepice() { // 생성자
		super("원피스");
	}
	public void search() { //다형성 처리 (상위=하위)한 오버라이딩 메서드이다.
		super.search();
		System.out.println("쇼핑몰에 원피스는 총 100벌이 있다.");
	}
}
 */