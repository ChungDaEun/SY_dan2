<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backWeb.z01_vo.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
ex) 구매물품 상세 정보로 테이블과 form 요소객체를 이용하여
물건명, 가격, 갯수, 상품 정보를 table 안에 표현하되 vo 객체를 만들어 value 값에 할당 하세요.
1. 화면 구현
2. 화면에 출력될 속성
3. VO객체를 위한 class 선언
4. import VO 객체
5. VO객체 생성
6. 화면에 expression으로 출력
--%>
<%
Product p = new Product("사과",2000,2,"아주 예쁜 사과");
%>
<h2>구매정보</h2>
<form>
	<table border>
		<col width = "40%"><col width = "60%">
		<tr><th>물건명</th>
			<td><input type = "text" value  = "<%=p.getName()%>" size = "10"></td></tr>
		<tr><th>가격</th>
			<td><input type = "text" value  = "<%=p.getPrice()%>" size = "10"></td></tr>
		<tr><th>갯수</th>
			<td><input type = "text" value  = "<%=p.getCnt()%>" size = "10"></td></tr>
		<tr><th>상품정보</th>
			<td><textarea cols = "20" rows ="5"></textarea></td></tr>
		<tr><td colspan = "2">
			<input type = "submit" value = "구매" size ="10"></td><tr>
		
	</table>
</form>
</body>
</html>