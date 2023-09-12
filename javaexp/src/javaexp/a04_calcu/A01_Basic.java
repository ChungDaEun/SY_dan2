package javaexp.a04_calcu;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 연산자란?
		 1. 데이터를 처리하여 결과를 산출하는 것을 말한다.
		 2. 연산자(operations)
		     1) 연산자에 사용되는 표시나 기호
		         +,-,*,/,%,=,!=,...
		     2) 피연산자(operand) 
		         => 연산 데상이 되는 데이터
		     3) 연산식(expressions) = 연산자 + 피연산자
		         => 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것
		            ex) 25 + 2, num01 + num02
		            30 * 2 = 5
		            30, 2 : 피연산자
		            *, = : 연산자
		            피연산자 + 연산자 = 연산식
		 # 연산자의 종류
		 1. 산술연산자 : 사칙연산자 + 나머지 연산자
		     +,-,*,/,% 
		*/
		int num01 = 25;
		int num02 = 7;
		System.out.println(num01 + " + " + num02 + " = " + (num01 + num02));
		System.out.println(num01 + " - " + num02 + " = " + (num01 - num02));
		System.out.println(num01 + " × " + num02 + " = " + (num01 * num02));
		System.out.println(num01 + " ÷ " + num02 + " = " + (num01 / num02));
		System.out.println(num01 + " % " + num02 + " = " + (num01 % num02));
		System.out.println();

		/* ex1) 곰돌이 3마리가 빵 25개를 먹다. 공평하게 나눈갯수와 나머지 빵의 갯수를 출력하되,
		      변수를 효과적으로 사용하고 연산자를 처리하여 출력해라.
		   ex2) 사과의 단가가 2000원 하는 것을 5개 구매하였다. 총 비용을 출력해라
		   ex3) 현재 지갑속에 20000원이 있는데 교통비로 2000원 2번, 식대로 7000원을 지출하였다. 잔액을 출력하세요.*/
		
		// ex1
		int bbang = 25;
		int gon = 3;
		System.out.println("곰돌이 3마리가 25개의 빵을 공평하게 나눠먹었다");
		System.out.println("이 때 곰돌이 1마리가 먹은 빵의 갯수는?\t" + (bbang / gon) + "개");
		System.out.println("곰돌이 3마리가 25개의 빵을 공평하게 나눠 먹고 남은 빵의 갯수는?\t" + (bbang % gon) + "개");
		System.out.println();
		
		// ex2)
		int applePrice = 2000;
		int apple5 = applePrice * 5;
		System.out.println("2000원짜리 사과를 5개를 구매하면 얼마를 내야할까?\t" + apple5 + "원");
		System.out.println();
		
		// ex3)
		int wallet = 20000;//지갑속 돈
		int bmwPri = 2000; //교통비
		int bmwCnt = 2; // 교통비 사용 횟수
		int mealPri = 7000; //식대
		int sum = (bmwPri * bmwCnt) + mealPri;
		int tot = wallet - sum;
		System.out.println("총 지출 비용은?\t" + sum + "원");
		System.out.println("지값 속 잔액은?\t" + tot + "원");
		System.out.println();
		
		/*
		 2. 부호연산자 : +, -
		      ex) int num01 = 25;
	              int num02 = -num01; => -25
	              int num03 = -num02; => 25 */
		int num03 = 25;
		int num04 = -num03;
		System.out.println("부호연산자 - 추가시: " + num04);
		int num05 = -num04;
		System.out.println("한 번 더 부호연산자 -  추가: " + num05);
		System.out.println();

		
		// ex) 총 금액과 지출 금액을 지정/선언하고, 위에 부호연산자를 이용해서 남은 잔액을 출력하세요.
		 int all = 30000;
		 int meal = 8000;
		 int bmw = 5000;
		 int keyring = 15000;
		 int sumPri = meal + bmw + keyring;
		 int minus = -sumPri;
		 int totPri = all + minus;
		 System.out.println("총 사용 금액은?\t" + sumPri + "원" );
		 System.out.println("남은 잔액은?\t" + totPri + "원" );
		 System.out.println();

		/*
         3. 대입연산자 : =
		      왼쪽데이터에서 오른쪽 변수에 할당할 때 사용
		      int num04 = 50; (num04에 50을 할당한 것) */
		 int cnt1, cnt2, cnt3, cnt4, cnt5;
		 cnt1= cnt2= cnt3= cnt4= cnt5 = 1;
		 System.out.println(cnt1);
		 System.out.println(cnt2);
		 System.out.println(cnt3);
		 System.out.println(cnt4);
		 System.out.println(cnt5);
		 System.out.println();

		 /*
	     4. 증감연산자 : ++, --
	          1씩 증가하고 감소하는 연산
		      int cnt = 0;
		      cnt++; // 1씩 증가
		      cnt++;
		      System.out.println(cnt); => 출력값: 2
		      cnt--;xnt--;cnt--; // 1씩감소
		      System.out.println(cnt); => 출력값: -1 */
		 System.out.println("증감연산자 처리 예제");
		 System.out.println(cnt1++); // 출력하고 더하기
		 System.out.println(cnt1++); // 출력하고 더해서 마지막에 cnt는 3
		 System.out.println(++cnt1); // 더하고 출력
		 System.out.println(++cnt1); // 더하고 출력해서 5
		 System.out.println(cnt1--); // 출력하고 빼서 결과적으로 출력값은 5
		 System.out.println(--cnt1); // 빼고 출력해서 결과적으로 출력값은 3
		 
		 

		 /*
		 5. 증감대입연산자 +=, -+, (*=, /+, %=...)
		    특정한 수만큼 증가하고 감소하는 연산자 처리
		      int cnt = 0;
		      cnt + 2; => 2
		      cnt + 2; => 4 
		      cnt +=2; => 6
		      cnt +=5; =>11
		      cnt = cnt-3; => 8
		      cnt -= 3 =>5 */
		 System.out.println("# 증감대입연산자 #");
		 cnt2 = cnt2 + 2; System.out.println(cnt2);
	     cnt2 += 2; System.out.println(cnt2);
	     cnt2 += 5; System.out.println(cnt2);
		 cnt2 += 5; System.out.println(cnt2 + "\n");
		 
		 /*
		 6. 비교연산자 : 비교식을 이용해서 true/false값을 리턴하는 연산자
		      ==(동일할 때), !=(동일하지 않을 때)
		      >(초과),<(미만),>=(이상),<=(이하)
		      int point = 30;
		      boolean isPass1 = point == 60; false
		      boolean isPass2 = point != 60; true
		      boolean isPass3 = point >= 60; false
		          point가 60이상일 때, true, 현재는 결과가 false
		      ps) 자바에서만 사용하는 문자열 비교
		      String str1 = new String("himan")
		      String str2 = new String("himan")// 이렇게 처리 하는 것이 원칙이지만 아래를 더 많이 쓰긴 함;;
		      String str3 = "higirl"
		      String str4 = "higirl"
		      System.out.println(str1==str2); //true가 나올 것 같지만 false가 나온다.
		      System.out.println(str3==str4); // 이것은 true
		      // 위 아래가 답이 다른 이유는 데이터 할당방식이 다르기때문 
		         str1, str2는 각각 다른 주소의 himan을 heap영역에 할당하고 (총 2개의 himan생김)
		         str3, str4는 같은 주소의 higirl을 heap영역에 할당한다. (총 1개의 higirl)
		     # 결론, 자바에서는 문자열을 비교할 때 .eauals()를 이용해서 비교해야 한다. */
		 System.out.println("# 비교연산자 #");
		 int point = 70;
		 System.out.println("합격 여부 (60점이상): " + (point >= 60));
		 boolean isPass = point >= 60;
		 System.out.println("합격여부(변수할당): " + isPass);
		 int chNum = 3;
		 boolean isCorrect = chNum == 2; // 정답이 2일 때 true 출력
		 System.out.println("정답여부: " + isCorrect);
		 String idInput = "정다은";
		 // 문자열 데이터의 입력 여부에 따른 boolean 처리
		 System.out.println("입력여부: " + (idInput!=null));
		 


		 
		 /*
		 7. 논리연산자
		      - 비교연산식이 2개이상, 또는 not(!) 연산자를 이용할 때 논리연산자를 이용해서 처리한다.
		         && : (and) 논리합 두가지 비교연산자가 모두 true일 때, true 그 외는 false
		               ex)  나이에 따른 청소년요금제 적용 여부
		               boolean isAdolPay = age>=14 && age<18
		         || : (or) 논리곱 두가지 비교연산자 중 하나 이상 true이면 true, 둘 다 false일 때 false
		               ex) 놀이공원 나이에 따라 무료 입장 적용 여부
		               boolean is Free = age < 5 || age>65
		          ! : 비교 연산식이나 논리연산식의 결과가 true이면 false, false이면 true로 처리
		               boolean isPass = point >= 60; // 합격하는 경우
		               boolean isNotPass = !isPass; // 불합격하는 경우
		               boolean isPay = !isFree; // 유료인 경우
		  8. 삼항연산자
		      조건(비교연산자, 논리연산자)? A : B
		      조건식이 True일 때는 A로 처리하고, 조건식이 False일 때는 B로 처리하는 경우를 말한다.
		      한라인에서 조건에 따라 결과를 처리하기에 효과적으로 데이터 처리를 할 수 있다.
		      System.out.println(age>=18? "성인" : "미성년자")
		       => age가 18이상이면 성인이고 17이하이면 미성년자
		      
		 */
		
		

	}

}
