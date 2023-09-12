package homework;

import java.util.Scanner;

public class H04_230404 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
/*
[1단계:개념] 1. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
1~10까지 카운트업
for(int cnt = 1; cnt <= 10; cnt++); {
    System.out.println(cnt); 
    => cnt가 1부터 10이하가 될 때까지 하나씩 증가하는 것이 반복된다.
}

[1단계:코드] 2. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
              1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
//코드 문제는 아래에 있습니다.

[1단계:개념] 3. for문의 지역변수와 전연변수의 개념을 예제를 통해서 설명하세요
for(int cnt = 1; cnt <= 10; cnt++); {
    System.out.println(cnt); 
} => 전역변수로 for문이 하위블럭에 모두 영향을 준다.

for(int cnt = 1; cnt <= 10; cnt++); System.out.println(cnt);
System.out.println("영향x"); 
=> 지역변수로 for문이 선언한 첫 출력문에만 영향을 주고 다른 블럭에 있는 출력문에 영향을 못 준다. 

[1단계:개념] 4. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요  
int point = 50;
for(int cnt = 1; cnt <= 100; cnt+=10){
System.out.print(point)
System.out.print("X")
System.out.print(cnt)
}
==>for문 들어가기 전에 상단에 선언되어 for문에 데이터로 호출하거나 재할당할 수 있게 처리할 수 있다.
            
[1단계:코드] 5. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
                no 과일명  가격
                 1 사과    3000            
                 2 바나나   4000           
                 3 딸기    12000
                   총계    19000     
//코드 문제는 아래에 있습니다.

[1단계:코드] 6. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
               # 출력 형식
               날짜  갯수 누적
               1일차 2개  2개
               2일차 4개  6개
               3일차 6개 12개
//코드 문제는 아래에 있습니다.

[1단계:코드] 7. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
//코드 문제는 아래에 있습니다.

[2단계:코드] 8. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
//코드 문제는 아래에 있습니다.

[1단계:개념] 9. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
        => 2단부터 9단까지 출력하기
      for(int grade = 2; grade <= 9; grade++) { //2단부터 9단까지 1씩 늘려가며 반복
         System.out.println(grade + "단!!"); 
         for(int cnt = 1; cnt <= 9; cnt++) { //곱해지는 수를 1~9까지 1씩 늘려가면 반복
            System.out.print(grade);
            System.out.print("X");
            System.out.print(cnt);
            System.out.println("=" + grade*cnt);
         }
      
[1단계:코드] 10. 아래 내용을 2중 for문을 활용하여
            1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
//코드 문제는 아래에 있습니다.

[1단계:개념] 11. while문의 기본 형식을 예제를 통해 설명하세요.
=> num01을 1~10이하까지 1씩 증가(num01++)하여 출력하기
      int num01 = 1;
      while(num01<=10) {
         System.out.print((num01++)+" ");
      }
      
[1단계:개념] 12. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
      int num02 = 100;
      int tot = 0;
      while(num02>=90) {
         System.out.print((num02--)+" ");
          tot += num02;
      }System.out.print("합산결과: " + tot);
      
      
[1단계:코드] 13. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//코드 문제는 아래에 있습니다.

[1단계:개념] 14. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
           for(int cnt = 1; cnt<= 10; cnt++) {
         if(cnt==7) {
            break; // 7일때, 반복문 중단처리
         }
         if(cnt==3) {
            continue; // 3일 때, 수행하지 않고 다음 5로 진행한다.
            // 해당 step일 때, 이 후 내용이 수행되지 않는다.
         }
 *
 */
      
      // 2. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
        //     1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
      for(int cnt = 200; cnt <= 300; cnt+=10) {
         System.out.print(cnt + " ");
      }
      System.out.println();
      
      for(int cnt = 1000; cnt >= 950; cnt-=3) {
         System.out.print(cnt + " ");
      }
      System.out.println();
      
      for(double cnt = 100; cnt >= 0; cnt--) {
         System.out.print((double)(cnt/2) + " ");
      }
      System.out.println();
      
      
      // 5. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
        //     no 과일명  가격
        //      1 사과    3000            
        //      2 바나나   4000           
        //      3 딸기    12000
        //     총계    19000         
	   String show = "no\t과일명\t가격\n";
	   int tot01 = 0;
	   Scanner sc01 = new Scanner(System.in);
	   Scanner sc02 = new Scanner(System.in);
	   for(int no = 1; no<=3; no++) {
	      System.out.println("과일명을 입력하세요: ");
	      String fruN = sc01.nextLine();
	      System.out.println("과일의 가격을 입력하세요: ");
	      int fruP = sc02.nextInt();
	      tot01 += fruP;
		  show+=no+"\t"+fruN+"\t"+fruP+"\n";
	      }
	   System.out.println(show);
	   System.out.println("총계\t" + tot01);
   /*강사님 답
    전역변수 : 총계값(totPay), 전체 계산 내용 출력 문자열(show)
    지역변수 : 번호no, 과일명(fname), 과일의 가격(price)
    scanner sc = new Scanner(System.int);
    .nextInt(), .nextLine(),integer.parseInt(),
    for( int cnt = 1; cnt <= 3; cnt++) 
    */
   Scanner sc03 = new Scanner(System.in);
   int totPay=0;
   String show01 = "no\t과일명\trkrur\n";
   for(int cnt = 1; cnt <= 3;cnt++) {
	   System.out.println(cnt+"번째 과일정보 입력");
	   System.out.println("과일명: ");
	   String fname = sc03.nextLine();
	   System.out.println("과일가격");
	   int price = Integer.parseInt(sc03.nextLine());
	   show01+=cnt+"\t"+fname+"\t"+price+"\n";
   }
   show01 += "총계\t\t" + totPay;
   System.out.println(show01);
   
