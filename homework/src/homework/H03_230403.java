package homework;

import java.util.Scanner;

public class H03_230403 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
/*
04/03
[1단계:개념] 1. 3항 연산자의 기본형식을 새로운 예제로 설명하세요
학원에 3번 이상 지각한 사람은 벌칙 아닌 사람은 수료
String tardy >= 3? "벌칙" : "수료";
// tardy 값이 3이상이면 벌칙, 3미만이면 수료가 출력됨

[1단계:코드] 2. 3항 연산자를 활용하여 문제(3+4=?)를 내고, 해당 문제의 정답이 맞을 때, 정답 그 외는 오답으로 처리하세요
코드 문제는 아래에 있습니다.

[1단계:개념] 3. Math.random 클래스와 메서드의 기능을 정수의 임의범위 처리 예제를 통해서 기술하세요
랜덤으로 주사위를 던질 때를 예를 들면 
int diceNum = ((int)(Math.random()* 6 + 1);
=> 6은 경우의 수를 뜻하고 +1은 시작하는 수를 뜻한다.
   그러므로 위 식에서는 1부터 시작하고 경우의수가 6이므로 1~6까지 랜덤으로 임의의 수가 나온다.

[1단계:코드] 4. 두 친구가 주사위 2개를 던져서 값을 확인려고 한다. 각각 홍길동/김길동일 때, 각각 나온 주사위 합을 출력하세요
코드 문제는 아래에 있습니다.


[1단계:개념] 5. if 조건 구문의 기본형식 3개를 예제를 만들어 기술하세요 
1) 내가 사과를 2개이상 먹었을 경우
int apple = 3;
if( apple >= 2 ) System.out.println("너무 많이 먹었다.");
2) 숫자를 3이상 셀 수 있을 때 
int cnt01 = 0;
System.out.println("카운트 " + (++cnt01));
System.out.println("카운트 " + (++cnt01));
System.out.print("카운트 " + (++cnt01));
if(cnt01 == 3) System.out.println("참 잘했어요");
System.out.print("카운트 " + (++cnt01));
3)1,2,3일동안 공부를 해야하고 3일차에는 운동도해야한다.
int day = 0;
System.out.println((++day) + "일차 공부를 완료했다.");
System.out.println((++day) + "일차 공부를 완료했다.");
System.out.print((++day) + "일차 공부를 완료했다.");
if(day = 3) ystem.out.print("운동도 해야해");

[1단계:코드] 6. 넌센스 퀴즈를 검색해서 문제로 만들어 문제가 맞을 때, 정답 그외는 오답이 되게 처리하세요
코드 문제는 아래에 있습니다.

[1단계:코드] 7. Math.random/Scanner활용하여 컴퓨터가 임의로 구슬을 1~10개 랜덤으로 쥐게하되,
           0) 해당 갯수를 맞추는지 여부에 따라 success/failure 처리하게 하세요
           1) 1입력시 홀, 0입력시 짝으로 하여 success/failure 처리하게 하세요
           2) 홀/짝을 입력하여, success/failure 처리하세요.
코드 문제는 아래에 있습니다.


[1단계:개념] 8. if else if 구문의 기본예제를 만들어 해당 구문의 기본형식을 설명하세요.
임의의 나온 수가 0일 때는 0입니다 1일때는 1입니다. 그외일때는 다시 입력하세요를 출력한다.
int ranNum1 = (int)(Math.random() * 10); //0~9까지 임의의 수 
if(ranNum1 = 0){ //임의의수가 0일때 밑에 줄 출력
     System.out.print("0입니다.");
}else if(ranNum1 = 1){//임의의수가 1일때 밑에 줄 출력
     System.out.print("1입니다.");
}else{//임의의수가 0과1을 제외한 그외 일 때 밑에 줄 출력
     System.out.print("다시 입력하세요");
}


[1단계:코드] 9. 주사위가 임의로 나오게 하여, 컴퓨터가 낸 임의 주사위 수와 내가 낸 임의 주사위 수를
           비교하여, 승/무/패를 출력하세요.
코드 문제는 아래에 있습니다.


1단계:개념] 10. switch case문의 기본형식과 기능내용을 기본 예제를 만들어 설명하세요.
임의의 나온 수가 1일 때는 1입니다 2일때는 2입니다. 그외일때는 다시 입력하세요를 출력한다.
int ranNum2 = (int)(Math.random() * 9 + 1); // 1~9까지 임의의수
switch(ranNum2){
case 1: //임의의 수가 1일 때 밑에 줄 출력
     System.out.print("1입니다.");
     break; // 만약 break가 없으면 break가 만날때까지 아래로 수행된다.
case 2: //임의의 수가 2일 때 밑에 줄 출력
     System.out.print("2입니다.");
     break;
default: //임의의 수가 1과 2를 제외한 그 외 일 때 밑에 줄 출력
     System.out.print("다시 입력하세요.");


[1단계:코드] 11. 가고자하는 위치 2개와 집에 가는 노선버스를 검색하여, switch case처리하여 해당 최종 위치를 처리하고, 그외는 정보가 없습니다 라고 표시하세요.
코드 문제는 아래에 있습니다.

 */
      
      //2. 3항 연산자를 활용하여 문제(3+4=?)를 내고, 해당 문제의 정답이 맞을 때, 정답 그외는 오답으로 처리하세요
      System.out.println("# 사칙연산 #");
      System.out.print("3 + 4 = ? : " );
      Scanner sc01 = new Scanner(System.in);
      int ans = sc01.nextInt();
      System.out.println("입력한 답: " + ans);
      String pass = ans == 7? "정답" : "오답";
      System.out.println(pass);
      System.out.println("\n");
      
      //4. 두 친구가 주사위 2개를 던져서 값을 확인려고 한다. 각각 홍길동/김길동일 때, 각각 나온 주사위 합을 출력하세요
      System.out.println("# 주사위를 던져라 #");
      int dice01 =(int)(Math.random() * 6 + 1);
      int dice02 =(int)(Math.random() * 6 + 1);
      int hongTot = dice01 + dice02;
      System.out.println("홍길동의 주사위 수는? :" + dice01 + "," + dice02 );
      System.out.println("홍길동의 주사위 합은 :" + hongTot );      
      int dice03 =(int)(Math.random() * 6 + 1);
      int dice04 =(int)(Math.random() * 6 + 1);
      int gilTot = dice03 + dice04;
      System.out.println("김길동의 주사위 수는? :" + dice03 + "," + dice04 );
      System.out.println("김길동의 주사위 합은 :" + gilTot ); 
      System.out.println("\n");
      
      //6. 넌센스 퀴즈를 검색해서 문제로 만들어 문제가 맞을 때, 정답 그외는 오답이 되게 처리하세요
      System.out.println("# 넌센스퀴즈 #");
      System.out.println("왕이 넘어지면?");
      Scanner sc02 = new Scanner(System.in);
      String inputans = sc02.nextLine();
      System.out.println("당신의 답은 "+ inputans);
      if(inputans.equals("킹콩")) {
         System.out.println("정답입니다.");
      }else {
         System.out.println("오답입니다.");
      }
      System.out.println("\n");
     
      //7. Math.random/Scanner활용하여 컴퓨터가 임의로 구슬을 1~10개 랜덤으로 쥐게하되,
        //    0) 해당 갯수를 맞추는지 여부에 따라 success/failure 처리하게 하세요
        //    1) 1입력시 홀, 0입력시 짝으로 하여 success/failure 처리하게 하세요
        //    2) 홀/짝을 입력하여, success/failure 처리하세요.
      System.out.println("# 구슬게임 #");
      int marble = (int)(Math.random() * 10 + 1);
      System.out.print("구슬 1~10개 중 몇개가 들어있을까?");
      Scanner sc03 = new Scanner(System.in);
      int sus = sc03.nextInt();
      System.out.println("나의 답: " + sus);
      System.out.println("컴퓨터의 답: "+ marble);
      if(sus == marble) {
         System.out.println("정답입니다.");
      }else {
         System.out.println("오답입니다.");
      }
      int marbleAns = marble % 2;
      System.out.println("그럼 구슬을 짝수인가요? 홀수인가요?");
      System.out.print("짝수이면 0, 홀수면 1을 입력해주세요: ");
      Scanner sc04 = new Scanner(System.in);
      int cor = sc04.nextInt();
      if(marbleAns == 0)
      {
         if(cor == 0) {
            System.out.println("정답은 짝수입니다.");
            System.out.println("축하합니다. 정답입니다.");
         }else if(cor == 1) {
            System.out.println("정답은 짝수입니다.");
            System.out.println("아쉽지만 오답입니다.");
         }else {
            System.out.println("0과 1중에 골라주세요");
         }
      }else {
         if(cor == 0) {
            System.out.println("정답은 홀수입니다.");
            System.out.println("아쉽지만 오답입니다.");
         }else if(cor == 1) {
            System.out.println("정답은 홀수입니다.");
            System.out.println("축하합니다. 정답입니다.");
         }else {
            System.out.println("0과 1중에 골라주세요");
         }
         System.out.println("\n");
      }
     
      //9. 주사위가 임의로 나오게 하여, 컴퓨터가 낸 임의 주사위 수와 내가 낸 임의 주사위 수를 비교하여, 승/무/패를 출력하세요.
      System.out.println("#컴퓨터와 주사위 한판#");
      int diceCom = (int)(Math.random() * 6 + 1);
      int diceMe = (int)(Math.random() * 6 + 1);
      System.out.println("컴퓨터의 주사위 수: "+ diceCom);
      System.out.println("나의 주사위 수: "+ diceMe);
      if(diceCom > diceMe) {
         System.out.println("당신은 컴퓨터에게 졌습니다.ㅠㅠ");
      }else if(diceCom == diceMe) {
         System.out.println("동점입니다.");
      }else {
         System.out.println("이겼습니다.");
      }
      System.out.println("\n");
      
      //11. 가고자하는 위치 2개와 집에 가는 노선버스를 검색하여, 
      //    switch case처리하여 해당 최종 위치를 처리하고, 그 외는 정보가 없습니다 라고 표시하세요.
      System.out.println("# 길을 찾아라~! #");
      System.out.println("어디를 가고 싶나요?");
      System.out.print("집을 가고 싶으면 1번, 롯데월드를 가고 싶으면 2번을 입력하세요: ");
      Scanner sc05 = new Scanner(System.in);
      int space = sc05.nextInt();
      switch(space) {
      case 1:
         System.out.println("집을 선택했습니다.");
         System.out.println("집으로 가는 버스는 643번입니다.");
         break;
      case 2:
         System.out.println("롯데월드를 선택했습니다.");
         System.out.println("롯데월드로 가는 버스는 341번입니다.");
         break;
      default:
         System.out.println("1과 2중 선택해주세요.");
      }
      System.out.println("\n");

      
      //11. 강사님 답
      //    집으로 가는 버스 7780, 3003
      //    인천 1000, 1002
      //    평택 2000
      
      System.out.println("경로 확인 버스번호를 입력하세요: ");
      Scanner sc06 = new Scanner(System.in);
      int busNo = sc06.nextInt();
      switch(busNo) {
      case 7780 : 
      case 3003 :
    	  System.out.println("집으로 가는 버스");
    	  break;
      case 1000:
      case 1002:
    	  System.out.println("인천으로 가는 버스");
    	  break;
      case 2000:
    	  System.out.println("평택으로 가는 버스");
    	  break;
      default:
    	  System.out.println("해당 경로를 찾을 수 없습니다.");
        
      }

   }

}