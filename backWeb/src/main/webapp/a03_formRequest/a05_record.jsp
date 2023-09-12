<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("name");
if(name == null) name="";
String korS = request.getParameter("kor");
int kor = 0;
if(korS != null) kor = Integer.parseInt(korS);
String engS = request.getParameter("eng");
int eng = 0;
if(engS != null) eng = Integer.parseInt(engS);
String mathS = request.getParameter("math");
int math = 0;
if(mathS != null) math = Integer.parseInt(mathS);
int tot = kor+eng+math;
int avg = tot/3;
%>
	<h1>성적표</h1>
	<h2>이름 : <%=request.getParameter("name") %></h2>
	<h2>국어 점수 : <%=request.getParameter("kor") %></h2>
	<h2>영어 점수 : <%=request.getParameter("eng") %></h2>
	<h2>수학 점수 : <%=request.getParameter("math") %></h2>
	<h2>총 점 : <%=tot%></h2>
	<h2>평균 : <%=avg%></h2>
</body>
</html>