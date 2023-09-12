package javaexp.a09_inherit;

public class A11_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 추상클래스(Abstract Class)
1. 추상 : 실체들 간에 공통되는 특성을 추출한 것을 말한다.
		 ex) 삼성, 현대, LG ==> 회사
		     새, 곤충, 물고기 ==> 동물
2. 추상 클래스
   실체 클래스들의 공통되는 필드와 메소드 정의한 클래스
   추상적인 메서드를 선언하고 하위 클래스에서 이 메서드를 반드시(***) 재정의하게 한 것을 말한다. 
    ==> 추상 메서드가 하나라도 있으면 추상 클래스가 된다.
3. 특징
   1) 일반 클래스와 거의 유사하고 추상메서드만 있다.
   2) 추상메서드는 하위에서 반드시 재정의 해야 하는 부분(다형성 처리 필요)
   3) 추상클래스는 단독으로 객체생성을 하지 못 한다.
      추상클래스 = new 상속받은 실제 객체();로만 객체 생성    

# 추상클래스 단계
1. 1단계
   1) 추상클래스 선언 : 재저의할 추상메서드 선언
   2) 위 추상클래스를 통해 상속받을 하위 실제 클래스
   3) 추상클래스 = 상위 클래스(다형성)
      참조변수.재정의메서드()
2. 2단계
   4) 위 추상클래스와 상속실제 클래스를 1:1관계 포함 처리
      ex) 하나의 유닛밖에 없는 저그 유저
          ZergUSer
          Larba larb; (필드 선언)
          Larba를 추상클래스(attack() 추상메서드)로 해서 하위에 여러가지 상속 유닛 Dron, Zerggling, HydraLisk
          makeUnit(Larba larba)
          	this.larba = larba
      ex) 하나의 부품밖에 없는 컴퓨터
          Computer
          Part part; (필드 선언)
          Part를 추상클래스(showInfo() 추상메서드)로 해서 하위에 여러가지 상속 부품 Cpu, Ram, Ssd
          addPart(Part part)
          	 this.part = part
      ex) 마트에서 하나의 구매품 사기
          Mart
          Produdct prod; (필드 선언)
          Product 추상클래스(prodInfo() 추상메서드)로 해서 하위에 여러가지 판매 물건 Fruit, Food, Icecream..
          buyProduct(Product prod)
          	this.prod = prod
3. 3단계
   5) 위 추상클래스와 상속실제 클래스를 1:다 관계를 포함한 처리
      ex) 여러개의 유닛을 가진 저그 유저
          ZergUser
       	   	   ArrayList<Larba> units; (필드선언)
       		   makeUnit(Larba larba)
       			   units.add(larba); // 유닛추가
      ex) 여러개의 부품을 가진 컴퓨터
          Computer
               ArrayList<Part> parts; (필드 선언)
       		   addPart(Part part)
       			   parts.add(part); // 부품추가
      ex) 여러개의 물건을 구매할 수 있는 마트
          Mart
               ArrayList<Produdct> buyList; (필드 선언)
       		   buyProduct(Product prod)
       			   buyList.add(prod); // 구매 물품 추가
       		   showBuyList()
       			   name 마트에서 구매한 내역
       			   int tot = 0;
       			   for(Product prod:buyList){
       				   prod.getInfo();
       				   prod.getName()
       				   prod.getPrice()
       				   prod.getCnt()
       				   tot += prod.getPrice() * prod.getCnt();
       			   }
       			   총 구매 비용 : tot
 */
	}

}
