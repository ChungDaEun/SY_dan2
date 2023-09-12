package backWeb.z01_vo;
// backWeb.z01_vo.lib
public class lib {
	private String bname;
	private String author;
	private int bnum;
	public lib(String bname, String author, int bnum) {
		this.bname = bname;
		this.author = author;
		this.bnum = bnum;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
}
