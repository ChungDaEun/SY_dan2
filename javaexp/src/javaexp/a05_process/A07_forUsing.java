package javaexp.a05_process;

import java.util.Scanner;

public class A07_forUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# for의 활용
1. 여러가지 출력형식 처리
2. for문과 전역변수 사용
3. for문에서 조건문 사용
4. for문 안에 for문(이중 for문) 사용
*/
		for(int cnt = 1; cnt <= 10; cnt++) {
			// 줄바꿈 처리 : System.out.println();
			// 특수문자/일반문자 활용처리 \n,\t
			System.out.println(cnt + "\t");
		}
		System.out.println();
		//1+2+3+...
		for(int cnt = 1; cnt <= 10; cnt++) {
			System.out.println(cnt + "+");
		}
		System.out.println();
		// ex) 다음과 같은 형태로 출력해보세요.
		// 1. 카운트 다운 시작 10,9,8,...,0완료
		System.out.println("#카운트 다운#");	
		for(int cnt = 10; cnt >= 0; cnt--) {
			System.out.print(cnt + ",");
		}
		System.out.println();
		
		// 2. 100부터 120까지 합산 처리
		//     100+101+102+...+120+ ==> 합산처리 완료
		System.out.println("# 100 ~ 120까지의 합 #");	
		int start = 100; // 변수의 범위에 따라서 for문 처리
		int end = 120;
		System.out.println(start+"에서부터 "+end+"까지 합산 처리");
		for(int cnt=start;cnt<=end;cnt++) {
			System.out.print(cnt+" + ");
		}
		System.out.println("\n합산처리 완료");
		
		
		// 3. 학생번호와 점수 (임의의 점수 - 0~100)
		//       번호     점수
		//        1      78
		//        2      98
		//        3      88
		System.out.println("#학생들의 점수#");	
		System.out.println("번호\t점수");
		for(int num = 1; num <= 3; num++) {
			System.out.println(num + "\t" + (int)(Math.random() * 100));
		}
		System.out.println();
		
		
		// 4. 임의의 구구단 출력
		//    단수 : @@단(2~9) (임의값) for문 1~9반복
		//     @@ X 1 =@@
		//     @@ X 2 =@@
		//     @@ X 3 =@@
		//     @@ X 4 =@@
		System.out.println("#램덤 구구단#");
		int grade = (int)(Math.random()*8+2);
		System.out.println("단수 : "+grade + "단");
		for(int cnt = 1; cnt<=9; cnt++) {
			System.out.println(grade+ "X"+cnt +"="+ (grade * cnt));
			// + 연산이외는 처리가 된다.
		}
		
		// 5. 과일의 단가를 입력하고 해당 과일의 1~10까지 구매
		//    단가 : @@@
		//    갯수   총계
		//    1개    @@원
		//    .........
		//    10개   @@원
		System.out.println("#과일나라#");
		System.out.print("사과는 얼마인가요?: ");
	    Scanner sc = new Scanner(System.in);
	    int apple = sc.nextInt();
	    System.out.println("사과단가 : " + apple);
	    System.out.println("갯수\t총계");
	    for(int num = 1; num<=10; num++) {
	        int appleM = apple * num;
	    	System.out.println(num+"개\t"+ appleM+"원");
	    }
	    System.out.println();

	}

}
