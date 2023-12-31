package javaexp.a13_io;

import java.io.File;
import java.io.IOException;

public class A03_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 파일 입력
1. 데이터는 코드를 통해서 전기적 메모리에 할당해서 전송/출력할 수 있지만 하드웨어적으로 저장하여 처리할 수 있는데
   이렇게 하드웨어적으로 저장해주는 객체가 File이다.
2. 파일 객체의 처리하는 내용
   1) 일반 데이터를 물리적으로 장기간 저장 가능
   2) 장기간 저장한 데이터를 일반 데이터로 호출 사용
   3) 특정한 파일을 저장 처리 ex) File f = new File("a.txt");
   4) 특정한 경로를 저장 처리 ex) File d = new File("c:\\a.txt");
   5) 파일의 메서드로 확인할 수 있는 데이터
      - 파일의 크기, 파일 이름, 파일의 속성(쓰기/읽기/권한), 파일의 생성/삭제, 디렉토리 생성, 디렉토리에 포함된 파일 객체 가져오기
3. 기능 메서드
   - createNewFile() : 파일 생성
                       프로그램적이 객체를 물리적인 파일로 만들어 주는 작업
                       ==> 필수예외(컴파일 예외 처리)필요
   - mkdir() : 디렉토리 생성
   - mkdirs() : 경로상에 없는 모드 디렉토리 생성
   - delete() : 파일 또는 디렉토리 삭제
   - canRead() : 읽을 수 있는지 여부
   - canWrite() : 쓸 수 있는 지 여부
   - getParent() : 부모 디렉토리 리턴
   - getName() : 파일 이름 리턴
   - File getParentFile() : 부모 디렉토리를 File 객체로 생성 후 리턴
   - String getPath() : 전체 경로 리턴
   - isDirectory() : 디렉토리 인지
   - isFile() : 파일 인지
   - long length() : 파일의 크기 리턴
   - String[] list() : 경로에 포함된 파일 또는 서브 디렉토리 배열명 리턴
   - File[] listFiles() : 경로에 포함된 파일 및 서브 디렉토리 목록 전부를 File 배열로 리턴
 */
		// 1. 같은 폴드에 있는 파일 객체 생성
		File f01 = new File("C:\\a01_javaexp\\workspace\\javaexp\\src\\javaexp\\a13_io\\z01_data.txt");
		System.out.println("물리적 파일 존재 여부 : " + f01.exists());
		// 2. 파일 생성(물리적 파일)
		File f02 = new File("C:\\a01_javaexp\\workspace\\javaexp\\src\\javaexp\\a13_io\\z02_data.txt");
		// 3. 폴더 생성 
		String path = "C:\\a01_javaexp\\workspace\\javaexp\\src\\javaexp\\a13_io\\";
		File f03 = new File(path + "a02_fold");
		File f04 = new File(path + "a03_fold");
		File f05 = new File(path + "a04_fold");
		File f06 = new File(path + "a05_fold");
		try {
			// io가 일어나기에 필수 예외 처리
			if(!f02.exists()) // 물리적으로 해당 파일이 없으면 
				f02.createNewFile(); // 물리적 파일 생성
			//경로를 만들 때 사용하는 메서드
			f03.mkdir(); // 경로를 만들때는 필수 예외 필요 없음
			f04.mkdir();
			f05.mkdir();
			f06.mkdir();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
