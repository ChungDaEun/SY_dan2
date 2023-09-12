package homework;

import java.util.ArrayList;

public class H15_230424 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //2번문제
      Food f1 = new Tteokbokki();
      Food f2 = new Ricenoodle();
      Food f3 = new Hotpot();
      f1.eat();
      f1.taste();
      f2.eat();
      f2.taste();
      f3.eat();
      f3.taste();
      //3번문제 나의 답
      ArrayList<Food> flist = new ArrayList<Food>();
      flist.add(new Tteokbokki());
      flist.add(new Ricenoodle());
      flist.add(new Hotpot());
      System.out.println("#내가 오늘 먹은 음식들 #");
      for(Food f:flist) {
//         f.DailyFoodSchedule();
      }

      //3번문제 강사님 답
      DailyFoodSchedule d = new DailyFoodSchedule("다은");
      d.menu(new Tteokbokki());
      d.menu(new Ricenoodle());
      d.menu(new Hotpot());
      d.showMenu();
      
      //4번문제
      Leg l1 = new right();
      l1.walk();
      Leg l2 = new left();
      l2.walk();
      WorkOut w1 = new WorkOut("런닝맨");
      w1.walk();

      //5번문제
      FishingWay fw1 = new Fishing01();
      FishingWay fw2 = new Fishing02();
      Fisher fisher1 = new Fisher("이나라");
      fw1.goFishing();
      fisher1.addFishingSkill(new Fishing01());
      fw2.goFishing();
      fisher1.addFishingSkill(new Fishing02());
      
      

   }
}
//2번,3번 문제
abstract class Food{
   private String name;

   public Food(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }
   public void eat() {
      System.out.println(name + "(을/를) 먹다.");
   }
   public abstract void taste();
}
class Tteokbokki extends Food{

   public Tteokbokki() {
      super("떡볶이");
   }
   @Override
   public void eat() {
      super.eat();
      System.out.println("일주일만에 " + getName() +"를 먹는다.");
   }
   @Override
   public void taste() {
      System.out.println(getName() + "가 너무 매워~~");
   }
   
   
}
class Ricenoodle extends Food{
   public Ricenoodle() {
      super("쌀국수");
   }
   @Override
   public void eat() {
      super.eat();
      System.out.println("일주일만에 " + getName() +"를 먹는다.");
   }
   @Override
   public void taste() {
      System.out.println(getName() + "의 국물이 끝내준다. ");
   }   
}
class Hotpot extends Food{
   public Hotpot() {
      super("훠궈");
   }
   @Override
   public void eat() {
      super.eat();
      System.out.println("일주일만에 " + getName() +"를 먹는다.");
   }
   @Override
   public void taste() {
      System.out.println(getName() + "가 너무 얼얼해~~");
   }
}
class DailyFoodSchedule{
	private String name;
	private ArrayList<Food> fname;
	public DailyFoodSchedule(String name) {
		this.name = name;
		fname = new ArrayList<Food>();
	}
	public void menu(Food food) {
		fname.add(food);
		System.out.println(name + "은 " + food.getName() + "을 먹는다.");
	}
	public void showMenu() {
		System.out.println(name + "의 오늘의 식사");
		if(fname.size() > 0) {
			for(Food f:fname) {
				f.eat();
				f.taste();
			}

		}else {
			System.out.println("맛있다.");
		}
	}
}

//문제 4
interface Leg{
   String NAME = "다리";//public static final 생략
   void walk(); // public abstract 생략
}
class left implements Leg{ //인터페이스를 상속받을 때는 implements사용
   @Override
   public void walk() { //재정의 필수
      System.out.println("왼쪽" + NAME +"가 있다.");
   }
}
class right implements Leg{
   @Override
   public void walk() {
      System.out.println("오른쪽" + NAME + "가 있다.");
   }
}
class WorkOut{
   private String name;
   private Leg leg; //인터페이스를 인식할 수 있는 메모리 선언
   public WorkOut(String name) {
      this.name = name;
   }
   public void walk() {
      System.out.println( name +"은 열심히 걷는다.");
   }
   
}


 // 문제5
interface FishingWay{
   String ACT = "낚시를 열심히 합니다.";
   void goFishing();
}
class Fishing01 implements FishingWay{

   @Override
   public void goFishing() {
      System.out.println("호수에서 " + ACT);
   }
}
class Fishing02 implements FishingWay{

   @Override
   public void goFishing() {      
      System.out.println("바다에서 " + ACT);
   }
}
class Fisher{
   private String name;
   private FishingWay fishingWay;
   public Fisher(String name) {
      this.name = name;
   }
   public void addFishingSkill(FishingWay fishingWay) {
      this.fishingWay = fishingWay;
      System.out.println(name + "의 낚시 스킬이 상승했습니다.");
   }
}


/*
[1단계:개념] 1. 추상클래스와 일반 재정의 클래스의 차이점을 예제를 통해 기술하세요
# 차이점
1. 상위 객체생성의 독립성
   일반 클래스는 가능하지만 추상 클래스는 불가능하다. 
   ex) 추상클래스 참조 = new 추상클래스(); (X)
2. 메서드의 재정의 강제성
   일반 클래스의 메서드는 재정의가 선택적이지만 추상클래스의 추상메서드는 반드시 재정의 해야한다.

[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
      좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
[1단계:확인] 3. 위 내용을 DailyFoodSchedule로 1:다 관계로 먹는 사람과 일일 식사메뉴 3개를 Food타입 리스트로 처리할 수 있게 기능메서드 선언하여 출력하세요.
[1단계:개념] 4. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요.
1. 필드 : public static final 생략 ( 인터페이스.필드-독립적사용)
2. 재정의 추상메서드 : public abstract 생략(하위객체를 통해서만 사용가능)
3. default 실제 메서드 : 공통기능메서드(하위객체를 통해서만 사용가능)
4. static 실제 메서드 : 공통기능메서드(인터페이스.메서드()-독립적사용)

[1단계:확인] 5. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
      addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
인터페이스 처리 2단계
FishingWay(goFishing())
하위 상속 실제 클래스
SeaFishing 바다 낚시 기술을 가졌다.
RiverFishing 강가 낚시 기술을 가졌다.

Fisher
	FishingWay way;
	
	void addFishingSkill(FishingWay way)
		this.way = way; //하위 실제객체에 따라 철 될 내용할당
	
	void goFishing()
		if(way! = null)
			way.goFishing()
		else
			낚시 기술이 없네요.
*/
