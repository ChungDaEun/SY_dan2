package javaexp.a13_io;

import java.io.File;
import java.io.IOException;

public class A04_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
만든 하위 폴드 a01_fold 경로헤
"C:\\a01_javaexp\\workspace\\javaexp\\src\\javaexp\\a13_io\\a01_fold"
a01_txt ~ a03.txt 파일3개를 생성하세요.
 */
		String path = "C:\\a01_javaexp\\workspace\\javaexp\\src\\javaexp\\a13_io\\a01_fold\\";
		File f01 = new File(path + "a01.txt");
		File f02 = new File(path + "a02.txt");
		File f03 = new File(path + "a03.txt");
		try {
			// io가 일어나기에 필수 예외 처리
			f01.createNewFile();
			f02.createNewFile();
			f03.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
