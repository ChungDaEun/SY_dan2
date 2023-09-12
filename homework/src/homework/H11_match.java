package homework;

import homework.H10_1.Man;
import homework.H10_1.Woman;

public class H11_match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woman wo = new Woman("정다은", "회사원", 25);
		Man M = new Man("표지훈", "공무원", 25);
		wo.Wshow();
		M.Mshow();
		M.match(wo);

	}

}
