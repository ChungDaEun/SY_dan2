package backWeb.z01_vo;

public class Product {
	private String name;
	private int price;
	private int cnt;
	private String info;
	public Product(String name, int price, int cnt, String info) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}

