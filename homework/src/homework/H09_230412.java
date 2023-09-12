package homework;


public class H09_230412 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
/*
[1단계:개념] 1. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
1. 외부의 데이터를 받아서(매개변수로 데이터 처리)
2. 로직처리(아래 내용 전부 또는 일주를 처리하고)
    1. 저장
    2. 출력
    3. 반복문/조건문 처리
3. 최종 결과 데이터를 return값으로 전달하여 메서드가 호출되는 곳에서 처리하는 경우를 말한다.

[1단계:개념] 2. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
생성자는 주로 해당객체를 생성해서 초기값을 설정할 필요가 있을 때 주로 사용한다.
ex) Person : 사람이름, 초기 할당 정보
             age(0) - 숫자형 데이터는 기본적으로 0이기에 설정불가
    Car : 자동차의 종류, 기본 배기량, 최고속도...
메서드는 주로 해당 객체 생성 후 변경죄는 데이터를 처리할 때 사용된다.
	getAge() : 나이를 먹다.
	chLoc("서울") : 사는 곳이 변경되다.
	speedUP(30) : 속도가 증가된다.
	drivingPerson("친구1") : 사람을 태우다.
	
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.showInf(); //생성자로 데이터를 사용할 때
		c1.setData(1000, 2000); //메서드로 데이터를 사용할 때
		// 메서드로 데이터를 사용할때는 직접 데이터를 넣어줘서 선언해야한다.
}		
class Calculator2{
	int num01;
	int num02;

	public void showInf() {
		System.out.println("데이터1: " + num01);
		System.out.println("데이터2: " + num02);
	}
	public void setData(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}
}

[1단계:확인] 3. 메서드(입력+로직) 선언 예제( class RetExp100 하위에 선언하여 호출하세요)
      1) 3개에 입력값 중에 가장 큰수 출력
      2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
      3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
      
[1단계:확인] 4. 메서드(입력+로직+리턴) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
      1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
      2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
      3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
[1단계:확인] 5. 클래스(필드,생성자,메서드) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
      1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
         탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
         버스번호 @@번 @@명이 탑승했습니다. 
[1단계:개념] 6. 클래스내 일반변수, static 변수, final 상수, static final 상수의 차이점을 기본 예제로 설명하세요.
Static: 동일한 클래스를 통해서 나온 객체들이 공유하는 메모리를 저장하기 위한 것
fianl : 키워드를 할당한다.
static final : 객체가 공유하고 한번 할당되면 변경할 수 없는 데이터를 설정하는 것


[1단계:확인] 7. 상대적경로 이동과 절대적 경로 이동예제를 하나씩 만들어 이동처리하세요
 <!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
 		<h2>상대적 경로 이동1</h2>
 		<a href = "a02_show.html">이동할까요?</a>
 		<h2>상대적 경로 이동1</h2>
        <a href ="/front/a02_table/a03_imgTable.html">이미지 테이블로 이동</a>
	</body>
</html>
 */
      //3번 문제
      System.out.println("# 가장 큰 수 찾기 #");
      RetExp100 n1 = new RetExp100();
      n1.BigNum(50,60,70);
      n1.BigNum(80,50,30);
      n1.BigNum(20,44,90);
      System.out.println("# 합격유무 #");
      RetExp100 n2 = new RetExp100();
      n2.pass(80);
      n2.pass(30);
      System.out.println("# 물건 구매 #");
      RetExp100 n3 = new RetExp100();
      String Marr[] = {"사과","바나나","오리"};
      String arr[] = {"사과","바나나","오리"};
      n3.Same(Marr, arr);
      
      //4번 문제
      System.out.println("# 무료 유료 #");      
      RetExp100 n4 = new RetExp100();
      n4.freeP(4);
      n4.freeP(25);
      n4.freeP(66);
      System.out.println("# 입장권 할인율 #");
      RetExp100 n5 = new RetExp100();
      n5.inpass(15);
      n5.inpass(25);
      n5.inpass(35);
      n5.inpass(55);
      System.out.println("# 회원여부 #");
      RetExp100 n6 = new RetExp100();
      String memArr[] = {"ghldnjs", "emdfhr"};
      String getmem = "ghldnjs";
      n6.memCheck(memArr, getmem);
      
      //5번문제
      System.out.println("# 버스 탑승자 수 #");      
      RetExp100 n7 = new RetExp100();
      n7.BusMember(3030, 20);
      n7.BusMember(30, 10);
      n7.BusMember(3030, 20); 
   }

}

class RetExp100{
   int num01;
   int num02;
   int num03;
   int num04;
   String proArr[];
   String getArr[];
   int age;
   String memArr[];
   String getmem;
   int busN;
   int busP;
   static int busT;
   
   void BigNum(int num01, int num02, int num03) {
      if(num01 > num02 && num01 > num03) {
         System.out.println("가장 큰 수는 " + num01 + "입니다.");
      }else if(num02 > num01 && num02 > num03) {
         System.out.println("가장 큰 수는 " + num02 + "입니다.");
      }else if(num03 > num01 && num03 > num02) {
         System.out.println("가장 큰 수는 " + num03 + "입니다.");
      }
      //강사님 답
      int maxNum = 0;
      if(num01>maxNum) {
    	  maxNum = num01;
      }
      if(num02>maxNum) {
    	  maxNum = num02;
      }
      if(num03>maxNum) {
    	  maxNum = num03;
      }
      System.out.println("가장 큰 수: " + maxNum);
   }
   void pass(int num04) {
      if(num04 >= 70) {
         System.out.println("합격입니다.");
      }else {
         System.out.println("불합격입니다.");
      }
   }
   void Same(String proArr[], String getArr[]) {
      if(proArr.equals(getArr)) {
         System.out.println("마트에서 구매가능합니다.");
      }else {
         System.out.println("마트에서 구매하실 수 없습니다.");
      }   
   }
   void freeP(int age) {
      if(age < 5 || age >= 65) {
         System.out.println("무료입장 가능합니다.");
      }else {
         System.out.println("유료입장 입니다.");
      }
   }
   void inpass(int age) { //10대 20%, 20대 15%, 30대 10%, 입장료는 5만원
      if(age >= 10 && age <= 19) {
         System.out.println("10대이므로 20%할인이 됩니다.");
         System.out.println("입장료는 4만원");
      }
      else if(age >= 20 && age <= 29) {
         System.out.println("20대이므로 15%할인이 됩니다.");
         System.out.println("입장료는 47500원");
      }
      else if(age >= 30 && age <= 39) {
         System.out.println("30대이므로 10%할인이 됩니다.");
         System.out.println("입장료는 4만5천원");
      }
      else {
    	  System.out.println("할인받을 수 없습니다.");
      }
   }
   void memCheck(String memArr[], String getmem) {
	   String mArr[] = {"ghldnjs", "emdfhr"};
	   String ckMem = "가입되어 있지 않습니다.";
	   for(String name:mArr) {
		   if(name.equals(getmem)) {
			   ckMem = "가입되었습니다.";
	       }
	   }
	   if(memArr.equals(getmem)) {
		   System.out.println(getmem + "은 회원입니다.");
	   }else {
		   System.out.println("회원이 아닙니다.");
	   }
   }
   static int BusMember(int busN, int busP) {
	   busT += busP;
	   System.out.println("버스의 번호 : " + busN +"번");
	   System.out.println("탑승자 수: " + busP+"명");
	   System.out.println("총 탑승자 수: " + busT+"명");
	   System.out.println("============================================");
	   return busT;
	   
   }
   
}
