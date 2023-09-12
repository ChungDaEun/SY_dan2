package javaexp.a11_api;

public class A02_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# String
1. 문자열형 객체형 데이터
   char ==> char[] ==> String
   한자문자    문자배열	   문자열 객체
2. 문자열의 비교
   1) 주소값 비교 원칙(자바 원칙)
   	  stack/heap
   	  ()    (     )
   	  모든 객체들은 heap영역에 실제 객체를 두고 그 heap영역의 위치(주소값/참조변수)를 stack에 할당하여 사용한다.
      String name1 = "홍길동";
      String name2 = "홍길동";
      String name3 = new String("홍길동");
      String name4 = new String("홍길동");
      
      == : stack영역의 데이터를 비교하여 boolean값을 가져오는 것이다.
      new 무조건 객체가 다른 위치(heap)에 생성이된다.
      
      처음에는 "홍길동"을 만들고 특정한 heap영역 위치에 할당
      그 다음 "홍길동" 처음에 만들었던 주소값을 그대로 사용해서 변수에 할당한다.
      주의) 자바는 대부분 선언을 해서 문자열을 사용하는 것이 아니라 입력받든지 파일에 있는 데이터를 로딩 하든지
           네트워크 상으로 데이터를 가져오든지 DB server에서 데이터 가져오면 명시적 new String()있지는 않지만
           내부적으로 처리되기에 주소값이 다르다고 봐야 한다.
           결론, 자바는 문자열 데이터를 비교할 때 ==을 사용하면 안된다.
           equals()를 이용하여 사용해야한다.
      
      name3 == name4 ? false
      name1 == name2 ? false
      name1 == name4 ? true
      name1.equals(name4) ? true
3. String의 기능 메서드
   1) 생성자
      new String()
      new String(byte[]) ** 
      	최종프로젝트에 활용
      	 - 아이디를 잊었을 때 임시 비밀번호 생성
      	 - 회사에서 최촛사번과 임시비밀번호 발급
      new String(char[])
      new String("문자열")
 */

		char [] arr = {'H','e','l','l','o'};
		String str = new String(arr);
		System.out.println("문자열 데이터 생성: " + str);
		byte [] arr1 = new byte[8];
//		for(int i =0; i <= 255; i++) {
//			System.out.println(i + "\t" + (char)i);
//		}
		// 대문자의 범위 65~90, 소문자의 범위 97~122, 숫자 48~57
		// 65~90 ==> (int)(Math.random() * 26 + 65)
		for(int i = 1; i < arr1.length; i++) {
			byte n = (byte)(Math.random() * 26 + 65);
			System.out.println(i + "번째 임의의 수: " + n);
			System.out.println("\t" + (char)n);
			arr1[i] = n;
		}
		
		String str2 = new String(arr1);
		System.out.println("알파벳 임의 문자: " + str2);
		//char[] 8이 들어 갈 수 있는 배열
		char [] arr2 = new char[8];
		for(int i = 1; i < arr2.length; i++) {
							//65부터 90까지
			arr2[i] = (char)(Math.random() * 26 + 65);
		}
		String str3 = new String(arr2);
		System.out.println("알파벳 임의 문자: " + str3);
		
		// 알파벳 대문자 A~Z 임의로 8자리 생성
		// 알파벳 소/대문자
		char [] arr3 = new char[8];
		for(int i = 0; i < arr3.length; i++) {
			int ranNum = (int)(Math.random() * 52 + 65);
			// ranNum은 65 ~ 116까지의 수
			if(ranNum > 90) ranNum += 6;
			arr3[i] = (char)ranNum;
		}
		String str4 = new String(arr3);
		System.out.println("대/소문자 알파벳 임의의 수: " + str4);
		
		//알파벳 소/대/숫자 == >과제
		// 대문자의 범위 65~90, 소문자의 범위 97~122, 숫자 48~57
		char [] arr4 = new char[8];
		for(int i = 0; i < arr4.length; i++) {
			int num = (int)(Math.random() * 62 + 48);
			if(num > 57) num += 8; 
			if(num > 83 && num < 109) num += 14;
			arr4[i] = (char)num;
		}
		String str5 = new String(arr4);
		System.out.println("대/소문자 알파벳과 숫자의 임의의 수: " + str5);
	}
}
