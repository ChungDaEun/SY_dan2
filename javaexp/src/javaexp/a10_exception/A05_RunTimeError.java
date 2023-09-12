package javaexp.a10_exception;

import java.util.Scanner;

public class A05_RunTimeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개의 숫자를 입력받아서 숫자형이 아닐 때는 숫자형을 입력하세요 라는 예외 처리하는 프로그램
		//정상적으로 입력시 @@ + @@ = @@ 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("# 프로그램 시작 #" + "\n");
		try {
			System.out.print("숫자1을 입력하세요 : ");
			int num01 = Integer.parseInt(sc.nextLine());
			System.out.print("숫자2를 입력하세요 : ");
			int num02 = Integer.parseInt(sc.nextLine());
			int tot = num01 + num02;
			System.out.println(num01 + " + " + num02 +"  = " +tot);
		}catch(NumberFormatException e) {
			System.out.println("숫자형 문자열을 입럭하세요.");
		}
		System.out.println("\n"+"프로그램 종료");	
	}
}
