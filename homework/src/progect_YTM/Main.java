package progect_YTM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 사용자, 노래, 앨범, 가수 데이터 초기화
        Map<String, User_re> userReplay = new HashMap<String, User_re>();
        Map<String, String> songs = new HashMap<String, String>();
        Map<String, String> genre = new HashMap<String, String>();
        Map<Integer, String> songPopularity = new HashMap<Integer, String>();

        // 예시 데이터 추가 {데이터베이스 내용}
        // 사용자가 들었던 노래 제목과 가수 이름
        // userPreferences.put("사용자 이름", new User_pre("노래제목", "가수이름"));
        userReplay.put("이지율", new User_re("Dangerously", "찰리푸스"));
        userReplay.put("나보미", new User_re("만화영화", "지코"));
        userReplay.put("차민석", new User_re("Polaroid Love", "Enhypen"));
        userReplay.put("유하나", new User_re("Love me", "BE'O"));
        userReplay.put("모둔석", new User_re("파이팅 해야지", "부석순(feat.이영지)"));

        // songs.put("가수 이름", "노래 제목");
        songs.put("찰리푸스", "Dangerously");
        songs.put("지코", "만화영화");
        songs.put("Enhypen", "Polaroid Love");
        songs.put("BE'O", "Love me");
        songs.put("부석순(feat.이영지)", "파이팅 해야지");
        
        // genre.put("가수이름","장르");
        genre.put("지코","힙합");
        genre.put("찰리푸스","팝송");
        genre.put("Enhypen","K-pop");
        genre.put("BE'O","힙합");
        genre.put("부석순(feat.이영지)","K-pop");

        //인기 급상승 곡
        // songPopularity.put(순위, "노래제목");
        songPopularity.put(30, "Dangerously");
        songPopularity.put(20, "만화영화");
        songPopularity.put(10, "Polaroid Love");
        songPopularity.put(5, "Love me");
        songPopularity.put(1, "파이팅 해야지");


        // 사용자 입력 및 기능 선택
        while (true) {
        	// 메뉴 선택
            System.out.println("\n[음악 플레이어 메뉴]");
            System.out.println("1. 다시듣기");
            System.out.println("2. 빠른 선곡");
            System.out.println("3. 인기 급상승 곡");
            System.out.println("4. 선호하는 가수");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1: // 다시 듣기
                	System.out.println("# 다시 듣기 #");
                	System.out.println("사용자의 이름을 입력하세요: ");
                    String cho_re = scanner.nextLine();
                    //userReplay의 키값에 사용자가 입력한 값이 있을 때 
                    if(userReplay.containsKey(cho_re)) {
                    	User_re re = userReplay.get(cho_re);
                    	System.out.println(cho_re + "님이 바로 전에 들은 노래");
                    	System.out.println(re.getArtist()+ "의 " + re.getSong());
                    	System.out.println(re.getSong() + "노래 재생");
                    }else {
                    	System.out.println(cho_re + "은(는) 찾을 수 없는 사용자 입니다.");
                    }
                    break;
                    
                case 2: // 빠른 선곡
                    System.out.println("# 빠른 선곡 #");
                    // songs에 있는 키값을 User_fa에 넣어 songs 반복해서 출력하기
                    for(String User_fa : songs.keySet()) {
                    	System.out.println(User_fa +"의 " + songs.get(User_fa));
                    }
                    break;
                    
                case 3: // 인기 급상승 곡
                	System.out.println("# 인기 급상승 곡 #");
                	System.out.println("이번주 1위 인기 곡");
                	// songPopularity에 있는 키값을 User_sp에 넣어 songPopularity 반복해서 출력하기
                	for(int User_sp : songPopularity.keySet()) {
                		System.out.println(User_sp + "위 곡 : " + songPopularity.get(User_sp));
                	}
                    break;
                    
 
                case 4: // 추천 가수
                	System.out.println("# 추천 가수 #");
                	System.out.println("가장 선호하는 장르를 입력하시오");
                	String cho_A = scanner.nextLine();
                	List<String> keyList = new ArrayList<String>();
                	System.out.println("가장 선호하는 장르 : " + cho_A);
                	for(Map.Entry<String, String> entry : genre.entrySet()) {
                		// value값과 사용자에게 입력받은 cho_A와 같을 때
                		if(entry.getValue().equals(cho_A)) {
                			// 리스트에 키값 넣기
                			keyList.add(entry.getKey());
                		}
                	}
                	//반복문으로 리스트에 있는 값 출력
                	for(int i = 0; i <= keyList.size(); i++) {
                    	System.out.println(keyList.get(i) + " 아티스트를 추천합니다.");
                	}
                    break;
                    
                case 5:// 플레이어 종료
                    System.out.println("음악 플레이어를 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택하세요.");
                    break;
            }
        }
    }

}
class User_re{
	private String song;
	private String artist;
	public User_re() {
		
	}
	public User_re(String song, String artist) {
		// TODO Auto-generated constructor stub
		this.song = song;
		this.artist = artist;
	}

	public String getSong() {
		return song;
	}
	public String getArtist() {
		return artist;
	}
}
