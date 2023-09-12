package javaexp.a01_begin;

public class A10_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 # 자바의 데이터 유형
		    1. 기본데이터 유형(primitive data type)
		        1) stack 영역에서 바로 할당하여 사용하는 데이터 유형
		        2) 숫자형
		            - 정수
		                  byte(8bit) : -128 ~ 127비트
		                               영문문자를 나타낼 수 있는 word단위
		                  char(2byte) : 0~65535
		                  short(2byte)
		                  int(4byte ~ 32bite)** : 2147483648 ~ 2147483647    
		                  long(8bite ~ 64bite)
		            - 실수
		                  float(4byte)
		                  double(8byte)**
		            강조) 정수의 default 데이터 유형을 int형이고, 실수의 default데이터 유형은 double이다.
		                 2532 ==> 정수 int유형
		                   byte num01 = 25;
		                   byte num02 = 25;
		                   byte num03 = num01 + num02; (X)
		                   int num04 = num01 + num02; (O)
		                   연산자가 들어가는 순간 int유형이상으로 할당되어야한다.
		                   25.43 ==> 실수 double유형
		        3) 문자형 - 형태는 숫자형 
		            cf) 주의 문자형은 기본데이터 유형, 문자열(문자배열)형은 객체유형이다.
		                char 2byte 16bit 0~65535
		        4) boolean
		            true, false
		    2. 객체형 데이터 (object type)
		        1) stack영역, heap영역을 사용하여 사용하는 객체형 데이터 유형
		 */
		
//		int num01 = 99999999999999999999999; ==> 21억을 넘기때문에 오류남
		
	    long num02 = 999999999999999L;
	    // int유형의 범위를 넘어선 경우에는 L/l을 붙여서 long에 할당하여야한다.
	    
	    float num03 = 95.752f;
	    // 실수유형의 경우에는 기본유형이 double이기에 float유형으로 선언하여 할당해야 하는 경우는 마지막에 f/F를 붙인다.
	    
	    byte num04 = 127; //byte 정수 범위 초과 (128부터 오류남)
	    // char는 각 코드값을 가지고 있다.
	    System.out.println("48번 문자: ");
	    System.out.println((char)48);
	    System.out.println("문자'0'의 코드번호");
	    System.out.println((int)'0');
	    System.out.println("문자'A'의 코드번호");
	    System.out.println((int)'A');
	    /* 48 ==> '0', 49 ==> '1'로 넣기
	       48번부터 57번까지는 0~9
	     * 
	     */
	    for (int num01 = 0; num01 <= 300; num01++) {
	    	System.out.println(num01 + ":");
	    	// 번호가 (char)에 의해 코드값으로 변환되었을 때 나타나는 코드, 
            // char문자는 숫자로 저장되어있다가, char에 의해 코드를 나타낸다.
	     	System.out.println((char)num01);
	    }
	    // 실무적으로 숫자/알파벳 대소문자 랜덤 8자 발송할 때 활용된다.
	    
	    boolean isPass01 = true;
	    boolean isPass02 = false;
	    boolean isPass03 = 25>=75;
	    System.out.println(isPass01);	    
	    System.out.println(isPass02);	    
	    System.out.println(isPass03);
	    // 자바에서는 char유형과 String을 구별한다.
	    char code01 = 'A'; // '' 한 자만 입력
	    char[] code02 = {'A','b','c'};
        // 자바에서는 {}를 통해 배열을 나타낸다.
	    String str01 = "Hello"; //"" 한 자를 포함하여 입력

/*
  ex) byte유형으로 25를 할당하고, 
      int유형으로 3000을 할당, 
      long유형으로 30억을 할당,
      float유형으로 3.14를 할당하고 출력하세요.
 */
	    byte b = 25;
	    int i = 3000;
	    long l = 3000000000l;
	    float f = 3.14f;
	    System.out.println(b);
	    System.out.println(i);
	    System.out.println(l);
	    System.out.println(f);
	}

}
