package javaexp.a05_process;

import java.util.Scanner;

public class A12_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# do-while문
1. 모든 반복문은 반복 조건일 때 해당 반복 block이 수행되지만, 
   반드시 한 번을 수행되어야 할 필요성이 있을 때는 do while문을 사용한다.
2. 기본 형식
   do{
       최소 1번은 수행하는 반복 구문
     }while(반복할 조건)
 */
/*		int cnt = 1;
		do {
			System.out.println("카운트1: "+ cnt++ );
		}while(cnt<=10);
		System.out.println("반복문 끝나 현재 cnt: "+ cnt);
		do {
			// cnt가 아래 조건에 맞지 않지만 최소 한 번 수행
			System.out.println("카운트2: "+ cnt++);
		}while(cnt<=10);
		
		Scanner sc = new Scanner(System.in);
		String menu = ""; //주문 메뉴
		String orders = ""; // 주문메뉴리스트
		do {
			System.out.print("어서오세요 주문을 입력하세요: ");
			menu = sc.nextLine();
			if(!menu.equals("Q")) {
				
				orders += menu + " ";
			}
		}while(!menu.equals("Q"));
		System.out.println("주문하신 메뉴: " + orders);
		*/
		// ex1) 홀/짝게임으로 컴퓨터의 홀/짝 임의로 가지고 있다면
		//      내가 입력해서 맞추면 게임 종료 맞추지 못하면 반복하는 게임
		//      String com = (int)(math.random()+2)==0? "짝":"홀";
		//      String mych = "";
		//      do{
		//          mych = sc.nextLine();
		
//		Scanner sc02 = new Scanner(System.in);
//		do {
//			/*
//			 # do안에 랜덤 데이터가 있느냐?
//			   외부에 랜덤 데이터가 있느냐?
//			   => 전역변수로 사용하느냐? 지역변수로 사용하느냐?
//			      1. 전역변수로 선언하여 사용
//			          1) 1번 랜덤으로 수가 정해지고, 반복문에 의해 정해진 그 수가 홀짝인지 맞추는 게임
//			      2. do안에 지역변수로 사용
//			          1) 계속 랜덤 수가 만들어지고, 반복문에 의해 다른 랜덤 수에 대한 홀짝을 맞추어야 하는 게임
//			 */
//		}while(true);
		
		int comMa = (int)(Math.random() * 10 + 1); // 1~9
		String com = comMa%2==0? "짝":"홀";
		Scanner sc01 = new Scanner(System.in);
		do {
			// 컴퓨터의 내용이 들어오면 다시 게임을 진행함
			System.out.println("당신의 선택: ");
			String mych = sc01.nextLine();
			if(com.equals(mych)) {
				System.out.println("컴퓨터 구슬 수: "+comMa);
				System.out.println("빙고! 게임 종료");
				break;
			}else {
				System.out.println("틀렸습니다. 다시 도전하세요.");
			}
		}while(true);// 무한loop이므로 break필요
	}

}
