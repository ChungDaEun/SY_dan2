<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
// 변수로 물건명 가격, 메서드로 물건명(가격) 형태로 리턴하는 내용을 선언하여
// 하단에 h3으로 변수와 메서드를 호출해보세요.

	int pri = 2000;
	String pro = "사탕";
	String getMart(){
		return pro + "의 가격은" + pri + "원이다.";
	}
%>
	
	<h3>물건 가격 물건 명</h3>
	<h3>선언된 변수 호출: <%=pro %>의 가격은 <%=pri %>원이다.</h3>
	<h3>선언된 메서드 호출: <%=getMart() %></h3>
</body>
</html>