package javaexp.a13_io;

import java.io.File;

public class A05_DirFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex) A05_DirFile.java만들고 javaexp.a13_io.a01_fold 밑에 a01~a09 폴더 생성되게 처리 하세요.
		String path = "C:\\a01_javaexp\\workspace\\javaexp\\src\\javaexp\\a13_io\\a01_fold\\";
		for(int i = 1; i <= 9; i++) {
			// 추가 경로 설정
			File f = new File(path + "a0"+i);
			f.mkdir();
		}

	}

}
