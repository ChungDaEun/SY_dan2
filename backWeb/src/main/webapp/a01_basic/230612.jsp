<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backWeb.z01_vo.lib"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
실습예제1) jsp 스크립트릿에서 조건문을 활용하여 테이블로 홀/짝을 만들어서 정답을 클릭했을 때, 임의의 정답/오답으로 처리되게 하세요
         1) 화면 구성
         2) 구슬게임 로직으로 컴퓨터의 결과 처리
            1~6개 임의의 구슬 쥐기
            if문과 %연산자에 의해 홀/짝 결과 처리
         3) 화면에 js에 위 내용에 따른 결과 alert 처리

실습예제2) jsp 스크립트릿에서 조건문/반복문을 활용하여 4행 4열을 만들어 3/6/9게임의 내용을 1~16까지 내용으로 표시하세요
실습예제3) 도서 대출 정보를 VO로 만들어 화면에 표시할 때, 테이블로 화면에 출력하세요.
--%>
<%-- 실습예제1 --%>
<h1>홀/짝 정답은?</h1>
<%
int ranN = (int)(Math.random() * 100 + 1);
%><h2>임의의 수 = <%=ranN %></h2>
<%
if(ranN % 2 == 0){%>
	<table width = "30%" height = "100pt" border>
	<%--
	# js와 jsp의 연동 처리시 주의사항
	1. 숫자형/boolean 데이터 : '' 없이 그대로 할당
	   ex) 변수 = <%= %>
	2. 문자열 데이터 : 반드시 '',""에 할당해서 입력
	   ex) 변수 = '<%= 자바변수%>'
	 --%>
		<tr><td onclick = "call02()">홀</td><td onclick = "call01()">짝</td></tr>
	</table>
<%
}else{%>
	<table border>
	<tr><td onclick = "call01()">홀</td><td onclick = "call02()">짝</td></tr>
    </table>
<%}%>

<%
out.print("<script>function call01(){alert('정답입니다')}</script>");
out.print("<script>function call02(){alert('오답입니다.')}</script>");
%>

<%-- 실습예제2 --%>
<h1>3/6/9 게임</h1>
<table border>
<%
for(int i= 0; i < 4; i++) {%>
	<tr>
    <%
    for(int j = 0; j < 4; j++) {
    	int n = (i * 4 + j) + 1;
    	if(n == 3 || n == 6 || n ==9){%>
    		<td>짝</td>
    	<%
    	}else if(n == 13 || n == 16){%>
		<td>짝</td>
	    <%
    	}else{%>
    		<td><%=n %></td>
    	<%
    	}
}%>
</tr>
<%}%>
</table>

<%-- 실습예제3 
실습예제3) 도서 대출 정보를 VO로 만들어 화면에 표시할 때, 테이블로 화면에 출력하세요.--%>
<%lib l = new lib("구미호뎐","김숙희",34520); %>
<h1>도서 대출 정보</h1>
<table border>
	<tr><th>책 제목</th><th>저자</th><th>도서번호</th></tr>
	<tr><td><%=l.getBname() %></td>
	    <td><%=l.getAuthor() %></td>
	    <td><%=l.getBnum() %></td></tr>
	<tr><td colspan = "3" align = "center">
			<input type = "submit" value = "대여" size ="10"></td><tr>

</table>
</body>
</html>