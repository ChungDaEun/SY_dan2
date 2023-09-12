package frontWeb.yt_music;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class YT_main {
   private Connection con;
   private Statement stmt;
   private PreparedStatement pstmt;
   private ResultSet rs;
   static Scanner sc = new Scanner(System.in);
   
	public Userinfo replay(String user_name) { 
		// 다시듣기 : 사용자 이름으로 데이터 가져오기
		Userinfo u = null;
		String sql = "SELECT * FROM USERINFO\r\n"
				+ "WHERE \"user_name\" = '" + user_name +"'";
		try {
			con = YT_DB.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				u = new Userinfo(
					rs.getString("user_name"),
					rs.getString("favorite_song"),
					rs.getString("fsong_artist"),
					rs.getString("favorite_genre")
				);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 예외:"+e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		}finally {
			YT_DB.close(rs, stmt, con);
		}		
		
		return u;
	}
	
	public void fastsel() {
	// 빠른 선곡 : songinfo에 있는 가수 제목과 노래 제목으로 리스트 만들기
		try {
			con = YT_DB.con();
			String sql = "SELECT * FROM songinfo";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString("artist_name") 
						+ "의 ");
				System.out.println(rs.getString("title"));
			}
			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("DB 처리 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("공통 예외:" + e.getMessage());
		} finally {
			YT_DB.close(rs, stmt, con);
		}
	}
	
	public Songinfo rankinglist(int ranking) {
		// 인기 급상승 곡 : 랭킹으로 데이터 가져오기
		Songinfo s = null;
		String sql = "SELECT * FROM SONGINFO\r\n"
				+ "WHERE ranking = " + ranking;
		try {
			con = YT_DB.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				s = new Songinfo(
					rs.getString("title"),
					rs.getString("album_title"),
					rs.getString("artist_name"),
					rs.getInt("ranking"),
					rs.getString("genre")

				);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 예외:"+e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		}finally {
			YT_DB.close(rs, stmt, con);
		}		
		
		return s;
	}
	
	public List<Songinfo> artistlist(Map<String,String> sch){
		// 추천 가수 : 장르 별 리스트 만들기
		List<Songinfo> slist = new ArrayList<Songinfo>();
		String sql = "SELECT * FROM SONGINFO \r\n"
				+ "WHERE genre = ?";
		try {
			con = YT_DB.con();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sch.get("genre"));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				slist.add(new Songinfo(
					rs.getString("title"),
					rs.getString("album_title"),
					rs.getString("artist_name"),
					rs.getInt("ranking"),
					rs.getString("genre")
				));
			}			
			rs.close();
			stmt.close();
			con.close();			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			YT_DB.close(rs, stmt, con);
		}			
		return slist;
	}
   

   public static void main(String[] args) {
      YT_main dao = new YT_main();
      Map<String, String> sch = new HashMap<String, String>();

      while (true) {
      	// 메뉴 선택
          System.out.println("\n[음악 플레이어 메뉴]");
          System.out.println("1. 다시듣기");
          System.out.println("2. 빠른 선곡");
          System.out.println("3. 인기 급상승 곡");
          System.out.println("4. 추천 아티스트");
          System.out.println("5. 종료");
          System.out.print("메뉴를 선택하세요: ");
          int choice = sc.nextInt();
          sc.nextLine();

          switch (choice) {
              case 1: // 다시 듣기
              	  System.out.println("# 다시 듣기 #");
              	  System.out.println("사용자의 이름을 입력하세요: ");
                  String cho_re = sc.nextLine();
                  Userinfo u = dao.replay(cho_re);
                  if(cho_re.equals(u.getUser_name())) {
                    System.out.println(cho_re + "님이 바로 전에 들은 노래");
                    System.out.println(u.getFsong_artist()
                    		+"의 "+ u.getFavorite_song()+ " 입니다.");
                  }else {
                	System.out.println(u.getUser_name() 
                			+ "은(는) 찾을 수 없는 사용자 입니다.");
	              }
	              break;
	          case 2: // 빠른 선곡
                  System.out.println("# 빠른 선곡 #");
                  dao.fastsel();
                  break;
                  
              case 3: // 인기 급상승 곡
              	System.out.println("# 인기 급상승 곡 #");
              	int i = 1;
              	Songinfo s = dao.rankinglist(i);
              	if(i == s.getRanking()) {
              		System.out.println("1위 곡은 " 
              				+ s.getArtist_name() 
              				+ "의 " + s.getTitle() + "이다.");
              	}
                break;
                 
              case 4: // 추천 가수
              	System.out.println("# 추천 아티스트 #");
              	System.out.println("가장 선호하는 장르를 입력하시오");
              	String cho_A = sc.nextLine();
                System.out.println("가장 선호하는 장르: " + cho_A);
                sch.put("genre", cho_A);
                for(Songinfo si:dao.artistlist(sch)) {
                   	System.out.println(si.getArtist_name()
                			+" 아티스트를 추천합니다.");
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