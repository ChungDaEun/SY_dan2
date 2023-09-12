<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- a06_buyProdlist.jsp
ex) 물건명=@@@&가격=@@@&물건명=@@@&가격=@@@
물건명배열, 가격배열을 따로 받아서
	테이블로
	구매내역
	no	물건명	가격
	1	@@@		@@
	2	@@@		@@
	3	@@@		@@
	4	@@@		@@
		총 비용 @@
 --%>
<h1>구매내역</h1>
<%
//?pname=사과&priceS=2000&pname=바나나&priceS=3000
String pname [] = request.getParameterValues("pname");
String priceS [] = request.getParameterValues("price");
int tot = 0;
if(pname != null && priceS != null){
	out.print("<h2>no\t물건명\t가격</h2>");
	for(int no = 0; no <= pname.length; no++){
		int price = Integer.parseInt(priceS[no]);
		out.print("<h2>" + (no + 1) + "\t" + pname[no] + "\t" + price);
		tot += price;
	}
}
%>
<h2>총 비용 : <%=tot %></h2>

</body>
</html>