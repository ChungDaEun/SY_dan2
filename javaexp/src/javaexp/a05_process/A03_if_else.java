package javaexp.a05_process;

import java.util.Scanner;

public class A03_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # if else 구문
		 1. 특정 조건이 true/false에 부닉하여 처하는 경우를 말한다.
		 2. 기본형식
		    if(조건문){
		        조건문이 true일 때, 처리할 구문
		    }else{
		        조건문이 else일 때, 처리할 구문
		    }
		    ex)
		    if(iNum == 3){
		         System.out.println("정답입니다.!!");
		    }else{
		         System.out.println("오답입니다.ㅠㅠ");
		    }
		 */
		// 1~9 임의값 설정
		int ranNum1 = (int)(Math.random() * 9 + 1);
		int ranNum2 = (int)(Math.random() * 9 + 1);
		int corNum = ranNum1 + ranNum2;
		System.out.println(ranNum1 + "+" + ranNum2 + "= ? 정답을 말해봐: ");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		if(inputNum == corNum) { // 입력한 값이 7일 경우
			System.out.println("정답입니다.");
		}else { // 그외 일 경우
			System.out.println("오답입니다.");
		}
		
		//ex) 구구단 게임 컴퓨터가 낸 구구단 문제에 정답을 입력하여 정답/오답 처리하게 하세요.
		//    grade(2~9, 경우의 수?, 시작 수?
	    //    cnt(1~9, 경우의 수?, 시작 수?)
		
		int grade = (int)(Math.random() * 8 + 2);
		int cnt = (int)(Math.random() * 9 + 1);
		int mul = grade * cnt;
		System.out.println(grade + "×" + cnt + "는 얼마일까요?: ");
		// @ X @는 얼마일까요?:
		Scanner sc02 = new Scanner(System.in);
		int intputMul = sc02.nextInt();
		if(intputMul == mul) {
			System.out.println("정답은 "+ mul + "입니다.");
			System.out.println("정답~^^");
		}else {
			System.out.println("정답은 "+ mul + "입니다.");
			System.out.println("오답ㅠㅠ");
		}
		
		
	}

}
