package homework;

public class H16_230425 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
/*
[1단계:개념] 1. 예외 처리의 기본형식 코드를 수행시키고, 해당 코드가 의미하는 바를 구체적으로 기술하세요.
[1단계:확인] 2. args로 입력 받게 하고, 물건명 가격 갯수를 입력 받게 하고 입력이 없을 시  "물건정보를 입력하세요!" 라고 예외 처리로 처리되게 하세요.
[1단계:개념] 3. 실행예외와 컴파일예외의 차이점을 예제로 설명하세요.
[1단계:개념] 4. 예외처리의 계층 구조에 따른 선언 순서를 기술하세요.
[1단계:확인] 5. args[0], String name=null;name.toString(); 해당 내용을 구체적 예외는 처리하고, 그외는 Exception처리하는다중예외를 처리하세요.
[1단계:개념] 6. 동적처리하는 가상클래스의 내용을 예제와 함께 기술하세요.
[1단계:개념] 7. 공통 속성값인 색상 선언 규칙 3가지를 기술하세요
[1단계:개념] 8. 공통 속성값인 단위(크기,넓이,폭)을 기본예제와 함께 설명하세요
 */
      //1번 문제
      System.out.println("# 예외 처리의 기본 형식 #");
      try { 
         // try는 예외처리 블럭이다. 만약 try가 없을 때 에러가 나면 프로그램이 종료되지만
         // try{}catch문이 있으면 계속 수행 할 수 있다.
         System.out.println("1");
         System.out.println("2");
         System.out.println(args[1]); 
         // 예외문 (arg[1]에는 데이터 없음), 예외문을 던진다
         // 예외문을 던진 후에는 다음 내용은 수행되지 않는다.
         // 그러므로 아래 3은 출력되지 않음
         System.out.println("3");
      }catch(Exception e){
         // catch문은 예외가 발생했을 때 넘어오는 블럭이다.
         System.out.println("4");
         // try에서 예외문을 던졌음으로 catch에 있느 코드가 실행되어 4가 출력됨
      }
      
      //2번문제 
      System.out.println("# 물건 구매 #");
      try {
         String name = args[0];
         int price = Integer.parseInt(args[1]);
         int cnt = Integer.parseInt(args[2]);
         System.out.println("물건명 : " + name);
         System.out.println("물건 가격 : " + price);
         System.out.println("물건 갯수 : " + cnt);
      }catch(ArithmeticException e){
         System.out.println("물건정보가 없습니다.");
         System.out.println("물건정보를 입력하세요!");
      }
      
      // 3번
      /*
       실행 예외 : 실행할 때 발생하는 예외를 처리
       컴파일 예외 : 컴파일 할때 발생하는 예외를 처리
       */
      System.out.println("# 실행 예외문 #");
      try {
         String prod = null;
         System.out.println("마트에서 구매할 물건 : " + prod);
      }catch(NullPointerException e){
         System.out.println("물건이 없다!");
      }
      
      System.out.println("# 컴파일 실행문 #");
      try {
         Class.forName("nimo");
      }catch(ClassNotFoundException e) {
         System.out.println("클래스를 찾을 수 없습니다.");
      }
      
      //4번 예외처리의 계층 구조에 따른 선언 순서를 기술하세요
/*      try {
         
      }catch(NullpointerException e) { // 최상위
      }catch(ClassNotFundException e) { // 차상위
      }catch(Exception e) { //상위
      }finally { // 예외가 있든지 없든지 처리해야하는 코드
      }
*/
      //문제5
//      args[0], String name=null;name.toString(); 해당 내용을 구체적 예외는 처리하고, 그외는 Exception처리하는다중예외를 처리하세요.
      String name = null;
      try {
         System.out.println(args[0]);
         System.out.println(name);
         System.out.println(name.toString());
         System.out.println(Integer.parseInt("숫자"));
      }catch(ArrayIndexOutOfBoundsException e) { // args[0] 예외 처리
         System.out.println("데이터가 입력되지 않았습니다.");
      }catch(ArithmeticException e) { //name 예외처리
         System.out.println("이름이 없습니다.");
      }catch(NullPointerException e) { //name.toString() 예외처리
         System.out.println("데이터 입력 예외입니다.");
      }catch(Exception e) { //그외 예외처리
         System.out.println("숫자가 아닙니다.");
      }
      
      //문제6 동적처리하는 가상클래스의 내용을 예제와 함께 기술하세요.
      
     
      /* 
       <문제 7>
         1. 색 이름 표현 :css3표준으로 140개의 색
         2. 16진수 표현 : 2개 단위로 색상 비율 조합
         3. 10진수 코드와 rgb()로 표현 :red, green, blue로 3가지 색상을 조합해서 표현
         
         ex) 보라색의 각각 다른 색 표현
             색 이름 표현 : purple
             16진수 표현 :#800080
             10진수 표현 : rgb(128,0,128)

       <문제 8>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table border = "1pt" width = "50%" height = "250pt"> 
       <col width = "50%"><col width = "50%"> 
        <tr> <th>이름</th> <th>나이</th></tr>
        <tr> <td style = "font-size: 2em">유기환</td> <td style = "font-size: 50%">5세</td> </tr> // 상대적 크기 표현
        <tr> <td style = "font-size: 2px">나미리</td> <td style = "font-size: 4in">6세</td> </tr> // 절대적 크기 표현
        <tr> <td style = "font-size: 2pt">이제훈</td> <td style = "font-size: 4pc">9세</td> </tr> // 절대적 크기 표현
    </table>  
</body>
</html>
       */
   }
}
