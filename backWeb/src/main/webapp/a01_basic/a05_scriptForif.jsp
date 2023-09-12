<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
# 반복문과 조건문 활용
1. 여러가지 유형의 script를 통한 java/html코드를 처리할 수 있다.

2. 반복문과 조건문을 활용하면 로직에 의한 여러가지 형태의 화면을 구현이 가능하다.

3. 주로 사용되는 연산식
   1) 비교 연산자 ==, !=
   2) 논리연산자 &&, ||, !
   3) 사칙연산자(나머지 연산자)
      % : 반복문에서 주로 특정한 index의 구분코드를 반복적으로 처리하여 화면을 구현할 때 사용된다.
      <tr>을 틀정 조건에 따른 사용
      if(cnt%4 == 1)
   4) 문자열 비교
      equals() : 정확하게 같을 때
      indexOf() : 포함되어 있을 때
   5) 숫자 비교
   
4. 처리 유형 형태
   1) 기본 로직을 이용한 반복문/조건문 처리
   2) 반복문 밖에 전역변수를 활용하여 처리하는 형태
--%>
 
<%--
1~10까지 출력하되 총 합산을 마지막에 출력하세요.
출력형태 1 + 2 + 3 + 4.... = 총 합
--%>
<h2>
<%--
1. java 코드로 처리
2. <%%> 처리할 내용, <%=%>을 구분, 화면을 처리할 부분
--%>
	<%
	int tot = 0;
	for(int i = 1; i <= 10; i++){
		tot += i;
	%>
		<%=i %>
	<%
		if(i == 10){%>
			= <%=tot %>
		<%
		}else{%>
			+
		<%	
		}
	}
	%>
</h2>

<%--
ex1) 반복문을 활용하여 임의의 구구단을 설정하고 테이블을 통해서 출력하세요. 
@@ 단
@ X 1 = @@
@ X 2 = @@
@ X 3 = @@
@ X 4 = @@
...
--%>
<table border width = "20%">
<%
int ranN = (int)(Math.random() * 1 + 9);
for(int i = 1; i < 10; i++){%>
	<tr><td><%=ranN %> X <%=i %> = <%= ranN * i %> </td></tr>
<%}%>
</table>

<%--
ex2) 홀수/짝수 표시 1~10 출력
no 구분
1  홀수
2  짝수
...
--%>
<table border width = "20%">
<tr><th>no</th><th>구분</th></tr>
<%
for(int no = 1; no <= 10; no++){
	int ranN2 = (int)(Math.random() * 10 +1);
	if(ranN2 % 2 ==0){%>
		<tr><td><%=no %></td><td>짝수</td></tr>
	<% 	
	}else{%>
		<tr><td><%=no %></td><td>홀수</td></tr>
	<% 	
	}
}%>
</table>

<%--
ex3) form 화면에서 테이블로
학번	국어	 영어  수학	평균
1	[70] [80] [90]

점수 부분은 <input 형식을 value값에 점수가 입력되어 출력되게 하고 반복문을 통해서 학생 5명을 출력하되
점수는 임의로 0~100사이에 나오게 하세요.
 --%>

<form>
<table border width = "20%">
	<tr><th>학번</th><th>국어</th><th>영어</th><th>수학</th><th>평균</th>
	<%
	for(int n = 1; n <= 5; n++){
		int kor = (int)(Math.random() * 100);
		int eng = (int)(Math.random() * 100);
		int math = (int)(Math.random() * 100);
		int avg = (kor + eng + math) / 3; %>
		<tr><th><%=n %></th>
			<td><input type = "text" size = "2" value= "<%=kor%>"></td>
		    <td><input type = "text" size = "2" value= "<%=eng%>"></td>
		    <td><input type = "text" size = "2" value= "<%=math%>"></td>
		    <td><input type = "text" size = "2" value= "<%=avg%>"></td></tr>
	<%
	}%>
</table>
</form>

</body>
</html>