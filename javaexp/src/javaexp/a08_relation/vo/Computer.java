package javaexp.a08_relation.vo;

public class Computer {
	
	private Cpu cpu;
	private Ram ram;
	private String kind;
	
	public Computer() {}
	// Computer com = new Computer("조립")
	public Computer(String kind) {
		this.kind = kind;
	}
	// addRam() 램 장착.. 처리 메서드
	public void addRam(Ram ram) {
		this.ram = ram;
		System.out.println(ram.getMemory() + "G 메모리를 추가합니다.");
	}
	
	// com.addCpu( new Cpu("AMD", "6core 4.0Ghz) )
	public void addCpu(Cpu cpu) {
		this.cpu = cpu;
		System.out.println(cpu.getSpecC() + " 사양의 cpu장착");
	}
	public void showCom() {
		System.out.println(kind + " 컴퓨터 부품들");
		if( cpu == null) {
			System.out.println("cpu가 아직 장착 되지 않았습니다.");
		}else {
			cpu.showInf();
		}
		if(ram == null) {
			System.out.println("ram이 장착되지 않았습니다.");
		}else {
			ram.showInfo();
		}
		// ram 메모리 여부 확인해서 ram 정보 출력
	}
	
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
}
