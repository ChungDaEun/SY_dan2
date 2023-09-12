package javaexp.a04_calcu;

public class A03_logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*	     # 논리 연산자 
         - 비교연산식이 2개이상, 또는 not(!) 연산자를 이용할 때 논리연산자를 이용해서 처리한다.
	         && : (and) 논리합 두가지 비교연산자가 모두 true일 때, true 그 외는 false
	               ex)  나이에 따른 청소년요금제 적용 여부
	               boolean isAdolPay = age>=14 && age<18
	         || : (or) 논리곱 두가지 비교연산자 중 하나 이상 true이면 true, 둘 다 false일 때 false
	               ex) 놀이공원 나이에 따라 무료 입장 적용 여부
	               boolean is Free = age < 5 || age>65
	          ! : 비교 연산식이나 논리연산식의 결과가 true이면 false, false이면 true로 처리
	               boolean isPass = point >= 60; // 합격하는 경우
	               boolean isNotPass = !isPass; // 불합격하는 경우
	               boolean isPay = !isFree; // 유료인 경우
*/
		System.out.println("# 논리연산자 #");
		int age = 15;
		boolean isAdol = age >=14&&age<18;
		// && and 두개의 비교연산자가 모두 다 true일 때 처리
		System.out.println("청소년 여부: " + isAdol);
		String inputId = "himan";
		String inputPass = "7777";
		boolean isMemValid = inputId.equals("himan") && 
				inputPass.equals("7777");
		System.out.println("로그인 성공 여부: " + isMemValid);
		age = 67;
		boolean isFree = age < 5 || age >= 65;
		System.out.println("무료 여부: " + isFree+ "\n");
		
		// ex) 국어, 영어 할당해서 모두 다 80점 이상이면 상금 50000원 여부,
		//     둘 중에 하나만 90점 이상 상금 30000 여부 처리한다고 할때
	    //     변수를 선언하고 상금 여부를 출력
		
		int kor = 90;
		int eng = 70;
		boolean big1 = kor >= 90 && eng >= 90;
		System.out.println("일등 선물 50000원 획득 가능?\t" + big1);
		boolean big2 = kor >=90 || eng >90;
		System.out.println("그러면 30000원 획득 가능?\t" + big2 + "\n");
		
		int point = 70;
		boolean isPass = point >=60;
		boolean isNotPass = !isPass;
		System.out.println("합격여부:" + isPass);
		System.out.println("불합격여부:" + isNotPass+"\n");
		
		int age01 = 17;
		boolean isAdol01 = age01 >= 14 && age01 < 18;
		boolean isNotAdol01 = !isAdol01;
		boolean isNotAdol02 = !(age01>=14 && age01 <18 );
		boolean isNotAdol03 = age01 < 14 || age01>=18 ;
		System.out.println("청소년인지 여부?" + isAdol01);
		System.out.println("청소년인지 아닌지 여부?" + isNotAdol01);
		System.out.println("청소년인지 아닌지 여부?" + isNotAdol02);
		System.out.println("청소년인지 아닌지 여부?" + isNotAdol03 + "\n");
		
		// ex) 5미만이거나 65이상이면 무료요금제이다.
		//     무료요금제가 아닌 경우 이 !(not)활용하거나
		//     논리연산식으로 사용하여 출력해라
		
		int cusAge = 30;
		boolean freeChar = cusAge < 5 || cusAge > 65;
		System.out.println("무료요금제를 받을 수 있나?\t" + freeChar);
		boolean NotfreeChar = !freeChar;
		boolean NotfreeChar2 = !(cusAge < 5 || cusAge > 65);
		boolean NotfreeChar3 = cusAge < 5 && cusAge > 65;
		System.out.println("무료요금제를 받을 수 없나?\t" + NotfreeChar);
		System.out.println("무료요금제를 받을 수 없나?\t" + NotfreeChar2);
		System.out.println("무료요금제를 받을 수 없나?\t" + NotfreeChar3);
		
	}

}
