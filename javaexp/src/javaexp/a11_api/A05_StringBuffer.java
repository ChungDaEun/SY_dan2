package javaexp.a11_api;

import java.util.Scanner;

public class A05_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# String 문자열의 메모 활용의 문제점
1. +=으로 추가할 때마다 다시 객체가 생성이 된다.
2. 반복문에서 =(대입)으로 할당하는 순간 각각 문자열이 다르면 다른 위치를 기준으로 객체가 생성된다.
3. 특히 반복문에 대입을 잘못 활용하는 경우 메모리에 문제가 생겨 더이상 프로그램이 진행되지 못하는 경우가 발생
 */
		String name1 = "김길동";
		String name2 = "김길동";
		String name3 = new String ("김길동");
		String name4 = new String ("김길동");
        //System.identityHashCode() : 실제 주소 값 비교
		// name1과 name2는 "김길동"이 할당된 동일한 주소
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode(name3));
		System.out.println(System.identityHashCode(name4));
		// hashCode() 객체의 내용이 같으면 같은 값으로 나오는 한계
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		System.out.println(name3.hashCode());
//		System.out.println(name4.hashCode());
		
		String strData = "홍";
		System.out.println("초기 주소: " + strData.hashCode());
		for(int i = 0; i <= 100; i++) {
			strData += i;
			System.out.println(strData.hashCode());
		}
		System.out.println(strData);
		System.out.println("마지막 주소: " + strData.hashCode());
/* 문자열을 사용해서 += 기호를 통해서 데이터 누적할당하면 heap영역을 계속 만들어서 사용되는 것을 볼 수 있다.
   이렇게 데이터를 처리하면 메모리 overflow가 발생한다. 
   문자열 데이터를 처리할 때 문자열이 늘어나더라도 동일한 heap주소 안에서 데이터를 처리할 수 있는 객체가 필요 ==> StringBuffer
   
# StringBuffer의 활용
1. 객체 생성
   StringBuffer sb = new StringBuffer();
2. 문자열 추가
   sb.append("추가 문자열");
3. 추가된 문자열 확인
   sb : 모든 객체의 참조변수만으로도 호출되는 default 메서드가 toString()에 선언된 내용이기에 생략가능
   sb.toString()
4. 기타 기능 메서드
   insert(int offset, ) : 특정한 위치에 문자열 삽입
   delete(int start, int end) : 특정 범위의 문자열 삭제
   deleteCharAt(int index) : 특정 위치의 문자 삭제
   replace(int start, int end, String str) : 특정 위치에 문자를 대체 변경 처리(여러 문자열)
   reverse() : 문자열을 뒤집기 처리
   setCharAt(int idx, char ch) : 특정 위치에 문자를 대체처리(문자 한자)
   */
		System.out.println("# StringBuffer 객체 주소 비교 #");
		StringBuffer sb = new StringBuffer();
		sb.append("홍");
		System.out.println(System.identityHashCode(sb));
		sb.append("길");
		System.out.println(System.identityHashCode(sb));
		sb.append("동");
		System.out.println(sb.toString());
		// 추가 이후에도 동일한 주소값을 확인 할 수있다.
		System.out.println(sb);
		
		// ex) StringBuffer를 이용해서 초기 문자열 코드를 "1"을 할당하여 객체를 생성하고 2~100까지 문자열을 누적하여 출력하괴
		//     초기 생성되었을 때 주소값과 최종 누적된 문자열을 확인하고 주소값을 확인하세요.
		StringBuffer exp = new StringBuffer("1");
		System.out.println("초기 주소: "+System.identityHashCode(exp));
		for(int i = 2; i <= 100; i++) {
			exp.append(i);
		}
		System.out.println(exp);
		System.out.println("최종 주소: "+System.identityHashCode(exp));
		System.out.println(exp.reverse());
		
//		// ex) StringBuffer를 이용해서 과일명 3개를 Scanner에 의해 단위로 구분하여 입력받아서 최종적으로 입력받은 과일 리스트를 출력하되
//		//     입력받을 때마다 주소값 확인
//		Scanner sc = new Scanner(System.in);
//		StringBuffer fruits = new StringBuffer("구매할 과일 리스트\n");
//		System.out.println("초기 주소 : " + System.identityHashCode(fruits));
//		for(int i = 1; i <= 3; i++) {
//			System.out.println("구매할 " + i + "번째 과일 입력: ");
//			fruits.append(sc.nextLine() + ", ");
//			System.out.println( i + "번째 주소 : " + System.identityHashCode(fruits));
//		}
//		System.out.println("# 최종 #");
//		System.out.println("최종 주소 : " + System.identityHashCode(fruits));
//		System.out.println(fruits);
		
		//ex) 구매정보를 단위 당 \n(줄바꿈)으로 입력받게 하여 물건명 구매갯수를 입력하여 물건정보 3개를 StringBuffer에 입력하여 출력되게 하세요.
		Scanner sc02 = new Scanner(System.in);
		StringBuffer buy = new StringBuffer("물건정보\n");
		for(int i = 1; i <= 3; i++) {
			System.out.print(i + "번째로 구매할 물건 이름 입력 : ");
			buy.append(sc02.nextLine() + ", ");
			System.out.print(i + "번째로 구매할 물건 갯수 : ");
			buy.append(sc02.nextLine() + "개 \n");
		}
		System.out.println(buy);

		
	}

}
