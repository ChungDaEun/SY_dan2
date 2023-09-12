package javaexp.a07_classObject;

public class A08_MethodRetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product04 p01 = new Product04();
		//생성자는 호출시마다 다른 heap영역을 만들기 때문에 참조값이 달라져서 하나의 객체에 하나의 생성자만 사용할 수 있지만
		//메서는 참조명.메서드명(데이터...)로 같은 heap영역 위치에서 동일한 메서드를 2~3번 이상 호출 하더라도
		//메모리 변경이 없다.
		int tot01 = p01.totPay("사과", 2000, 5);
	    System.out.println("총 비용: "+ tot01);
	    System.out.println("총 비용2: "+ p01.totPay("오렌지", 2500, 6));
	    int tot03 = p01.totPay("수박", 12000, 3);
	    System.out.println("총 비용3: "+ tot03);
	    
	    Product05 p02 = new Product05();
	    System.out.println("#할인률계산#");
	    int tot04 = p02.downP(3000,0.15);
	    System.out.println("할인된 금액" + tot04);
	    
	    student01 score = new student01();
	    System.out.println("#성적평가#");
	    double score01 = score.records("정다은",80,20,70);
	    System.out.println("평균점수: "+score01+"점");
	    
	 // student01 st = new student01;
	 // System.out.println("평균" + st.records("정다은",90,80,70))
	 // double avg = st.records("정민규",50,20,60);
	 // System.out.println("평균2: " + avg);
	}

}
// 물건 객체를 생성해서 구매할 물건과 가격 갯수를 입력받아 총 비용을 리천하는 처리를 해보자
class Product04{
	int totPay(String pname, int price, int cnt) {
		System.out.println("입력한 물건명 : " + pname);
		System.out.println("가격" + price);
		System.out.println("갯수 : " + cnt);
		int tot = price*cnt;
		return tot;
	}
}
// 물건가격, 할인율을 입력받아서 할인율이 적용된 금액을 정수형(int) 리턴하여 main()에서 호출
// 100% ==> 1.0, 50% ==> 0.5
// 3000원 10% = 3000*0.1(할인금액) ==> 할인율 적용된 금액 3000-(3000*0.1)
// 메서드 출력 내용 : 물건가격:@@@, 할인율 @@
// 메서드 리턴내용 할인 율이 적용된 금액

class Product05{
	int downP(int price, double down) {
		System.out.println("물건의 가격: " + price);
		int downPer = (int)(down*100);
		System.out.println("할인율: " + downPer + "%");
		int tot = price-(int)(price*down);
		return tot;
	}
}
// Student01 records()메서드에 매개변수 이름, 국어, 영어, 수학 입력받고 해당 내용 출력, 평균(double)을 리턴처리
// student01 st = new student01;
// System.out.println("평균" + st.records("정다은",90,80,70))
// double avg = st.records("정민규",50,20,60);
// System.out.println("평균2: " + avg);
class student01{
	int records(String name, int kor, int eng, int math) {
		System.out.println("이름: " + name);
		System.out.println("국어 성적: " + kor +"점");
		System.out.println("영어 성적: " + eng +"점");
		System.out.println("수학 성적: " + math +"점");
		int sum = kor + eng + math;
		System.out.println("총 점: " + sum +"점");
		return sum/3;
	}
}