//      6. for(지역/전역) 
//         - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 
//           총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요.
//        # 출력 형식
//        날짜  갯수 누적
//        1일차 2개  2개
//        2일차 4개  6개
//        3일차 6개 12개
   System.out.println("\n날짜\t갯수\t누적");   
   int breadTot = 0;
   for(int breadUp = 2; breadUp <= 20; breadUp+=2) { //breadUp은 빵 갯수
      breadTot += breadUp;
      System.out.println((breadUp/2)+"일차\t"+breadUp + "개\t" + breadTot+"개");
   }
      
//   7. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
   int tot02 = 0;
   for(int cnt = 1; cnt<=100; cnt++) {
      if(cnt%4==0) {
         System.out.print("#");
         tot02 += cnt;
         System.out.println(tot02 + " ");
      }else {
         System.out.print(cnt+" ");
      }
   }
   System.out.println("\n"+"4의 배수 합산: " + tot02);
   
//8. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
   System.out.println("# 3,6,9 게임(3의 배수와 13짝 #");
   for(int game = 1; game <= 20; game++) {
      if(game%10 == 3) {
         System.out.print("짝 ");
      }else if(game == 13) {
         System.out.print("짝 ");
      }else {
         System.out.print(game+" ");
      }
   }
   
	  System.out.println("# 3,6,9 게임(3,6,9가 들어가면 짝) #");
	   for(int game = 1; game <= 20; game++) {
	      if(game%10 == 3 || game%10 == 6 || game%10 == 9 ) {
	         System.out.print("짝 ");
	      }else if(game == 13) {
	         System.out.print("짝 ");
	      }else {
	         System.out.print(game+" ");
	      }
	   }
	// 1~10까지 cnt%3
	// 11~20까지 cnt%10 => 0~9
	//          cnt%10 => 마지막 3,6,9가 있을 때 처리
	// cnt 10 ? cnt%10 ==> 0, %3 ==> 0
	//         if(cnt%10! = 0 && cnt%10%3 ==0)
	
	   System.out.println("# 3,6,9 게임 (1) #");
	   for(int game = 1; game <= 10; game++) {
	      if(game%3 == 0 ) {
	         System.out.print("짝 ");
	      }else if(game == 13) {
	         System.out.print("짝 ");
	      }else {
	         System.out.print(game+" ");
	      }
	   }
	   System.out.println();
	   System.out.println();
	   
	   System.out.println("# 3,6,9 게임 (2) #");
	   for(int game = 11; game <= 20; game++) {
	      if(game%10 == 3 || game%10 == 6 || game%10 == 9 ) {
	         System.out.print("짝 ");
	      }else {
	         System.out.print(game+" ");
	      }
	   }
	   
	   
   
//   10. 아래 내용을 2중 for문을 활용하여
//       1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
   // 1) 2X2(행X열)로 ♥를 표시
   for(int heart01 = 1; heart01 <= 2; heart01++) {
      for(int heart02 = 1; heart02 <= 1; heart02++) {
         System.out.print("♥");
      }
      System.out.println("♥");
   }
   
   // 2) 3X2(행X열)로 ★표시
   for(int star01 = 1; star01 <= 2; star01++) {
      for(int star02 = 1; star02 <= 2; star02++) {
         System.out.print("★");
      }
      System.out.println("★");
   }
   //3) 입력한 행/열로 입력한 기호표시
   for(int h = 1; h<= 3; h++) {
      for(int y = 1; y <= 3; y++) {
         System.out.print(h+"행"+"/"+y+"열\t");
      }
      System.out.println();
   }
   // 입력받아 행열 기호표시
   Scanner sc06 = new Scanner(System.in);
   int iRow = sc06.nextInt();
   int iCol = sc06.nextInt();
   String symbol = sc06.nextLine();
   for(int row=1;row<=iRow;row++) {
	   for(int col = 1; col <=iCol; col++) {
		   System.out.println(symbol);
	   }
	   System.out.println();
   }
   
//   13. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
   Scanner sc04 = new Scanner(System.in);
   int tot = 0;
   while(true) {
      System.out.println("학생의 점수를 입력하세요(종료시-1): ");
      int sco = sc04.nextInt();
      if(sco == -1) {
         break;
      }else {
         tot += sco;
         System.out.println("점수 : " + sco);
      }
   }
   System.out.println("종료");
   System.out.println("총점: "+tot+"점");   
   
   }
}



