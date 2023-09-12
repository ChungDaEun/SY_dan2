package homework;

public class H06_230406 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
/*
[1단계:개념] 1. http://localhost:8080/frontWeb/a01_start/a01_show.html를 브라우저를 통해 실행했다고 한다.
           위 url의 각 구성요소의 의미를 기술하세요
http : html 데이터를 최적으로 전달하는 네트워크상 프로토콜
localhost - 현재 pc(서버/클라이언트 같이 있을 때 사용)
8080 : 한 pc내에서 여러개 서비스는 지원하고자 할 때 사용
/frontWeb/a01_start/a01_show.html : 물리적인 경로이다.
 * 
[1단계:개념] 2. 문자를 강조하는 태그들의 각 기능을 간단한 예제를 통해 기술하세요.
      <b>진하게</b><br> //"진하게"라는 문장이 진한글씨로 출력된다.
      <strong>중요한</strong><br>//"중요한"라는 문장이 진한글씨로 출력된다.
      <em>강조</em><br> //"강조"라는 문장이 강조 된 글씨로 출력된다.
      <b><i>진하게 하고 이탤릭</i></b> //"진하게 하고 이탤릭"라는 문장이 진하고 이탤릭한 글씨로 출력된다.
      
[1단계:개념] 3. 특수문자를 처리하는 코드를 예제를 통해 기술해 보세요.
       20  &divide; 10 = 2 <br> //20 ÷ 10 = 2로 출력된다.
       &radic;2 = 1.414<br> //√2 = 1.414 로 출력된다.
       20 &nbsp;&nbsp; &lt; &nbsp;&nbsp;&nbsp; 50 <br> 20 < 50으로 출력된다. 
       오늘 &quot; 나 &#34; 는 학원에 왔다. // 오늘 "나"는 학원에 왔다. 으로 출력된다.

[1단계:개념] 4. html에서 줄바꾸기와 공백에 대한 처리방식을 2가지가 있다. 일단, 기본 코드로 처리되는 내용을 예제와 함께 설명하고, 두번째 방식에 대한 내용을 예제와 함께 기술하세요             
   <pre>
         줄 바꿈
   </pre>
   // 공백처리의 기본적 예시
    
   <p> 줄바꿈 <br> 줄바꿈</p>
   // 공백처리 특수키 사용한 예제

[1단계:코드] 5. html에서 h1~h6, 속성 align, hr, br, p태그를 활용하여, 위키백과사전에서 검색된 자바, ajax, jsp, 스프링의 내용을 각 과목의 타이틀과 함께 웹화면에 출력되게 하세요
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <!-- html에서 h1~h6, 속성 align, hr, br, p태그를 활용하여, 
      //    위키백과사전에서 검색된 자바, ajax, jsp, 스프링의 내용을 각 과목의 타이틀과 함께 웹화면에 출력되게 하세요-->
        
     <h1 align = "center">JAVA</h1>
     <hr>
     <p align = "right">자바 (Java) - 객체 지향 프로그래밍 언어</p>
     
     <hr>
     <p align = "center">설명</p>
     <p align = "center">
         자바서버 페이지 (JSP, JavaServer Pages) 
             - HTML 문서에 자바 코드를 삽입하여 동적 웹 페이지를 생성하는 프로그래밍 언어<br>
         자바 애플릿 (Java Applet) 
             - 자바 바이트코드 형태로 배포되는 애플릿<br>
         자바 라이브러리 (Java Library) 
          - 다양한 패키지를 Zip으로 묶어 .jar 로 변환한 파일
     </p>

     <h2 align = "center">Ajax</h2>
     <hr>
     <p align = "right">Ajax(Asynchronous JavaScript and XML, 에이잭스)<br>
     
     <hr>
     <p align = "center">설명</p>
     <p align = "center">
             Ajax(Asynchronous JavaScript and XML, 에이잭스)는<br>
             비동기적인 웹 애플리케이션의 제작을 위해 아래와 같은 조합을 이용하는 웹 개발 기법이다.<br>
         표현 정보를 위한 HTML (또는 XHTML) 과 CSS <br>
            동적인 화면 출력 및 표시 정보와의 상호작용을 위한 DOM, 자바스크립트 <br>
            웹 서버와 비동기적으로 데이터를 교환하고 조작하기 위한 XML, XSLT, XMLHttpRequest 
            (Ajax 애플리케이션은 XML/XSLT 대신 미리 정의된 HTML이나 일반 텍스트, JSON, JSON-RPC를 이용할 수 있다).
     </p>     

     <h3 align = "center">JSP(스프링)</h3>
     <hr>
     <p align = "right">JSP(Java Server Pages)<br>
     
     <hr>
     <p align = "center">설명</p>
     <p align = "center">
     커뮤니티와 쇼핑몰 사이트에서 주로 쓰이는 PHP와 달리, JSP는 주로 대규모 기업용 시스템 구축에 사용된다. <br>
     이런 환경에서는 보통 Java Enterprise Edition(J2EE)의 사양을 만족하는 웹 애플리케이션 서버 위에서 <br>
     프로그램을 운용하게 된다. J2EE는 JSP의 실행 뿐만 아니라 DB 커넥션 풀, 메시징 시스템, 로드 밸런싱 등등 <br>
     화려한 기능들로 무장하고 있다.<br>
     이로 인해 규모가 방대하고 무거우며, 메모리 등의 자원도 많이 사용하게 되고 상대적으로 초기 로딩도 느리다.<br> 
     J2EE 웹 서버계의 최고봉은 BEA의 WebLogic이었지만 지금은 오라클에 인수된 상태이다.<br>
     한국 한정으로 공공기관 등에 자주 쓰이는 티맥스소프트의 JEUS도 J2EE 애플리케이션 서버다.<br>
     </p>

     <h4 align = "center">SPRING(스프링)</h4>
     <hr>
     <p align = "right">SPRING(스프링)<br>
         - 스프링 프레임워크(영어: Spring Framework)<br>
     
     <hr>
     <p align = "center">설명</p>
     <p align = "center">
     스프링 프레임워크(영어: Spring Framework)는<br>
     자바 플랫폼을 위한 오픈 소스 애플리케이션 프레임워크로서 간단히 스프링(Spring)이라고도 한다.<br> 
     동적인 웹 사이트를 개발하기 위한 여러 가지 서비스를 제공하고 있다.<br>
     대한민국 공공기관의 웹 서비스 개발 시 사용을 권장하고 있는 전자정부 표준프레임워크의 기반 기술로서 쓰이고 있다.<br>
     </p>  
                        
</body>
</html>

[1단계:개념] 6. html에서 블럭태그와 인라인 태그의 차이점을 유형을 나열하고, 예제를 통해서 특징을 기술하세요.
1) 블록태그 : 줄 바꿈, 포함하는 코드가 row단위로 추가 가능하다.
              ex) p, h1, div, ul
2) 인라인 태그 : 줄 바꿈 포함하지 않음
              ex) strong, a, img, span
      <!-- 블럭태그 예제 -->
      <h1>사과</h1>
      <h2>바나나</h2>
      <h3>딸기</h3> 
      <!-- 인라인 태그 예제 -->
      <span>시계</span>
      <span>커피</span>
      <span>물</span>

[1단계:개념] 7. 2차원배열의 선언과 할당에 대하여 기본 코드로 설명하세요.
int [][] arry = new int[3][3]; // 선언 및 초기화
arry[0][0] = 50; // 할당
arry[1][1] = 30;// 할당
arry[2][0] = 20;// 할당

[1단계:코드] 8. 2차원으로 회원아이디, 회원명, 회원등급을 설정하여 회원2명을 할당하여 처리할려고 한다.
           초기화하고, 데이터를 입력 후, 반복문을 통해서 출력하세요.
[1단계:코드] 9. 반에 학생이 30명, 5개반에 임의의 점수(0~100)을 할당하고 점수를 아래와 같이 출력하세요
           1반 1번 @@ 점...
[1단계:개념] 10. 객체의 데이터 처리 선언, 초기화, 객체 생성,  호출의 각 단계별로 메모리할당 과정과 의미를 문자열과 숫자형 배열의 예로 설명하세요.
int [] intArry; // 숫자형 배열 선언
String strArry; // 문자형 배열 선언
intArry = null; // 숫자형 배열 초기화
strArry = null; // 문자형 배열 초기화
System.out.print(intArry); // 숫자형 배열 호출
System.out.print(strArry); // 문자형 배열 호출

 */
      
      
      // 8. 2차원으로 회원아이디, 회원명, 회원등급을 설정하여 회원2명을 할당하여 처리하려고 한다.
        //    초기화하고, 데이터를 입력 후, 반복문을 통해서 출력하세요.
		String [][] imforArr = new String[2][3];
		imforArr [0][0] = "minji0622";
		imforArr [0][1] = "최민지";
		imforArr [0][2] = "A";
		imforArr [1][0] = "dan1792";
		imforArr [1][1] = "정다은";
		imforArr [1][2] = "B";
       System.out.println("회원아이디     회원명     회원등급");
       for(int idx = 0; idx < imforArr.length; idx++) {
          for(int jdx = 0; jdx < imforArr[idx].length; jdx++) {
                System.out.print(imforArr[idx][jdx]+"     ");
          }
       System.out.println();
       }
      
      // 9. 반에 학생이 30명, 5개반에 임의의 점수(0~100)을 할당하고 점수를 아래와 같이 출력하세요
        //    1반 1번 @@ 점...
       int [][] stuArr = new int[30][5]; //30명의 학생, 5개반
       for(int idx = 0; idx < stuArr.length; idx++) {
          for(int jdx = 0; jdx < stuArr[jdx].length; jdx++) {
              int pointArr = (int)(Math.random() * 100); //임의의 점수
             System.out.print((jdx+1)+"반\t");
              System.out.print((idx+1)+"번\t");
             System.out.println("점수는"+ pointArr + "점이다.");
          }
          }
       
//     [1단계:개념] 10. 객체의 데이터 처리 선언, 초기화, 객체 생성,  
//     호출의 각 단계별로 메모리할당 과정과 의미를 문자열과 숫자형 배열의 예로 설명하세요.
       
       // 선언
       int[] arry;
       // 초기화1
       arry=null;
       // 초기화2(초기값 0으로 할당)
       arry = new int[3];
       // 초기화3(초기화 데이터 할당)
       arry = new int[] {1000,2000,3000};
       // 선언, 데이터할당 초기화
       int [] arry2 = {2000,3000,4000};
       // 사용(호출/할당)
       System.out.println(arry[0]);
       arry[0] = 5000;
       
       
       // 선언
       String str01;
       //초기화
       str01 = null;
       // 초기화2
       str01 = "hi";
       String str02 = new String("hi");
       // 사용(호출/재할당)
       System.out.println(str01);
       str01 = "nice day";
       // 문자열의 경우 문자열 자체에 대한 비교시 equal()사용
       System.out.println(str01.equals(str02));
      
   }

}
