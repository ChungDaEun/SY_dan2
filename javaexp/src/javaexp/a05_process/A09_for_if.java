package javaexp.a05_process;

public class A09_for_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# for문에서 if문 활용
1. 반복처리 시 여러가지 화면처리나 로직에 의해서 조건문을 활용할 수 있다.
2. 대부분의 조건 처리를 통해 원하는 결과를 알고리즘에 의해 처리되는 경우가 많다.
3. for문에서 if문 처리 유형
    1) 화면 처리 형식 변경
        - 출력 형식의 내용을 변경 처리하는 경우를 말한다.
 */
		// 1. 출력형식 변경 1~100까지 출력하되, 5단위로 줄 바꿈 처리
		//    for문
		//    if(cnt%5==0) 5로 나누었을 때, 0일 5단위 처리
		for(int cnt = 1;cnt<=100; cnt++) {
			System.out.println(cnt + "\t"); // 탭 간격을 출력 처리
			if(cnt%5==0) {
				System.out.println(); //줄 바꿈 처리
			}
		}
		
		// 2. 연산처리 결과 아래 형식
		//    1 + 2 + 3 +...+ 10 = 55
		//    기본적인 데이터는 +로 출력 마지막 데이터는 =으로 처리
		int tot = 0;
		for(int cnt = 1; cnt <=10; cnt++) {
			System.out.print(cnt);
			tot += cnt;
			if(cnt==10) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
		}
		System.out.println(tot);
		
		// ex) 1~20까지 출력하되, 3의 배수에는 숫자대신 짝! 출력
		System.out.println("# 1,2,짝 #");
		for(int cnt = 1; cnt <=20; cnt++) {
			if(cnt%3==0) { 
				System.out.print("짝\t");
			}else {
				System.out.print(cnt+"\t");
			}
		}
		
		// ex2) 1~100까지 출력하되, 홀수의 합산과 짝수의 합산을 따로 하여 출력하시오
		//      1...100
		//      홀수의 합산 : @@       cnt%2==1 || cnt%2==0
		//      짝수의 합산 : @@
		System.out.println("\n# 1~100까지의 짝수의 합과 홀수의 합 #");
		int tot01 = 0; // 홀수의 합
		int tot02 = 0; // 짝수의 합
		for(int cnt = 1; cnt <=100; cnt++) {
			System.out.print(cnt+" ");
			if(cnt%2 == 1) { // 홀수일때
				tot01 += cnt;
			}else { // 홀수가 아닐 때 = 짝수일 때
				tot02 += cnt;
			}
		}
		System.out.print("\n홀수의 합: " + tot01);
		System.out.print("짝수의 합: " + tot02);	}

}
