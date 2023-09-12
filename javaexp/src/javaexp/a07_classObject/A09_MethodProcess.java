package javaexp.a07_classObject;

public class A09_MethodProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 메서드 기능(입력+프로세스처리)
1. 프로세스 처리
   1) 전역변수 저장 처리
   2) 원하는 데이터를 위한 알고리즘처리(조건/반복문)
   3) 화면 출력
 */
		Calculator2 c1 = new Calculator2();
		// 생성자를 데이터를 처리할 때와 메서드를 통해서 데이터를 처리할 때를 구분하여 처리한다.
		c1.showInf();
		c1.setData(1000, 2000);
		c1.showInf();
		c1.setData(3000, 5000); // 전역변수가 바꿈
		c1.showInf();
		c1.setData(1000, 2000); // 전역변수가 누적
		c1.showInf();	
		System.out.println("========================================");
		
		c1.getGreater(20,30);
		c1.getGreater(10,2);
		c1.getGreater(20,20);
		System.out.println("========================================");
		
		c1.getLessNum(20,30);
		c1.getLessNum(10,2);
		c1.getLessNum(20,20);
		System.out.println("========================================");
		
		c1.showTot(5, 20);
		System.out.println();
		c1.showTot(20, 40);
		System.out.println();
		System.out.println("========================================");
		
		c1.getmulti(27, 6);
		System.out.println();
		System.out.println("========================================");
		
		c1.callBuyMaxcnt(6000, 6);
	}
}
class Calculator2{
	int num01;
	int num02;
	//출력하는 메서드
	public void showInf() {
		System.out.println("데이터1: " + num01);
		System.out.println("데이터2: " + num02);
	}
	// 전역변수에 저장 : 메서드 호출시마다 변수가 변경
	public void setData(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}
	//ex) 클래스가 shoppingSite 
	//    login(String Id, String pass)
	//    buyProd(String pname, int cnt)
	
	
	//전역변수에 누적 저장 : 메서드 호출시마다 변수가 누적 추가
	public void addData(int num01, int num02) {
		this.num01 += num01;
		this.num02 += num02;
	}
	// 두 수를 받아서 더 큰 수를 출력처리..if
	public void getGreater(int num01, int num02) {
		System.out.println("숫자1 : " + num01);
		System.out.println("숫자2 : " + num02);
		if(num01>num02) {
			System.out.println("더 큰 숫자: " + num01);
		}else if(num02>num01) {
			System.out.println("더 큰 숫자: " + num02);
		}else {
			System.out.println("두 수는 동일하다.");
		}
	}
	// ex) 더 작은 수를 표시하는 기능 메서드 처리 getLessNum()
	public void getLessNum(int num01, int num02) {
		System.out.println("숫자1 : " + num01);
		System.out.println("숫자2 : " + num02);
		if(num01>num02) {
			System.out.println("더 작은 숫자: " + num02);
		}else if(num02>num01) {
			System.out.println("더 작은 숫자: " + num01);
		}else {
			System.out.println("두 수는 동일하다.");
		}
	}
	// 시작수와 마지막수를 입력받아 numbering 하고 총계
	public void showTot(int start, int end) {
		int tot = 0;
		for(int cnt = start; cnt <= end; cnt++) {
			System.out.print(cnt);
			tot += cnt;
			if(cnt == end) {
				System.out.print(" = " + tot);
			}else {
				System.out.print(" + ");
			}
		}
	}
	// ex) 매개변수를 받아서 두개의 값을 입력받아 해당 2개의 구구단 단수의 결과를 출력하세요.
	public void getmulti(int fir, int sec) {
		System.out.println("# " + fir + "단" + " #");
		for(int cnt = 1; cnt <= 10; cnt++) {
			System.out.print(fir + "X" + cnt + "=" + (fir*cnt) + "\t");
		}
		System.out.println();
		System.out.println("# " + sec + "단" + " #");
		for(int cnt = 1; cnt <= 10; cnt++) {
			System.out.print(sec + "X" + cnt + "=" + (sec*cnt)+ "\t");
		}
	}
	//ex) 판매물건의 단가, 확인 구매 갯수 최대치 (메소드 : callBuyMaxcnt)
	//    3000   4
	//    1개 구매시 3000
	//    2개 구매시 6000
	
	public void callBuyMaxcnt(int objP, int objC) {
		System.out.println("물건의 가격: " + objP);
		System.out.println("물건 최대 갯수: " + objC);
		for(int cnt = 1; cnt <= objC; cnt++) {
			System.out.println(cnt+"개 구매시 "+ objP*cnt);
		}
	}
	
	
	//ex) 클래스 BankingSystem
	//    searchAccount(String accId)
	//    addAccount(int pcnt) 가입시 마다 계좌수가 누적
	//    addTotMoney(int money) 누적된 내용 처리
	

}