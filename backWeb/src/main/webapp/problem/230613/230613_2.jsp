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
[1단계:실습] 3. 쿼리스트링으로 회원정보(아이디,패스워드,이름,권한,포인트)를 전송하고 이것을 출력하세요
[1단계:실습] 4. 쿼리스트링으로 선수의정보(이름, 타석,안타)를 통해서 타석과 안타를 형변환하여 이름,타율을 출력하세요
--%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String admin = request.getParameter("admin");
	String point = request.getParameter("point");
%> 
<%-- 230613.jsp?id=dan1792&pw=0620&name=daeun&admin=manager&point=2023 --%>

	<h2>3번 문제 회원정보</h2> 
	<h3>아이디: <%=id%></h3> 
	<h3>패스워드: <%=pw%></h3> 
	<h3>이름: <%=name%></h3> 
	<h3>권한: <%=admin%></h3> 
	<h3>포인트: <%=point%></h3> 

<%
	String pname = request.getParameter("pname");
	String batS = request.getParameter("bat");
	String hitS = request.getParameter("hit");
	int bat = 0, hit = 0;
	if(batS != null) bat = Integer.parseInt(batS);
	if(hitS != null) hit = Integer.parseInt(hitS);
	int bavg = hit/bat;
%>	
<%-- 230613.jsp?pname=이대호&bat=300&hit=20 --%>
	<h2>4번문제 선수 정보</h2>
	<h3>이름: <%=pname %></h3>
	<h3>타석: <%=bat %></h3>
	<h3>안타: <%=hit %></h3>
	<h3>타율: <%=bavg %></h3>

</body>
</html>