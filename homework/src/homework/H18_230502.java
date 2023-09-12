package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class H18_230502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
2023-05-02
[1단계:확인] 1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
[1단계:개념] 2. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
[1단계:확인] 3. Random를 활용하여 10번 홀짝 게임 결과를 출력하세요.
[1단계:확인] 4. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
[1단계:개념] 5. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
[단계별:확인] 
1단계 1~10까지 숫자 카드를 만들어 List<String>에 담아서, 임의의 숫자를 1개를 출력하세요
2단계 A~10,J,Q,K번호 문자로 만들어 List<String>를 임의의 카드를 7장을 출력하세요
3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
4단계 카드클래스(모양,번호)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서, 임의의 카드를 7장을 출력하세요 4명의 참가자에게 돌리세요.
 */
		// [1단계:확인] 1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("정답을 입력하세요. (4지 선다)");
				int ans = sc.nextInt();
				if(ans != 3) {
					throw new question(ans + "번");
				}
				System.out.println("정답은 3번");
				break;
			}catch(question e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("시험에 통과 했습니다");	
		
		// [1단계:개념] 2. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.

		//[1단계:확인] 3. Random를 활용하여 10번 홀짝 게임 결과를 출력하세요.
		System.out.println("# 랜덤게임 #");
		Random r1 = new Random();
		for(int i = 0; i <= 10; i++) {
			int num = r1.nextInt(100) + 1; // 1부터 100까지 랜덤수
			System.out.println(i + "번째 랜덤 수 : " + num);
			if(num%2 == 1) {
				System.out.println("홀");
			}else { 
				System.out.println("짝");
			}
		}
		System.out.println("# 랜덤게임 종료 #");
		
		//[1단계:확인] 4. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		System.out.println("# 컴퓨터와 가위바위보 #");
		Random r2 = new Random();
		// 가위 = 1, 바위 = 2, 보 = 3
		for(int i = 1; i <= 3; i++) {
			int num1 = r2.nextInt(3) + 1; //내가 낸 값
			int num2 = r2.nextInt(3) + 1; // 컴퓨터가 낸 값
			if(num1 == 1 && num2 == 2) {
				System.out.println("나 : 가위");
				System.out.println("컴퓨터 : 바위");
				System.out.println("졌다.");
			} else if(num1 == 1 && num2 == 3) {
				System.out.println("나 : 가위");
				System.out.println("컴퓨터 : 보");
				System.out.println("이겼다.");
			} else if(num1 == 2 && num2 == 1) {
				System.out.println("나 : 바위");
				System.out.println("컴퓨터 : 가위");
				System.out.println("이겼다.");
			} else if(num1 == 2 && num2 == 3) {
				System.out.println("나 : 바위");
				System.out.println("컴퓨터 : 보");
				System.out.println("이겼다.");
			} else if(num1 == 3 && num2 == 1) {
				System.out.println("나 : 보");
				System.out.println("컴퓨터 : 가위");
				System.out.println("졌다.");
			} else if(num1 == 3 && num2 == 2) {
				System.out.println("나 : 보");
				System.out.println("컴퓨터 : 바위");
				System.out.println("이겼다.");
			} else if(num1 == num2) {
				System.out.println("비겼다.");
			}	
		}
		
		//[1단계:개념] 5. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.

		// 1단계 1~10까지 숫자 카드를 만들어 List<String>에 담아서, 임의의 숫자를 1개를 출력하세요
		System.out.println("# 1단계 숫자카드 문제 #");
		List<String> nlist = new ArrayList<String>();
		Random r3 = new Random();
		for(int i = 1; i <= 10; i++) {
			nlist.add("숫자 카드 " + i);			
		}
		int listN = r3.nextInt(10);
		System.out.println(nlist.get(listN));
		
		
		// 2단계 A~10,J,Q,K번호 문자로 만들어 List<String>를 임의의 카드를 7장을 출력하세요
		System.out.println("# 2단계 카드 문제 #");
		List<String> mlist = new ArrayList<String>();
		Random r4 = new Random();
		for(int i = 2; i <= 13; i++) {
			if(i == 2) {
				mlist.add("A카드");
			}else if(i >=3 && i <= 10) {
				mlist.add(i + "카드");
			}else if(i == 11) {
				mlist.add("J카드");
			}else if(i == 12) {
				mlist.add("Q카드");
			}else if(i == 13) {
				mlist.add("K카드");
			}
		}
		for(int j = 0; j < 7 ; j++) {
			int listM = r4.nextInt(13);
			System.out.print(mlist.get(listM) + " ");		
		}		
		

		// 3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
		System.out.println("\n# 3단계 카드 문제 #");
		ArrayList<card> clist = new ArrayList<card>();
		String [] shapes = {"♣모양","♥모양","♠모양","◆모양"};
		List<String> card = new ArrayList<String>();
		for(int i = 2; i <= 13; i++) {
			if(i == 2) {
				card.add("A카드");
			}else if(i >=3 && i <= 10) {
				card.add(i + "카드");
			}else if(i == 11) {
				card.add("J카드");
			}else if(i == 12) {
				card.add("Q카드");
			}else if(i == 13) {
				card.add("K카드");
			}
		}
		for(String shape:shapes) {
			for(String num:card) {
//				System.out.print(shape + num + "");
				clist.add(new card(shape,num));
			}
		}
		for(card c: clist) {
			System.out.println(c.getShape() + c.getNumber());
		}
		System.out.println("카드의 총 갯수" + clist.size());
		
		// 4단계 카드클래스(모양,번호)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서, 임의의 카드를 7장을 출력하세요 4명의 참가자에게 돌리세요.
		System.out.println("# 4단계 카드 문제 #");
		int Mcard = r4.nextInt(7);
	
		
	}

}

// [1단계:확인] 1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
class question extends Exception{
	public question (String Message) {
		super("당신이 입력한 답은 " + Message + " 입니다.");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "[오답] : " + super.getMessage() + "\n다시 입력하세요";
	}
}
// 3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
class card {
	private String shape;
	private String num;
	public card(String shape, String num) {
		this.shape = shape;
		this.num = num;
	}
	
	public card() {
		// TODO Auto-generated constructor stub
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getNumber() {
		return num;
	}
	public void setNumber(String num) {
		this.num = num;
	}
	
}