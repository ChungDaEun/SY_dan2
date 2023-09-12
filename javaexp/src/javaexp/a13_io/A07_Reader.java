package javaexp.a13_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class A07_Reader {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\a01_javaexp\\workspace\\javaexp\\src\\javaexp\\a13_io\\";
		Reader reader = null;
		try {
			reader = new FileReader(path + "z03_data.txt");
			while(true) {
				int code = reader.read(); // 한자씩 코드값을 가져온다.
				if(code == -1) { // 더이상 데이터가 없을 때 반복중
					break;
				}
				System.out.print((char)code);
			}
			reader.close();
			System.out.println("읽기 종료!");
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 읽을 수 없습니다!");
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println("IO 예외 처리");
			System.out.println(e.getMessage());
		}
	}

}
