package javaexp.a05_process;

import java.util.Scanner;

public class A11_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# while문 : 조건에 따라 반복을 계속할지 결정하는 경우에 활용되는 반복문
1. 기본형식
     while(반복할 조건){
         반복할 조건이 true일 때 처리할 내용
     }
     무한 반복 안에서 break
     while(true){
         처리할 내용
         if(반복문을 벗어날 조건){
             break;
         }
     }    
2. 처리 예
     1) 메뉴를 입력받아서, Q를 누를 때까지 처리
     2) 구매한 과일의 가격을 입력받아서 -1을 입력할 때까지 처리
  
 */
     	int cnt = 1;
		while(cnt<=10) {
			System.out.println((cnt++) + "번째 반복");
		}
		
		
		Scanner sc = new Scanner(System.in);
		String flist = "";
		while(true) {
			System.out.print("구매할 과일의 이름을 입력(종료 시 Q입력): ");
			String fruit = sc.nextLine();
			System.out.println("입력한 내용 : " + fruit);	
			if(fruit.equals("Q")) {
				break;
			}else {
				flist += fruit + " ";
			}
		}
		System.out.println("구매한 과일 리스트: "+flist);
		System.out.println("종료!");
		

		// ex1) 10~20까지 while문을 통해서 출력하세요
		int num01 = 10;
		while(num01<=20) {
			System.out.print((num01++)+" ");
		}
		// ex2) 구매할 물거의 가격입력, 종료시-1 
		//      총 비용 : @@
		Scanner sc01 = new Scanner(System.in);
		int tot = 0;
		while(true) {
			System.out.println("구매할 물건의 가격을 입력하세요(종료시-1): ");
			int obj = sc01.nextInt();
			System.out.println("입력한 내용 : " + obj);
			if(obj == -1) {
				break;
			}else {
				tot += obj;
			}
		}
		System.out.println("종료");
		System.out.println("물건의 총 가격은: "+tot+"원");
	}

}
