package homework;

import java.util.Scanner;
public class H02_230331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[1단계:개념] 1. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
           1) 연산자는 연산식에 사용되는 표시나 기호이다. 
           2) 피연산자는 연산의 대상이 되는 데이터다.
           3) 연산식은 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것이다.
               ex) 32 / 8 = 4 는 연산식이고
               32, 8은 피연산자
               /, = 은 연산자이다.

[1단계:개념] 2. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
              - 산술연산자는 사칙연산자와 나머지 연산자 모두를 뜻 한다.
                ex1)+,-,*,/,%
                ex2) 28 / 7 = 4 에서 / 와 = 은 산술연산자

[1단계:코드] 3. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
         소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요

[1단계:개념] 4. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
       int cnt1 = 1;
       System.out.println(cnt1++); // 출력하고 더하기, 최종 출력 : 1
       System.out.println(cnt1++); // 출력하고 더해서 마지막에 cnt는 3, 최종 출력 :2 
       System.out.println(++cnt1); // 더하고 출력, 최종 출력 : 3
       System.out.println(++cnt1); // 더하고 출력해서 5, 최종 출력 :5 
       System.out.println(cnt1--); // 출력하고 빼서 결과적으로 출력값은 5, 최종 출력 : 5
       System.out.println(--cnt1); // 빼고 출력해서 결과적으로 출력값은 3, 최종 출력 : 3

[1단계:개념] 5. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
              - 증감대입연산자의 종류는 +=, -+, *=, /+, %= 등이 있고 
                특정한 수만큼 증가하고 감소하는 연산자 처리이다.
                 ex) int cnt = 0; // cnt = 0
                     cnt + 2; // cnt = 2
                     cnt + 2; // cnt = 4
                     cnt +=2; // cnt = 6
                     cnt +=5; // cnt = 11
                     cnt = cnt-3; // cnt = 8
                     cnt -= 3 // cnt = 5

[2단계:코드] 6.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
      김밥 1개 구매  2500 
      김밥 2개 구매  5000
      김밥 3개 구매  10000
[1단계:개념] 6. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
              String str1 = "hi";
              String str2 = "hi";
              System.out.println(str1==str2); 
              이 경우에 str1과 str2 다른 주소를 가져서 다른 값이므로 
              equal를 사용해야 str1 과 str2과 같은 값으로 설정된다.

[1단계:개념] 7. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
               java 클래스 명 데이터
               args[0] 데이터
               args[1] 데이터
               args[2] 데이터
[2단계:코드] 8. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.

[1단계:개념] 9. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
                Scanner sc = new Scanner(System.in); // Scanner를 통해 입력을 받는다.
                System.out.println("이름을 입력하세요");
                String name = sc.nextLine(); // 입력한 문자열을 name에 저장한다.
                System.out.println("입력된 이름: " + name);

[1단계:코드] 10. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
[1단계:개념] 11. 비교연산자의 종류를 예시와 함께 기술하세요.
                - 비교연산자는 비교식을 이용해서 true/false값을 리턴하는 연산자이다.
                  ==(동일할 때), !=(동일하지 않을 때), >(초과),<(미만),>=(이상),<=(이하)
                  int point = 90;
                  boolean isPass = point >= 60;
                  System.out.println("합격했나요?: " + isPass); 
                  => point값이 60점이상인 90점이므로 true가 출력된다.

[1단계:코드] 12. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
[1단계:개념] 13. 논리연산자의 종류를 예제와 함께 기술하세요.		
       1)&& : (and) 논리합 두가지 비교연산자가 모두 true일 때, true 그 외는 false
              ex) 영어 점수와 수학 점수 모두 90점 이상을 받아야 상을 수상할 수 있다.
                   boolean kor >= 90 && eng >= 90 // true => 수상가능
       2)|| : (or) 논리곱 두가지 비교연산자 중 하나 이상 true이면 true, 둘 다 false일 때 false
               ex) 나이에 따른 무료쿠폰 제공 유무
                   boolean coupon = age < 6 && age > 65; 
                   //6세 미만, 65세 초과일 경우 쿠폰 받을수있다
       3)! : 비교 연산식이나 논리연산식의 결과가 true이면 false, false이면 true로 처리
              boolean isPass = point >= 60; // 합격하는 경우 
              boolean isNotPass = !isPass; // 불합격하는 경우

*/
		
		// 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 
		// 소숫점 이하가 처리된 경우와 소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
		
		int all = 500;
		int small = all / 3;
		System.out.println("500cc 오렌지쥬스를 3장으로 나누면 한잔에" + small + "cc이다.");
		double small2 = (double)all / 3;
		System.out.println("500cc 오렌지쥬스를 3장으로 나누면 한잔에" + small2 + "cc이다.");
		
		// 구매하는 김밥의 갯수를 선언하고, 
		// 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
		int gimCnt = 1;
		int gimprice = 2500;
		System.out.println("김밥" + gimCnt + "개 구매" + (gimprice * gimCnt));
		System.out.println("김밥" + ++gimCnt + "개 구매" + (gimprice * gimCnt));
		System.out.println("김밥" + ++gimCnt + "개 구매" + (gimprice * gimCnt));
		
		// args로 물건명1 가격1 갯수1 
		// 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
		//입력한것 사과 3000 5 오이 1000 6
		
		String apple = args[0];
		String cucumber = args[3];
		int appleP = Integer.parseInt(args[1]);
		int appleC = Integer.parseInt(args[2]);
		int cucumberP = Integer.parseInt(args[4]);
		int cucumberC = Integer.parseInt(args[5]);
		int appletot = appleP * appleC;
		int cucumbertot = cucumberP * cucumberC;
		
		System.out.println(apple + appleP + "원" + appleC + "개");
		System.out.println(apple + "는 총 " + appletot + "원");
		System.out.println(cucumber + cucumberP + "원" + cucumberC + "개");
		System.out.println(cucumber + "는 총 " + cucumbertot + "원");
		System.out.println(apple + "는 총 " + appletot + "원");
		System.out.println("총 합은 " + (appletot + cucumbertot)+"원 이다.");
		
		

		
		
		// Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 
		// 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("선수명을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("타석수를 입력하세요: ");
		double batN = Integer.parseInt(sc.nextLine());
		System.out.println("안타수를 입력하세요: ");
		double hitN = Integer.parseInt(sc.nextLine());
		double per = hitN / batN;
		System.out.println(name + "의 타율은"+ per + "입니다.");
		
		//12
		
		System.out.println("당신의 나이를 입력하세요: ");
		int age = Integer.parseInt(sc.nextLine());
		boolean low = age <= 18;
		boolean high = !low;
		System.out.println("당신은 18살보다 나이가 많습니다." + high);
		System.out.println("당신은 18살보다 나이가 많습니다." + low);
		

	}

}
