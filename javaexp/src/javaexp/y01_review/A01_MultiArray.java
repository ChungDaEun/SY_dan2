package javaexp.y01_review;

public class A01_MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 다차원배열 예제 - 기차 호차별 예상 내용 true/false
		// 1. 7개호차 좌석 70개, 예약이 기본 값으로 모두 false
        boolean[][] trains = new boolean[7][70];
        
        // 예약 처리 1호 3좌석, 5호차 50좌석, 7호차 25좌석
        // 호차와 좌석을 index로 변환해서 할당
        // -1    -1
        trains[0][2] = true;
        trains[4][49] = true;
        trains[6][25] = true;
        
        // 2. 각 호차별 좌석에 예약 내역 출력
        //    1) 외부 for문을 호차처리 : 바깥 for문의 길이 trains.length
        for(int idx = 0; idx < trains.length; idx++) {
        	// 배역을 0부터 처리됨으로 1호차부터 나타내기 위해 index번호 + 1로 처리함
        	System.out.println(idx+1 +"호차");
        	// trains[idx]: 각 호차를 지칭
        	// 각 호차안에 좌석 배열 데이터가 들어가 있기에 이것 for문으로 처리한다.
        	// trains[0].length : 1차의 길이
        	// trains[0][0] : 1호차의 첫번째 좌석 예약정보
        	// trains[0][1] : 1호차의 두번째 좌석 예약정보
        	// trains[6][69] : 7호차의 70번째 좌석 예약정보
        	for(int jdx = 0; jdx < trains[idx].length; jdx++) {
//        		System.out.print(jdx+1 + "번째 좌석");
//        		System.out.println("예약여부:" + trains[idx][jdx]);
        		System.out.print(idx + 1 +"호차 ");
        		System.out.print(jdx + 1 +"좌석 ");
        		System.out.println(trains[idx][jdx]? "예약":"미예약");
        	}
        }
        
        // ex) 2개 과목에 3명의 학생의 점수를 2차원으로 할당하여 출력하세요
        //     1번째 학생 1번째과목 점수@@@
        //     1번째 학생 2번째과목 점수@@@
        //     ...
        //     3번째 학생 2번째과목 점수@@@
        int[][] subjs = {{70,90},{90,80},{75,85}};
        String[] name = {"정다은","정민규","이언정"};
        String[] subs = {"국어","수학"};
        for(int idx = 0; idx < subjs.length; idx++) {
        	for(int jdx = 0; jdx < subjs[idx].length; jdx ++) {
//        		System.out.print(idx+1 +"번째 학생 ");
//        		System.out.print(jdx+1 +"번째 과목 ");
        		System.out.print(idx + 1 +"번 ");
        		System.out.print(name[idx] + "의 ");
        		System.out.print(subs[jdx] + "점수는 ");
        		System.out.println("점수 "+ subjs[idx][jdx] + "점");
        	}
        }
        
        


	}

}
