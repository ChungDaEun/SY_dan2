package javaexp.a08_relation.vo;

public class Cpu {

	private String nameC;
	private String specC;
	
	public Cpu() {
		
	}
	// Cpu cp01 = new Cpu("퀼컴", "3.5Ghz quard core")
	public Cpu(String nameC, String specC) {
		this.nameC = nameC;
		this.specC = specC;
	}
	public void showInf() {
		System.out.println("# cpu 정보 #");
		System.out.println("컴퓨터 제조사 : " + nameC);
		System.out.println("컴퓨터 사양 : " + specC);
	}
	public String getNameC() {
		return nameC;
	}
	public void setNameC(String nameC) {
		this.nameC = nameC;
	}
	public String getSpecC() {
		return specC;
	}
	public void setSpecC(String specC) {
		this.specC = specC;
	}
	
}
