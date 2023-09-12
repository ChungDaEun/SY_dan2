package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A02_CompanyAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
ex) 
상위 추상 클래스 Company 회사명, working() 공통, earnMoney 돈을 버는 방법() 추상
하위 실제 클래스 HyunDai, SamSung
 */
		
		ArrayList<Company> comList = new ArrayList<Company>();
		comList.add(new HyunDai());
		comList.add(new Samsung());

		for(Company c1:comList) {
			c1.working(); //공통메서드
			c1.earnMoney(); //재정의 메서드
		}
	}
}
	
abstract class Company {
	private String nameC;

	public Company(String nameC) {
		this.nameC = nameC;
	}
	
	public String getNameC() {
		return nameC;
	}

	public void working() {
		System.out.println(nameC + "에서 일을 하다.");
	}
	public abstract void earnMoney();
}
class HyunDai extends Company{
	public HyunDai() {
		super("현대중공업");
	}
	@Override
	public void earnMoney() {
		System.out.println(getNameC() + "은 선박을 건조하여 돈을 벌다.");
	}	
}

class Samsung extends Company{

	public Samsung() {
		super("삼성");
	}
	@Override
	public void earnMoney() {
		System.out.println(getNameC() + " 전자제품을 팔아서 돈을 법니다.");
	}	
}
