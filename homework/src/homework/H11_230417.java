package homework;

public class H11_230417 {
/*
2023-04-17
[1단계:조별확인] 1:1관계 개념을 옆에 있는 조원과 함께 이해 했는지 확인하고 의견을 나누고 정리해보세요.
   1) 1:1관계 객체를 선언하고 만드는 상황은 어떤 상황인지?
   2) 1:1관계 객체 처리할 수 있는지?
   3) 다른 객체 추가 메서드 this.객체 = 객체를 이해하고 있는지?
   4) if(참조==null) 코드는 언제 왜 사용하는지?
   5) 위 내용을 이해 기반으로 커플매칭 사이트에서 Woman/Man 처리해보세요.

1. 남자 클래스
package homework.H10_1;

public class Man {
   private Woman Woman;
   private String name;
   private String job;
   private int age;

   public Man() {
      // TODO Auto-generated constructor stub
   }
   public Man(String name, String job, int age) {
      this.name = name;
      this.job = job;
      this.age = age;
   }

   public void Mshow() {
      System.out.println("# 남자 정보 #");
      System.out.println("남자의 이름: " + name);
      System.out.println("남자의 직업: " + job);
      System.out.println("남자의 나이: " + age);
   }
   
   public void match(Woman Woman) {
      this.Woman = Woman;
      if (age == Woman.getAge()) {
         System.out.println("나이가 같습니다.");
         System.out.println("커플이 매칭되었습니다.");
      }else {
         System.out.println("나이가 다릅니다.");
         System.out.println("커플 매칭에 실패하였습니다.");
      }
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
2. 여자 클래스
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
3. 매칭 클래스
package homework;

import homework.H10_1.Man;
import homework.H10_1.Woman;

public class H11_match {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Woman wo = new Woman("정다은", "회사원", 23);
      Man M = new Man("표지훈", "공무원", 25);
      wo.Wshow();
      M.Mshow();
      M.match(wo);
   }
}   
[1단계:개념] 1. 1:1 관계 객체 구현 순서를 예제를 통해 처리하세요.
1. 객체 관계 구조 결정
2. 포함될 객체 클래스 선언
3. 포함할 클래스에서 포함될 객체를 호출 및 선언
4. 기능 메서드 처리로 해당 포함될 객체 내용도 선언처리
5. main() 처리

[1단계:개념] 2. 객체형 배열의 처리 과정을 기본 예제와 함께 설명하세요.
1. 2차원 형태의 데이터 확인
2. 위 열별 속성에 맞는 데이터유형과 속성명에 맞게 클래스 선언
3. 초기값 설정 생성자 선언 : 전체 데이터가 들어 갈 수 있는 생성자를 선언
4. set/get메서드 선언
5. 배열 선언과 객체 할당
6. 반복문을 통한 조회 및 활용


[1단계:확인] 3. 아래의 2차원 데이터를 객체형 배열로 선언하고 출력하세요.
      1) 구매물건리스트(물건명,가격,구매갯수)
      2) 회원정보리스트(회원아이디, 패스워드, 회원명, 포인트, 권한)
1번 클래스
package homework.H11_arr;

public class Product {
   //      1) 구매물건리스트(물건명,가격,구매갯수)
   private String objN;
   private int objP;
   private int objC;
   public Product() {
      // TODO Auto-generated constructor stub
   }
   public Product(String objN, int objP, int objC) {
      this.objN = objN;
      this.objP = objP;
      this.objC = objC;
   }
   public String getObjN() {
      return objN;
   }
   public void setObjN(String objN) {
      this.objN = objN;
   }
   public int getObjP() {
      return objP;
   }
   public void setObjP(int objP) {
      this.objP = objP;
   }
   public int getObjC() {
      return objC;
   }
   public void setObjC(int objC) {
      this.objC = objC;
   }
}
2번 클래스
package homework.H11_arr;

public class Member {
   //2) 회원정보리스트(회원아이디, 패스워드, 회원명, 포인트, 권한)
   private String id;
   private String pass;
   private String name;
   private int point;
   private String auth;
   public Member() {
      // TODO Auto-generated constructor stub
   }
   public Member(String id, String pass, String name, int point, String auth) {
      this.id = id;
      this.pass = pass;
      this.name = name;
      this.point = point;
      this.auth = auth;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPass() {
      return pass;
   }
   public void setPass(String pass) {
      this.pass = pass;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getPoint() {
      return point;
   }
   public void setPoint(int point) {
      this.point = point;
   }
   public String getAuth() {
      return auth;
   }
   public void setAuth(String auth) {
      this.auth = auth;
   }
}
3. 출력 클래스
package homework;

import homework.H11_arr.Member;
import homework.H11_arr.Product;

public class H11_arry {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Product [] ArrP = new Product[2];
      ArrP[0] = new Product("볼펜", 2000, 3);
      ArrP[1] = new Product("지우개", 1500, 6);
      for(Product Product:ArrP) {
         System.out.print(Product.getObjN() + " ");
         System.out.print(Product.getObjP() + "원 ");
         System.out.println(Product.getObjC() + "개 ");
         int tot = Product.getObjP() * Product.getObjC();
         System.out.println("총 금액 : " + tot + "원");
      }
      
      Member [] ArrM = new Member [3];
      ArrM[0] = new Member("subin","001205", "수빈", 3000, "회원" );
      ArrM[1] = new Member("yeonjun","990913", "연준", 9000, "관리자" );
      ArrM[2] = new Member("Beomgyu","010313", "범규", 200, "신입회원" );
      for(Member Member:ArrM) {
         System.out.print(Member.getId() + " ");
         System.out.print(Member.getPass() + " ");
         System.out.print(Member.getName() + " ");
         System.out.print(Member.getPoint() + "포인트 ");
         System.out.println(Member.getAuth() + "입니다. ");
      }
   }
}

      
[1단계:개념] 4. select 콤보박스의 속성을 각 속성값에 따른 기능적 차이와 함께 기술하세요.
1. name :해당 name값을 기준으로 선택된 항목(option)을 key = value형식으로 서버에 전송이 된다.
2. size :한번에 보일 선택 항목(option)의 갯수를 지정할 수 있다.
3. multiple : ctrl 누른 상태에서 마우스 클릭으로 여러개를 선택할 때 사용된다.
여러개 선택하면 서버에도 배열 데이터로 전송될 수 있다.

[1단계:개념] 5. input의 속성에 따른 속성값을 차이를 기술하세요.
1. name = "요소이름" 서버에 전송시 요청 key로 사용된다.
2. type = "text|password|radio|file.." 등 화면에서 입력 모양에 따라 여러가지 속성 지정가능하다
3. size : 화면에 보이는 문자 입력 크기 참조, 입력으로 처리되는 넓이를 지정해준다.
          입력 크기가 한정되어 있어 더 적은 범위나 넓은 범위는 css로 지정해야한다.
4. maxlength : size와 구별되는데 size 입력하면 보이는 내용이라면 maxlength는 실제 입력할 수 있는 데이터의 크기를 지정한다.
5. value : 초기값으로 설정하여 입력한 데이터를 지정할 때 처리된다.
6. placeholder : 실제 데이터가 입력된 것이 아니라 해당 항목에 대한 설명을 표시할 때 활용된다.

[1단계:확인] 6. 아래 사이트의 회원가입화면을 form요소객체를 table 안에서 적절히 활용하여 처리하세요.(css적용 제외)
      https://www.storyum.kr/story/main/contents.do?menuNo=500018&siteId=5
      에 (기본정보입력 항목)에 맞게 처리하세요
 */
   
}