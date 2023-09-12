package javaexp.a12_collection;

import java.util.HashMap;
import java.util.Map;

public class A03_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# Map 컬렉션의 특징 및 주요 메서드
1. 특징
   - 키와 값으로 구성된 Map.Entry객체를 저장하는 구조
   - 키와 값은 모두 객체
   - 키는 중복될 수 없지만, 값을 중복 저장 가능
   - ex) 학번의 이름, 주민번호와 이름 
2. 구현 클래스
   HashMap, Hashtable, LinkedHashMap, Properties, TreeMap
3. 주요 메서드
   - put(key, value) : 주어진 키와 값을 추가, 저장이 되는 값을 리턴
   - containsKey(Object key) : 주어진 값이 있는지 여부
   - Set<Map.Entry<K,Y>> entrySet() : 키와 값의 쌍으로 구성된 모든 Map.Entry객체를 Set에 담아서 리턴
   - V get(Object key) : 컬렛녀에 있는 데이터를 가져온다.
   - keySet() : 모든 키를 Set 객체에 담아서 리턴
   - size() : 저장된 크기
   - clear() : 전체 삭제
   - remove(Object key) : 키로 해당 구성데이터 삭제 
 */
		// 문자열 key, 문자열 value으로 설정 map 선언과 할당
		Map<String, String> map01 = new HashMap<String, String>();
		map01.put("1000", "홍길동");
		map01.put("1000", "김길동"); // 키를 중복
		map01.put("1001", "오길동");
		map01.put("1002", "오길동"); // 값을 중복
		// map01.keySet() 키를 Set객체로 가져오는 메서드
		for(String key:map01.keySet()) {
			System.out.println(key + "\t");
			// .get(key) : 해당 key에 대한 값을 가져온다.
			System.out.println(map01.get(key) + "\n");
		}
		// 키는 중복 되지 않고, 값은 중복되어 가져온다.
		// 키의 중복은 최종입력된 것을 기준으로 처리된다.
		
		// 물건명과 가격을 key/value 형식으로 설정해서 Map에 할당하되 물건명과 가격이 중복된 것을 입력하고 그 결과값을 확인하세요.
		Map<String, String> map02 = new HashMap<String, String>();
		// Integer i = 3000; autoBoxing
		// int num = i; autoUnBoxing
		map02.put("바나나", "2000원");
		map02.put("바나나", "3000원");
		map02.put("소세지", "2000원");
		map02.put("소세지", "4000원");
		map02.put("과자", "500원");
		map02.put("아이스크림", "500원");
		map02.put("껌", "200원");
		for(String prod:map02.keySet()) {
			System.out.print(prod + "\t");
			System.out.println(map02.get(prod));
		}
		
/* 
키, 값 형식으로 처리되기에 사용자 정의 클래스를 통한 객체도 키/ 객체 형식으로 할당 할 수 있다.
1. 처리 순서
   1) 사용자 정의 클래스 정의
   2) key/객체 형식으로 추가 처리
   3) 반복문을 통한 객체의 속성값 호출
2. 예제
   학생번호를 key로 하여 학생클래스의 정의하고 해당 학생 객체를 key로 할당하여 처리하자 
 */
		Map<Integer, StudentMap> stdMap = new HashMap<Integer, StudentMap>();
		stdMap.put(1000, new StudentMap("홍길동",70,80,90));
		stdMap.put(2000, new StudentMap("마길동",60,25,30));
		stdMap.put(3000, new StudentMap("오길동",75,50,90));
		stdMap.put(4000, new StudentMap("송길동",33,68,40));
		stdMap.put(5000, new StudentMap("오길동",77,88,55));
		stdMap.put(6000, new StudentMap("신길동",80,62,38));
		for(int stno : stdMap.keySet()) {
			StudentMap st = stdMap.get(stno);
			System.out.println("학번 : " + stno);
			System.out.print(st.getName() + "\t");
			System.out.print(st.getKor() + "\t");
			System.out.print(st.getEng() + "\t");
			System.out.println(st.getMath() + "\n");
		}
		
		// ex) 물건의 serialno를 key로 하여 Product 클래스를 만들어 Map으로 할당하고 출력처리하세요.
		Map<Integer, Product> prodMap = new HashMap<Integer, Product>();
		prodMap.put(1001, new Product("사과", 1000, 4));
		prodMap.put(1002, new Product("바나나", 2000, 2));
		prodMap.put(1003, new Product("리치", 3000, 5));
		prodMap.put(1004, new Product("복숭아", 4000, 6));
		prodMap.put(1005, new Product("딸기", 3000, 3));
		for(int serialno : prodMap.keySet()) {
			Product pd = prodMap.get(serialno);
			System.out.println("시리얼 넘버 : " + serialno);
			System.out.print(pd.getProdN() + "\t");
			System.out.print(pd.getProdP() + "원\t");
			System.out.println(pd.getProdC() + "개\t");
			System.out.println(pd.getProdN() + "의 총 금액 : " + pd.getProdP() * pd.getProdC() + "원");
		}
		
		
	}
}
class StudentMap{
	private String name;
	private int kor;
	private int eng;
	private int math;
	public StudentMap() {
		// TODO Auto-generated constructor stub
	}
	public StudentMap(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
}
class Product{
	private String prodN;
	private int prodP;
	private int prodC;
	public Product(String prodN, int prodP, int prodC) {
		this.prodN = prodN;
		this.prodP = prodP;
		this.prodC = prodC;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public String getProdN() {
		return prodN;
	}
	public int getProdP() {
		return prodP;
	}
	public int getProdC() {
		return prodC;
	}
}