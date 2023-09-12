package homework.H10_1;

public class Woman {
	private String name;
	private String job;
	private int age;
	public Woman() {
		// TODO Auto-generated constructor stub
	}
	
	public Woman(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}
	public void Wshow() {
		System.out.println("# 여자 정보 #");
		System.out.println("여자의 이름: " + name);
		System.out.println("여자의 직업: " + job);
		System.out.println("여자의 나이: " + age);
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
