package homework;

public class H08_230411 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
/*
[1단계:개념] 1. ul과 ol의 차이점을 기본예제를 통해서 기술하세요
ul - 순서가 없는 리스트
ol - 순서가 있는 리스트
<h2>오늘 쇼핑한 목록</h2>
<ul>
   <li>반팔티</li>
   <li>바지</li>
   <li>손수건</li>
</ul>
<h2>샤워순서<h2>
<ol>
   <li>양치를 한다.</li>
   <li>샴푸를 한다.</li>
   <li>바디워시를 한다.</li>
   <li>폼클렌징를 한다.</li>
</ol>

[1단계:개념] 2. 중첩태그 코드란 무엇인지 형식과 예제를 기술하세요.
<h2>과목 별 성적</h2>
<ul>
   <il>국어</il>
      <ol> <il>80점</il> </ol>
   <il>영어</il>
      <ol> <il>90점</il> </ol>   
   <il>수학</il>
      <ol> <il>100점</il> </ol>
</ul>

[1단계:개념] 3. ul과 ol의 속성을 기술하고, 속성값이 적용된 예제를 만들어 보세요.
ul의 속성
1. dis
2. square
3. circle
<h2>내가 해본 음식</h2>
<ul type = "circle">
   <li>스파게티</li>
   <li>깁치볶음밥</li>
</ul>

ol의 속성
1. type
2. start
<h2>샤워순서<h2>
<ol type = "A" start = "2">
   <li>양치를 한다.</li>
   <li>샴푸를 한다.</li>
   <li>바디워시를 한다.</li>
   <li>폼클렌징를 한다.</li>
</ol>

[1단계:확인] 4. ul/ol을 중첩적으로 사용하여, 학년 반별 학생명단을 리스트하세요
<h2>학생명단</h2>
<ul>
   <il>1-1</il>
      <ol> <il>정다은</il> <il>김다은</il> <il>박다은</il><il>솔다은</il><il>이다은</il> </ol>
   <il>1-2</il>
      <ol> <il>정민규</il><il>김민규</il><il>박민규</il><il>솔민규</il><il>이민규</il> </ol>   
   <il>2-1</il>
      <ol> <il>정민지</il><il>김민지</il><il>박민지</il><il>솔민지</il><il>이민지</il> </ol>
</ul>

[1단계:개념] 5. table의 계층별 구성요소의 의미를 기본 예제를 통해서 기술하세요..
<table>
          <caption>테이블</caption>
          
         <thead>
            <tr>
               <th>책 제목</th><th>순위</th>
            </tr>
         </thead>
         <tbody>
            <tr>
               <td>제목1</td><td>1</td>
            </tr>
            <tr>
               <td>제목2</td><td>2</td>
            </tr>
            <tr>
               <td>제목3</td><td>3</td>
            </tr>                        
        </tbody>
         <tfoot>
            <tr>
               <th>총 3권</th><th>베스트셀러</th>
            </tr>
         </tfoot>
        </table>
[1단계:확인] 6. table의 전체 계층 구조로 회원 현황을 만드세요
      순차번호, 아이디 회원명 권한 포인트 
<h2>회원 현황</h2> 
      <table border>
         <thead>
            <tr>
               <th>순차번호</th><th>아이디</th><th>회원명</th><th>권한포인트</th>
            </tr>
         </thead>
         <tbody>
            <tr>  <td>01</td><td>dan2</td><td>단</td><td>2000pt</td>  </tr>
            <tr>  <td>02</td><td>minji</td><td>밍지</td><td>3000pt</td>  </tr>
            <tr>  <td>03</td><td>ming</td><td>만</td><td>600pt</td>  </tr>                        
        </tbody>
         <tfoot>
            <tr>  <th>총 3명의 회원</th><th>아이디는 영문과 숫자</th>
                  <th>회원명은 한글</th>포인트는 1000pt부터 사용가능 </tr>
         </tfoot>
        </table>    
        
        
[1단계:개념] 7. 매서드의 구성요소와 해당 구성요소의 특징을 기본 예제를 만들어서 설명하세요.


[1단계:확인] 8. 메서드의 리턴유형을 정수,실수,문자열,boolean을 선언하여 실제 데이터를 리턴하고, 메인메서드에서 호출하세요
[1단계:확인] 9. Product88이라는 클래스를 선언하고, 생성자를 통해 물건명, 가격, 갯수를 초기화하게 했다.
      이 때, 메서드1 물건명 리턴, 메서드2 가격리턴, 메서드3는 가격과갯수를 연산한 총계를 리턴하게
      선언하고 해당 메서드를 호출하여 리턴값을 확인하세요.
[1단계:확인] 10. BBPlayer라는 클래스를 선언하고, 생성자를 통해 필드값 이름, 팀명, 타석, 안타를 초기화하게 하고,
      메서드1에서는 이름과 팀명을 리턴, 메서드2에서는 타율(안타/타석)을 리턴하여 호출되게 하여
      메인메서드를 통해서 출력하세요.
 */
      //문제8번
      basic math = new basic(3,2.15,"정답",true);
      System.out.println("정수: " + math.n1());
      System.out.println("실수: " + math.n2());
      System.out.println("문자열: " + math.n3());
      System.out.println("boolean: " + math.n4());
      
      //문제 9번
      Product88 shop = new Product88("연필",2000,6);
      System.out.println("구매한 물건: " + shop.A());
      System.out.println("가격: " + shop.B() +"원");
      System.out.println("총계: " + shop.C() + "원");
      
      //문제10번
      BBPlayer baseball = new BBPlayer("곽두팔","기아타이거즈",50,200);
      System.out.println("선수 이름과 팀명: " + baseball.name());
      System.out.println("타율: " + baseball.batPer() +"%");
   }

}
//문제 8번 정수,실수,문자열,boolean
class basic{
   int fir;
   double sec;
   String thi;
   boolean fou;
   public basic(int fir, double sec, String thi, boolean fou) {
      this.fir = fir;
      this.sec = sec;
      this.thi = thi;
      this.fou = fou;
   }
   int n1() {
         return fir;
   }
   double n2() {
         return sec;
   }
   String n3() {
      return thi;
   }
   boolean n4() {
      return fou;
   }
   
   
   
}

//문제 9번
class Product88{
   String proN;//물건명
   int proP;//물건가격
   int proC;//물건갯수
   public Product88(String proN, int proP, int proC) {
      this.proN = proN;
      this.proP = proP;
      this.proC = proC;
   }
   String A() {
      return proN;
   }
   int B() {
      return proP;
   }
   int C() {
      int tot = proP * proC;
      return tot;
   }
}

//문제10번
class BBPlayer{
   String Pname; //이름
   String Tname; //팀명
   int bat; //타석
   int safety; //안타
   public BBPlayer(String Pname, String Tname, int bat, int safety) {
      this.Pname = Pname;
      this.Tname = Tname;
      this.bat = bat;
      this.safety = safety;
   }
   String name() {
      return Pname + "/" + Tname;
    }
   int batPer() {
      int per = safety / bat;
      return per;
   }
}