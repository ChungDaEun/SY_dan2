package homework;

public class H17_230426 {


	// 1-3문제
	static void exp01() throws ArrayIndexOutOfBoundsException{
		System.out.println("# 1-3문제 #");
		System.out.println("아이디를 입력하세요");
        String[] args = null;
		String id = args[0];
		System.out.println("입력한 아이디: " + id);
	}
	
	//6번문제
	static void exp03() throws ClassNotFoundException {//블럭내에서 처리할 내용을 위임하여 처리한다.
		System.out.println("6번 문제");
		Class.forName("pak.clas"); //해당하는 클래스가 있으면 메모리에 로딩처리
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[1단계:조원] 1. 예외처리에 대한 이론과 실습(조원들과 아래 내용에 대한 이야기를 수업 내용을 보면서 나누세요)
      1) 예외 처리를 왜 하는지 알고 있나요?
      예외처리를 하는 이유는 프로그래밍을 하면서 에러나 오류로 인해 문제가 생길경우 프로그램에 대한 신뢰성에 치명적으로 영향을 미쳐서
      예외처리를 통해 에러와 오류에 대응하도록 한다.
      2) 예외 처리를 하는 기본 단계별 구조를 설명할 수 있고, 코드할 수 있는지?
      3) args값이 입력하지 않을 때, 처리되는 메서드를 선언하고, 예외를 위임하세요.
      4) 아이디 입력시 8자미만 이거나 16자이상시 사용자 정의 예외를 발생하게 처리하세요
[1단계:개념] 2. css 문자열 관련 속성을 예제와 함께 기술하세요
1. 문자의 형태
   - font-family // 글꼴 지정
     ex) <p style="font-family:궁서체">궁서체 모양 글꼴</p>
   - font-style // 글자 모양 지정 (기울임이나 특정한 형태)
     ex) <p style="font-style:italic">글자 비스듬하게 지정</p>
2. 문자의 크기 : 문자의 크기 사이즈 지정
   - font-size
     ex) <p style="font-size:1.5em">문자 크기는 1.5em</p>
3. 문자의 굵기
   - font-weight  bold // 굵기를 굵게 지정
   - font-weight  light // 굵기를 얇게 지정
     ex) <p style="font-weight:500">문자의 굵기를 500으로 지정</p>

[1단계:개념] 3. css box 모델의 단계별 속성을 설명하세요
1. 가장 내부를 컨텐츠라고 하고 주로 문자, 이미지, 기타 포함되는 요소를 지칭한다.
2. padding: border(테두리선)과 사이의 간격을 설정하는 요소이다.
3. border : padding 외부에 외곽선으로 직선, 점선, 이미지로 테두리를 그릴수 있는 경계선이다.
4. margin : 박스의 맨 바깥 영역으로 border와 외부 다른 요소들과의 간격을 지정할 때 사용된다.

[1단계:개념] 4. css border의 위치관련 속성, 굵기, 종류관련 개별적 속성과 전체 설정 처리를 기술하세요
1. border의 위치에 따른 굵기
     border-위치-width : left, right, top, bottom
2. border의 유형에 따른 옵션
     border-style : dotted, solid, double, dashed
     
[1단계:확인] 5. css box 모델의 모서리 둥글기 속성을 이용하여, 버튼1, 버튼2를 span으로 만들어 보세요.

[1단계:확인] 6. 예외 위임을 코드를 기본 예제와 함께 설명하세요.

[1단계:확인] 7. 1~10까지 출력할 때, 짝수인 경우에 사용자 정의 예외가 처리되게 하세요.
 */
		//1-3문제
		try {
			exp01();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력이 없습니다.");
		}
		System.out.println("프로그램 종료");
		

		// 1-4 문제
		System.out.println("# 1-4문제 #");
		try {
			System.out.println("아이디를 입력하세요");
			String id = args[0];
			System.out.println("입력한 아이디: " + id);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력이 없습니다.");
		}
		
		//6번문제
		try {
			exp03();
		}catch (ClassNotFoundException e) { // 위임된 예외를 처리한다.
			System.out.println("# 예외 발생 #");
			System.out.println("예외내용: " + e.getMessage());
		}finally {
			System.out.println("예외 상관없이 처리");
		}
		
		// 7문제
		System.out.println("# 7문제 #");
		try {
			for(int i = 1; i <= 10; i++) {
				System.out.print(i +", ");
				if(i%2 == 0) {
					throw new exp02(i + "는 짝수이므로 예외 발생");
				}
			}
		}catch(exp02 e) {
			System.out.println("예외 발생!");
		}
		
	}

}
//문제 7
class exp02 extends Exception{
	public exp02(String errMsg) {
		super("사용자 정의 예러: " + errMsg); 
	}
}