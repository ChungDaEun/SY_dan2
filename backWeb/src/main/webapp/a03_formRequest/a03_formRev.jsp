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
?pname=사과&price=3000
 --%>
	<h1>form으로 받음22222</h1>
	<h1>영수증</h1>
	<h2> 구매 물품: <%=request.getParameter("pname") %></h2>
	<h2> 결제 금액: <%=request.getParameter("price") %></h2>
</body>
</html>