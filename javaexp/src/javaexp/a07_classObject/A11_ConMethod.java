package javaexp.a07_classObject;

public class A11_ConMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("그랜저");
		c1.driving();
		c1.addFuel(1000);
		System.out.println("현재 속도: " + c1.stepPadal() + "km/h");
		System.out.println("현재 속도: " + c1.stepPadal() + "km/h");
		System.out.println("현재 속도: " + c1.stepPadal() + "km/h");
		c1.driving();
		c1.driving();
		c1.driving();
		
		Calculator02 ret = new Calculator02(0,22);
		System.out.println(ret.Plus());
		System.out.println(ret.minus());
		System.out.println(ret.multi());
		System.out.println(ret.divide());
		
		
/*
# 생성자와 메서드를 활용한 객체 구형
1. 생성자는 주로 객체를 생성할 때 초기 데이터를 설정할 때 사용되며
2. 메서드는 계속 기능적인 처리를 하여 외부에 변경되는 데이터를 입력받거나 해당 데이터를 로직에 의해 리턴할 때 주로 활용된다.
 */
	}

}

// ex) Calculator02 생성자를 통해서 변수를 2개 받아 
//     기능 메서드 plus(), minus(), multi(), divide()
//     출력 @@ + @@  리턴값을 연산결과를 리턴하게 처리하세요 외부에서 리턴받아 연산결과를 출력
class Calculator02{
	// 필드
	// 생성자(두개 데이터)
	//메서드 1..4()
		int num01;
		int num02;
		public Calculator02(int num01, int num02) {
			this.num01 = num01;
			this.num02 = num02;
		}
		int Plus() {
			System.out.println("# 덧셈 #");
			int plusR = num01 + num02;
			return plusR;
		}
		int minus() {
			System.out.println("# 뺄셈 #");
			int minusR = num01 - num02;
			return minusR;
		}
		int multi() {
			System.out.println("# 곱셈 #");
			int multiR = num01 * num02;
			return multiR;
		}
		double divide() {
			System.out.println("# 나눗셈 #");
			double divide = (double)num02==0?0:(double)num01/(double)num02; 
//			double divide = (double)num01 / (double)num02;
			//만약 0이 들어가면 오류나기때문에 삼항 연산자로 처리
			return divide;
		}
	
}

class Car{
	int speed;
	int fuel;
	String kind;
	public Car() {
		
	}
	public Car(String kind) {
		this.kind = kind;
	}
	void addFuel(int cc) {
		fuel += cc;
		System.out.println("기름을 주입한다: " + cc);
	}
	int getFuel() {
		return fuel;
	}
	int stepPadal() {
		System.out.println("엑셀을 밟다!!");
		speed+=10;
		return speed;
	}
	void driving() {
		fuel -= 10;
		System.out.println("운행하여 휘발유를 10감소해서 지금: " + fuel + "cc 남았습니다.");
		if(fuel > 0 && speed > 0) {
			System.out.println(kind + "자동차가 운행을 한다.");
			System.out.println("현재 휘발유");
		}else {
			if(fuel<=0) {
				System.out.println("휘발유가 없습니다.");
			}
			if(speed <= 0) {
				System.out.println("엑셀을 통해 속도를 올려야합니다.");
			}
		}
	}
}