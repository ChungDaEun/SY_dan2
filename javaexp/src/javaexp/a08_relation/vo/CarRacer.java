package javaexp.a08_relation.vo;

public class CarRacer {

	// 필드: 이름, Car
	// 메서드 : buyCar(), drivingCar(),
	//          Car객체가 있으면 @@가 차를 운행
	//                   없으면 ㅠㅠ차가 없어요.
	private String name;
	// 포함될 클래스를 선언
	private Car car; 
	
	public CarRacer() {}
	public CarRacer(String name) {
		this.name = name;
	} // 클래스명인 CarRacer와 같은 public은 생성자라고 한다.
	  // 그 외는 메서드
	public void buyCar(Car car) {
		this.car = car;
		System.out.println(name + " " + car.getKind() + "차량을 구매하다.");
	}
	public void drivingCar() {
		System.out.println(name + " 운행하려합니다.");
		if(car == null) {
			System.out.println("ㅠㅠ 차가 없습니다.");
		}else {
			car.driving();
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	

}

