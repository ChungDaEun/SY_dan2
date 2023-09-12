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
5. servlet에서 반복문으로 7가지 무지개 색 h2를 만드세요
6. servlet에서 4X4테이블로 클릭시 @@번호 안녕하세요가 alert으로 로딩되게 하세요.
7. jsp의 script 3가지를 코드와 함께 기술하세요.
8. jsp에서 선언(declaration)을 통해서 가격과 갯수를 선언하고, 메서드를 통해 가격과 갯수를 받아서 합산을 처리하는 메서드를
   선언하고, 하단에서 호출하는 화면을 만드세요.
9. jsp의 sciptlet과 expression을 이용해서 랜덤 구구단을 테이블로 9X1로 출력해보세요
--%>
 
<%-- 5번 문제 --%>
<h1>5번 문제 : 무지개</h1>
<% String [] arr = {"red","orange","yellow","green","blue","pink","purple"};%>
<%
	for(String rainbow: arr){%>
			<h2 style = color:<%=rainbow %>><%=rainbow %></h2>		
<%	} %>

<%-- 6번문제 --%>
<h1>6번 문제</h1>
<%
out.print("<script>function himan(ob){alert(ob+'번호 안녕하세요')}</script>");
out.print("<table border width='300px' height='300px'>");
for(int idx=0;idx<4;idx++) {
      out.print("<tr>");
      for(int jdx=0;jdx<4;jdx++) {
      out.print("<td onclick='himan(" + (idx*4+jdx+1) + ")'>");
      out.print(idx*4+jdx+1);
      out.print("</td>");
}
out.print("</tr>");
}
out.print("</table>");
%>

<%--8번 문제 --%>
<%!
	String pro = "사탕"; 
	int pri = 2000;
	int cnt = 3;
	int receipt(){
		return pri*cnt;
	}
%>
<h1>8번 문제</h1>
<h3>구매 물건 : <%=pro %></h3>
<h3>물건 가격 : <%=pri %>개</h3>
<h3>물건 갯수 : <%=cnt %>원</h3>
<h3>지출 금액 : <%=receipt() %>원(메소드 사용)</h3>

<%--9번 문제 --%>
<h1>9번 문제</h1>
<table border>
<tr>
<%for(int i = 1; i<=9; i++){%>
		<%
		int n1 = (int)(Math.random() * 9 +1);
		int n2 = (int)(Math.random() * 9 +1);
		%>
		<td><%=n1 * n2 %></td>
<%} %>
</tr>
</table>


</body>
</html>