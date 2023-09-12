package javaexp.a08_relation.vo;

public class Music {
	// 필드는 접근제어자를 private 선언(직접 접근이 안되고 간접접근 처리)
	private String nameM;
	private String singer;
	private int yearM;
	//생성자나 메소드 접근제에자는 public
	public Music(String nameM, String singer, int yearM) {
		this.nameM = nameM;
		this.singer = singer;
		this.yearM = yearM;
	}
	public String getNameM() {
		return nameM;
	}
	public String getSinger() {
		return singer;
	}
	public int getYearM() {
		return yearM;
	}
}
