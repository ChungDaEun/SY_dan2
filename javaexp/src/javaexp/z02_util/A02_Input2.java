package javaexp.z02_util;

public class A02_Input2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일단 한번은 실행해야한다.
		System.out.println("입력연습");
/*		String pname = args[0];
		//args[1] : "3000" => 3000 => price
		int price = Integer.parseInt(args[1]);
		int cnt = Integer.parseInt(args[2]);
		int tot = price*cnt;
		System.out.println("# 구매 정보 #");
		System.out.println("물건명: " + pname);
		System.out.println("가격: " + price);
		System.out.println("갯수: " + cnt);
		System.out.println("총계: " + tot); 
		 ==>사과 3000 2 입력함                          */
		
		//A03_Input3.java
		// 구매한 물건들의 가격을 3개 입력해서 3000원 2000원 1000원 총비용을 출력하세요.
		int price01 = Integer.parseInt(args[0]);
		int price02 = Integer.parseInt(args[1]);
		int price03 = Integer.parseInt(args[2]);
		int sumTot = price01 + price02 + price03;
		System.out.println("총계: " + sumTot);
//		 ==> 3000 2000 1000 입력함
		

	}

}
