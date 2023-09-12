<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<%--
[1단계:코드] 2. form형식으로 다중 처리하는 예제를 아래 3가지 형식으로 선언하고 다음 페이지에 출력하세요
   1) 구매할 물건명 입력(type=text)
   2) 결재할 물건의 가격(type=checkbox) : 선택된 것만
   3) select로 구매할 물건의 가격 : ctrl로 선택된 것만
--%>

<h2>영수증</h2>
<h3>물건명 : <%=request.getParameter("pname") %></h3>

<h3>물건 가격1</h3>
<%
String price01[] = request.getParameterValues("price01");
for(String priceA:price01){
	if(priceA != null && !priceA.equals(""))
		out.print("<h3>" + priceA + "</h3>");
}
%>

<h3>물건 가격2</h3>
<%
String price02[] = request.getParameterValues("price02");
for(String priceB:price02){
	if(priceB != null && !priceB.equals(""))
		out.print("<h3>" + priceB + "</h3>");
}
%>

</body>
</html>