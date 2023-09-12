package homework;

public class H17_230427 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
/*
[1단계:개념] 1. 배경이미지관련 속성을 예제와 함께 기술하세요.
div.cls{
   text-align: center;
   width: 300px; height: 300px;
   background-color: antiquewhite;
   background-size: 200px 200px; // 배경 크기 x,y축
   background-image: url("./media/spongebob.png"); // 이미지 주소 위치
   background-repeat: repeat;  // 사진 반복
   background-position: top center; // 사진 위치가 x,y축 위치
}

[1단계:개념] 2. display의 속성 3개 특징을 예제와 함께 기술하세요
1. block
   - 항상 새 라인에서 시작
   - 블럭 박스 내에만 배치
   - 옆에 다른 요소 배치 불가능
   <h1 style = "display: block;"> block 예시</h1>
   <h1 style = "display: block; height: 100px;"> block 예시</h1>
   <h1 style = "display: block; width: 100px; height: 100px;"> block 예시</h1>
   
2. inline
   - 새 라인에서 시작 못함 바로 옆에서 처리된다.
   - 모든 박스 내 배치가 가능
   - 옆에 다른 요소 배치 가능
   <h1 style = "display: inline;"> inline 예시</h1>
   <h1 style = "display: inline; height: 100px;"> inline 예시</h1>
   <h1 style = "display: inline; width: 100px; height: 100px;"> inline 예시</h1>
   
3. inline-block
   - inline 속성과 block속성이 혼합된 속성
   <h1 style = "display: inline-block;"> inline-block 예시</h1>
   <h1 style = "display: inline-block; height: 100px;"> inline-block 예시</h1>
   <h1 style = "display: inline-block; width: 100px; height: 100px;"> inline-block 예시</h1>


[1단계:개념] 3. 배경이미지관련 속성을 예제와 함께 기술하세요.

[1단계:확인] 4. css 글자 그림자 처리 옵션을 지정하여, 화면에 이름, 나이, 사는 곳을 출력하세요.
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div.cls{
            text-align: center;
            color:lightyellow;
            background-color: coral;
            text-shadow: 5px 3px 5px darkolivegreen;
        }
        h2{ text-align: center;}
    </style>
</head>
<body>
    <h2>자기소개</h2>
    <div class="cls">
        이름 : 우지호 <br>
        나이 : 32세<br>
        사는 곳 : 서울<br>
    </div>
</body>
</html>

[1단계:개념] 5. position 옵션을 예제를 통해 기술하세요.
div.cls{
   text-align: center;
   width: 300px; height: 300px;
   background-color: antiquewhite;
   background-size: 200px 200px; // 배경 크기 x,y축
   background-image: url("./media/spongebob.png"); // 이미지 주소 위치
   background-repeat: repeat;  // 사진 반복
   background-position: top center; // 사진 위치가 x,y축 위치
}
position은 위치를 지정하고 형태를 설정할 때 사용한다.

[1단계:개념] 6. Object의 메서드의 기능을 기술하세요.
자바의 모든 클래스의 최상위 클래스로 사용한다.
모든 클래스는 object를 상속하고 있고 그러므로 기본적인 메서드는 재정의하거나 사용할 수 있다.

[2단계:확인] 7. 물건명, 가격, 갯수를 필드로 하는 Product클래스를 생성하고 사용하되, 
             재정의하여 객체 생성 후, 참조 변수를 호출했을 때, 물건명/가격/갯수/총계를 출력할려면 처리해야 할 내용은?
    아래에 정답 있습니다.
             
[1단계:개념] 8. String의 비교연산자의 비교와 equals()처리 형식의 차이점에 대하여 기술하세요
String fru1 = "사과";
String fru2 = "사과";
String fru3 = new String("사과");
String fru4 = new String("사과");

name1 == name2 ? false
name3 == name4 ? false
name1 == name4 ? true
name2.equals(name4) ? true
'=='는 stack영역의 데이터를 비교하여 boolean값을 가져오는 것이라 무조건 객체가 다른 위치인 heap영역에 생성된다.
그러므로 name1, name2 는 false이다. 그러므로 equals를 사용해야 같은 위치로 지정할 수 있다.

[1단계:개념] 9. String 생성자의 주요 매개변수를 통한 처리 내용을 기술하세요


[1단계:확인] 10. 임시비밀번호를 알파벳 대소문자 숫자를 조합해서 10자를 만드는 프로그램을 만드세요
 아래에 정답 있습니다.
[2단계:확인] 11. charAt()를 활용하여, 우리나라에서 가장 많은 성 1~10, 가장 많이 사용하는 이름 중간자, 가장 많이 사용하는 마지막자를 조합하여 임의의 이름 3개를 출력하세요
  아래에 정답 있습니다.
 */
      //7번문제
      Product p = new Product("사과", 3260, 6);
      System.out.println("물건명 : " + p.getProdN());
      System.out.println("물건 가격 : " + p.getPrice());
      System.out.println("물건 갯수 : " + p.getCnt());
      System.out.print(p);
      int tot = p.getCnt() * p.getPrice();
      System.out.println(tot + "원");
      
      // 10번 문제
      // 대문자의 범위 65~90, 소문자의 범위 97~122, 숫자 48~57
      char [] arr = new char[10];
      for(int i = 0; i < arr.length; i++) {
         int num = (int)(Math.random() * 62 + 48);
         if(num > 57) num += 8; 
         if(num > 83 && num < 109) num += 14;
         arr[i] = (char)num;
      }
      String str = new String(arr);
      System.out.println("랜덤 비밀번호(10자): " + str);
      
      // 11번 문제
      String firstN = "김이박최정강조윤장임";
      String middletN = "이도서하아은지서시선";
      String lastN = "준서윤아우호린현유안";

      for(int i = 0; i < 3; i++) {
    	  int n1 = (int)(Math.random() * 10 + 1);
    	  int n2 = (int)(Math.random() * 10 + 1);
    	  int n3 = (int)(Math.random() * 10 + 1);
    	  System.out.print(firstN.charAt(n1));
    	  System.out.print(middletN.charAt(n2));
    	  System.out.println(lastN.charAt(n3));
      }
      
      
   }
}

// 7번 문제
class Product{
   private String prodN;
   private int price;
   private int cnt;
   public Product(String prodN, int price, int cnt) {
      this.prodN = prodN;
      this.price = price;
      this.cnt = cnt;
   }
   public String getProdN() {
      return prodN;
   }

   public int getPrice() {
      return price;
   }
   public int getCnt() {
      return cnt;
   }
   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return "총 가격: ";
   }   
}