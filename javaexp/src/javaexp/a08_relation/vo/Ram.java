package javaexp.a08_relation.vo;

public class Ram {
	private String Company;
	private int memory;
	public Ram() {
		
	}
	public Ram(String Company, int memory) {
		this.Company = Company;
		this.memory = memory;
	}
	public void showInfo() {
		System.out.println("# 램의 정보 #");
		System.out.println("제조사 : " +Company);
		System.out.println("메모리 : " + memory+ "G");
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
}
