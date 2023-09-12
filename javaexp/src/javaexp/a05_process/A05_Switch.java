package javaexp.a05_process;

import java.util.Scanner;

public class A05_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 비교조건이 아닌 특정 데이터 기준으로 조건 처리하는 switch문
		 1. 어떤 경우에 구문을 처리하는 형식이 switch구문이다.
		 2. switch라는 구문자체로 볼 수 있듯이 어떤 room에서
		    switch 버튼을 1번, 2번, 3번에 따라 점등하는 위치가 
		    달라지듯이 해당 특정 데이터를 기준으로 처리되는 구문이라 할 수 있다.
		 3. 기본형식
		    switch(변수){
		       case 경우1:
		           처리할 내용..
		           break;
		       case 경우2:
		           처리할 내용..
		           주의) break가 없는 경우는 switch문을 벗어나지 않고,
		                바로 밑에 case내용을 수행 처리해준다.		       
		       case 경우3:
		           처리할 내용..
		           break;
		       default:
		           위에 나열된 경우1, 경우2, 경우3이 아닐 때 처리할 내용
            }    
		 */
		int switchBtn = (int)(Math.random() * 5);
		System.out.println(switchBtn);
		//0~4 번호
		switch(switchBtn) {
		case 1:
			System.out.println("A쪽 구역에 불이 켜짐");
			break;
		case 2:
			System.out.println("B쪽 구역에 불이 켜짐");
		    // break가 없으면 break가 만날때까지 아래로 수행된다.
			// 만약 switchBth=2일때 break가 없으므로 밑으로 내려가서
			// B,C 구역에 불이 들어옴
		case 3:
			System.out.println("C쪽 구역에 불이 켜짐");
			break;
	    default:
	    	// case에서 나열된 데이터가 아닐 때
	    	System.out.println("해당 버튼은 사용하지 않습니다.");
		}
		
		//ex1) Scanner를 통해서 번호를 입력 받아서 3은 정답처리
		//    1,2,4번은 오답처리 그 외 번호는 1~4까지만 가능합니다. 출력..
		System.out.println("1,2,3,4 버튼을 누르시오: ");
		Scanner sc01 = new Scanner(System.in);
		int input = sc01.nextInt();
		switch(input) {
		case 1: 
		case 2: 
		case 4: 
			System.out.println("오답입니다.");
			break;
		case 3: 
			System.out.println("정답입니다.");
			break;
	    default:
	    	System.out.println("1~4까지만 가능합니다.");
		}
		
		// ex2) 월을 입력받아 해당 월의 마지막 날짜를 출력하세요.
		//      31일 -1,3,5,7,9,10,12
		//      30일 - 4,6,8,11   28일 - 2월
		System.out.println("어떤 달의 마지막 날을 알고싶나요?: ");
		Scanner sc02 = new Scanner(System.in);
		int month = sc02.nextInt();
		switch(month) {
		case 2:
			System.out.println(month+"월의 마지막 날은 28일 입니다.");
			break;
		case 4: case 6: case 8: case 11:
			System.out.println(month+"월의 마지막 날은 30일 입니다.");
			break;
		case 1: case 3: case 5: case 7: case 9: case 10: case 12:
	    	System.out.println(month + "월의 마지막날은 31일 입니다.");
	    	break;
	    default:
	    	System.out.println(month + "월은 없어");
		}
	}
}
