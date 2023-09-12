package homework;

import java.util.Scanner;

public class H05_230405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
[1단계:개념] 1. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
1) stack
2) heap
[1단계:개념] 2. 배열의 구성요소를 예제를 통해서 기술하세요
1) 배열의 데이터 유형
   int[] array01; //기본데이터 유형
   String[] array02; //문자열 유형
   Math[] array03; //내장api객체 
   Person[] array04; // 사용자 정의 클래스 객체
2) 배열의 Index
   arr[0] => 호출
   arr[1] = 300 => arr배열의 1번 위치에 300저장
3) 배열의 크기
   int arr[2] = {1,2}
   arr.length => arr의 배열을 알아낼 수 있다. 배열의 크기 = 2

[1단계:개념] 3. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
    //1) 정수형(int) 크기 3
		int[] array05 = new int[3];
		System.out.println("정수형(int) 크기 3개 배열");
		for(int idx = 0; idx < array05.length; idx++) {
			System.out.println(array05[idx]);
		}
		
		//2) 실수형(double) 크기 2
		double[] array06 = new double[2];
		System.out.println(array06[0]);
		System.out.println(array06[1]);

		//3) 문자열형(String) 크기 5,4
		String[] array07 = new String[5];
		System.out.println("문자열 배열 5");
		for(int idx = 0; idx < array07.length; idx++) {
			System.out.println(array07[idx]);
		}
		
		//4) 정수형(long) 선언만;
		long array08[] = null;

[1단계:개념] 4. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
    System.out.println("#한국시리즈 팀순위");
		String arrN[] = {"KIA타이거즈","키움히어로즈","SGG 랜더스"};
		double arrP[] = {0.694, 0.608, 0.560};
		System.out.println("순위\t구단\t승률");
		for(int no = 1; no < arrN.length; no++) {
			System.out.print((no+1)+"위\t"+arrN[no]+"\t"+arrP[no]+"%");
		}
[1단계:코드] 5. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
[1단계:코드] 6. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요.
[1단계:코드] 7. 배열로 가위,바위,보라고 선언한 후, 두 친구가 index 0~2 사이에 임의로 호출하여, 임의의 가위/바위/보를 출력하게 하세요

[1단계:개념] 8. 웹서버와 웹클라이언트는 어떤 프로그램으로 실행되는지? network환경과 함께 기술해보세요.
웹서버 : tomcat
웹클라이언트 : 브라우저프로그램
서버와 클라이언트 개념으로 웹서버가 데몬으로 구축되어 실행되고
클라이언트는 ip/port/경로의 자원명으로 접근하여 html코드를 랜더링한다.

[1단계:개념] 9. 오늘 eclipse와 vscode를 통해서 설정한 웹환경과 초기 화면 로딩을 위해 필요한 설정 부분을 기술해보세요.

[1단계:개념] 10. html을 구성하고 있는 기본 계층구조의 태그들의 내용을 기술하세요.
1)
 ex) 
        상위태그
            중간태그
               하위태그
                  포함할 데이터...
               /하위태그
           /중간태그
        /상위태그
2) html 최상위 태그
    - head 차상위 태그 body에 대한 메타정보를 선언한다.
    - body 실제화면을 구성하는 처리한다.
[1단계:개념] 11. html에서 사용하는 3가지 언어의 예제를 통해서 기술하세요
 */
		
		//5. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
		System.out.println("#점수의 총계와 평균#");
		int[] arrS = new int[3];
		Scanner sc01 = new Scanner(System.in);
		for(int no = 0; no<=2; no++) {
			System.out.println((no+1)+"번 과목: ");
			int sco = sc01.nextInt();
			arrS[no] = sco;
		}
		int fir = arrS[0];
		int sec = arrS[1];
		int thi = arrS[2];
		int scoT = fir + sec + thi;
		System.out.println("총 계: " + scoT );
		System.out.println("평균 : " + (scoT/3) );
		
		
		//6. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요.
		System.out.println("#학생들의 국어와 영어 점수#");
		System.out.println("학생명\t국어점수\t영어점수");
		String arrN[] = {"다은", "수빈", "예진"};
		int arrK[] = {90, 20, 60};
		int arrE[] = {20, 80, 60};
		for(int no = 0; no<=2; no++) {
			System.out.println(arrN[no] +"\t" + arrK[no]+"\t"+arrE[no]);
		}
		
		//7. 배열로 가위,바위,보라고 선언한 후, 두 친구가 index 0~2 사이에 임의로 호출하여, 임의의 가위/바위/보를 출력하게 하세요
	    System.out.println("#가위바위보#");
		String game[] = {"가위","바위", "보"};
	    int mis01 = (int)(Math.random() * 3);
	    int mis02 = (int)(Math.random() * 3);
	    for(int no = 0; no <= 2; no++) {
	    	if(mis01 == no) {
	    		System.out.println("1: "+ game[no]);
	    	}
	    }
		for(int no2 = 0; no2 <= 2; no2++) {
		    if(mis02 == no2) {
		    	System.out.println("2: "+ game[no2]);
		    } 
	    }
		
	}
}
