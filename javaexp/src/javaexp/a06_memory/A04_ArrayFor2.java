package javaexp.a06_memory;

public class A04_ArrayFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 향상된 for문
1. 배열이나 컬렉션객체 (동적배열형 구조)를 효과적으로 처리하는 for문을 말한다.

2. 기본형식
   for(단위 데이터 : 배열변수)
       단위 데이터
   }
   int [] arry = {1000, 2000, 3000};
   for(int price:arry){
       Systme.out.println(price)
   }
   반복문을 처리하면서, 내부에 포함된 데이터를 하나씩 price에 할당하여 출력을 하면서
   배열의 데이터가 없을 때까지 반복 처리해주는 구문
 */
		int [] intArry = {1000, 2000, 3000};
		System.out.println("향상된 for문 | for each문");
		for(int num:intArry) {
			System.out.println(num);
		}
		// ex) 물건명을 배열로 선언하고 향상된 for문을 이용해서 출력하세요.
		
		String [] Sarry = {"가","나","다"};
		System.out.println("향상된 for문 | 예제1");
		for(String kor:Sarry) {
			System.out.println(kor);
		}
	
	}

}
