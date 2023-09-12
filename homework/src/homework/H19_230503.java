package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class H19_230503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[1단계:개념] 1. set객체의 특징을 예제를 통하여 기술하세요

		Set<String> set = new HashSet<String>();
		set.add("사탕");
		set.add("메론");
		set.add("메론"); // 중복 저장 안됨 그래서 메론은 하나만 출력된다.
		set.add("세제");
		set.add("리치");
		System.out.println("저장된 set 데이터");
		for(String mart:set) {
			System.out.println(mart);
		}
/*
		set의 특징
		- 수학의 집합에 비유
		- 저장 순서가 유지되지 않음 
		   ==> 위 예제에서 코드 순서인 (사탕, 메론, 세제, 리치)순이아니라 다른 순서로 출력됨
		- 객체를 중복 저장 불가
		- 하나의 null만 저장 가능
*/
		
//		[1단계:확인] 2. 사과, 바나나, 딸기, 오렌지, 수박을 랜덤으로 10회 Set 주머니에 넣었을 때, 들어간 과일의 종류를 출력하세요.
		Set<String> fruits = new HashSet<String>();
		String [] flist = {"사과","바나나","딸기","오렌지","수박"};
		Random r1 = new Random();
		for(int i = 1; i <= 10; i++) {
			int fnum = r1.nextInt(5);
			fruits.add(flist[fnum]);
		}
		for(String sum:fruits) {
			System.out.println(sum);
	    }
		
		
//		[1단계:개념] 3. map객체의 특징을 기본 예제를 통하여 설명하세요

		Map<String, String> school = new HashMap<String, String>();
		school.put("30", "강서희");
		school.put("31", "강서희"); // 값을 중복
		// 값은 중복 가능하다.
		// "30","31"키의 값 모두 강서희이다.
		school.put("32", "김세윤");
		school.put("32", "남주혁"); // 키를 중복
		// 키는 중복될 수 없어서 마지막 값을 저장
		// "32"키의 값은 남주혁이다.

		//ctrl  + shift + f
		for(String key:school.keySet()) {
			System.out.println(key + "번\t");
			System.out.println(school.get(key) + "\n");
		}
/*		
		map 객체의 특징
		- 키와 값으로 구성된 Map.Entry객체를 저장하는 구조 
		  ==> school.put("30", "강서희");에서 "30"은 키, "강서희"는 값이다.
		- 키와 값은 모두 객체
		- 키는 중복될 수 없지만, 값을 중복 저장 가능
 */
		
//		[1단계:확인] 4. map으로 회원의 정보를 저장할려고 한다. 저장하고 저장된 정보를 호출할 때,
//		              동일한 id로 회원 정보를 입력하고 변경되는 회원 정보를 처리해보세요.
		Map<String, String> manager = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
			System.out.print(i + "번 id를 입력하세요. : ");
			String scId = sc.nextLine();
			System.out.print(i + "번 이름을 입력하세요. : ");
			String scN = sc.nextLine();
			manager.put(scId, scN);
			System.out.println();
			System.out.println("내가 입력한 내용");
			System.out.println("id: " + scId);
			System.out.println("이름: " + scN);
		}
		System.out.println("입력 끝!\n");
		System.out.println("id\t" + "이름");
		for(String list:manager.keySet()) {
			System.out.print(list + "\t");
			System.out.println(manager.get(list));
		}
		
//		[1단계:개념] 5. 입력처리하는 기본 객체와 출력 처리하는 기본 객체를 기본예제를 통해 설명하세요.
//		System.out.print("문자를 입력하세용~:  ");
//		InputStream in = System.in; // 입력처리
//		try {
//			int data01 = in.read();
//			OutputStream os01 = System.out; // 출력 처리
//			System.out.print("입력 내용1 : ");
//			os01.write(data01); // write(byte) : 코드 값을 출력
//			os01.flush(); // 임시메모리
//			os01.close(); // 자원해제
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // 필수 예외 처리 구문
		
		
		
//		[1단계:확인] 6. c:\a01_javaexp\z01_fileExp\ 하위에 a1~a9폴드가 생성되고, 각 폴드에 show01.txt~show09.txt 파일을 생성해보세요.
		String path = "C:\\a01_javaexp\\workspace\\javaexp\\z01_fileExp\\"; // 폴더 생성시
		for(int i = 1; i < 10; i++) {
			File f = new File(path + "a0" + i );	
			f.mkdir();
			for(int j = 1; j < 10; j++) {
				
				File f02 = new File(path + "a0" + i + "\\show0" + j + ".txt");
				try {
					f02.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}

		}


		
//		[1단계:확인] 7. c:\a01_javaexp\z01_fileExp\a1\show01.txt에 입력받은 물건명/가격/갯수 정보를 저장하세요.
		String path02 = "C:\\a01_javaexp\\workspace\\javaexp\\z01_fileExp\\a01\\";
		Writer fout = null;
		try {
			fout = new FileWriter(path02 + "show01.txt");
			Scanner sc02 = new Scanner(System.in);
			System.out.println("물건의 이름을 입력하세요: ");
			String name = sc02.nextLine();
			System.out.println("물건의 가격을 입력하세요: ");
			int price = sc02.nextInt();			
			System.out.println("물건의 갯수를 입력하세요: ");
			int cnt = sc02.nextInt();			

			fout.write(name);
			fout.append("\n" + price + "원");
			fout.append("\n" + cnt + "개");
			fout.flush(); // 버퍼에 있는 임시 메모리를 비워주기
			System.out.println("입력완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fout.close(); // 자원해제
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
