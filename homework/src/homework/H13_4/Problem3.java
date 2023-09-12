package homework.H13_4;

public class Problem3 {

	public static void main(String[] args) {

	}
}
class Team{
	String nameT;
	String win;
	String tie;
	String lose;
	String odds;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Team(String nameT) {
		this();
		this.nameT = nameT;
	}
	public Team(String nameT, String win) {
		this(nameT);
		this.win = win;
	}
	public Team(String nameT, String win, String tie) {
		this(nameT, win);
		this.tie = tie;
	}
	public Team(String nameT, String win, String tie, String lose) {
		this(nameT, win, tie);
		this.lose = lose;
	}
	public Team(String nameT, String win, String tie, String lose, String odds) {
		this(nameT, win, tie, lose);
		this.odds = odds;
	}	
}