package javaexp.a10_exception;

import java.io.IOException;
import java.io.InputStream;

public class A06_compileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴파일 예외 처리 : 반드시 처리해야 컴파일 됨(기계어로 된 파일생성)
		try {
			System.out.println("컴파일시 예외 발생");
			Class.forName("aa.bb");
		}catch(ClassNotFoundException e) {
			System.out.println("예외 내용 : " + e.getMessage());
			System.out.println("예외가 처리되는 경로 trace");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		// ex) 아래 코드를 이용해서 컴파일 예외를 처리하세요.
//		InputStream is = System.in;
//		is.read();
		
		InputStream is = System.in;
		try {
			System.out.println("데이터 입력");
			System.out.println(is.read());
		}catch(IOException e) {
			System.out.println("예외 내용: " + e.getMessage());
			System.out.println("예외가 처리 되는 경로 trace");
			e.printStackTrace();
		} 
		System.out.println("프로그램 종료");
	}
}
