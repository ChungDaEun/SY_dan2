package javaexp.a13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A02_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex) A02_Stream.java 만들고 정답 번호를 입력하세요.
		//     입력된 정답 번호 @@
		//     정답 여부 : @@
		System.out.print("정답 번호를 입력하세요: ");
		InputStream is = System.in;
		try {
			int numS = is.read();
			// is.read(byte[] bytes) : 여러개의 문자를 입력받음
			// bytes :  입력된 문자의 배열을 코드값으로 배열에 저장
			// new String(bytes) : 여러개의 문자열 데이터를 확인
			OutputStream os = System.out;
			System.out.print("입력된 정답 번호 : ");
			os.write(numS); // write 를 통해서 char 한자를 출력
			// os.write(byte[]) // 문자열을 출력
			os.flush();
			char corChar = '3';
			char inputChar = (char)numS;
			System.out.println("\n정답: " + corChar);
			System.out.println("정답 여부 : " + (corChar == inputChar));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 필수 예외 처리 구문
		

	}

}
