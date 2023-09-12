package homework.H10_1;

public class Man {
	private Woman Woman;
	private String name;
	private String job;
	private int age;

	public Man() {
		// TODO Auto-generated constructor stub
	}
	public Man(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}

	public void Mshow() {
		System.out.println("# 남자 정보 #");
		System.out.println("남자의 이름: " + name);
		System.out.println("남자의 직업: " + job);
		System.out.println("남자의 나이: " + age);
	}
	
	public void match(Woman Woman) {
		this.Woman = Woman;
		if (age == Woman.getAge()) {
			System.out.println("나이가 같습니다.");
			System.out.println("커플이 매칭되었습니다.");
		}else {
			System.out.println("나이가 다릅니다.");
			System.out.println("커플 매칭에 실패하였습니다.");
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
