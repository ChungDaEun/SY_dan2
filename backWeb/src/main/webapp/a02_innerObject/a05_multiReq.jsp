<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%--
# 다중의 데이터 요청값 받기.
1. 형식
	받을페이지?key1=값1&key1=값2&key1=값3
	1) 요청값 처리 객체
	   String arry[] = request.getParameterValues("key1")
	2) 실무 유형
	   - 구매한 물건을 여러개 등록하는 경우
	   - 구매한 갯수를 여러개 등록하는 경우
	   - 좋아하는 옵션을 여러개 등록할 때 check가 된 것만 등록하는 경우
	   
# 여러 유형 데이터 받기 정리
1. default 문자열받기
2. 숫자형(정수형/실수형)
3. boolean형 받기	
 --%>
</head>
<body>
<h1>구매한 과일</h1>
<%
//?fruits=사과&fruits=바나나&fruits=딸기
String fruits[] = request.getParameterValues("fruits");
if(fruits != null){
	for(String fruit:fruits){
		out.print("<h2>" + fruit + "</h2>");
	}
}

//ex) 가입할 회원의 id들... 반복문을 통해서
//1) @@@
//2) @@@
//3) @@@ 넘버링되어 출력되게 하세요.
%>
<h1>가입한 화원 id</h1>
<%
//?ids=정다은&ids=이예진&ids=손희현&ids=권이주
String ids [] = request.getParameterValues("ids");
if(ids != null){
	for(int i = 0; i < ids.length; i++){
		out.print("<h2>" + (i+1) + ") " + ids[i] + "</h2>");
	}
}
%>
<h1>구매한 물건들의 가격과 총계</h1>
<%
String pricesS [] = request.getParameterValues("price");
int tot = 0;
if(pricesS != null){
	for(int i = 0; i < pricesS.length;  i++){
		int price = Integer.parseInt(pricesS[i]);
		out.print("<h2>" + (i+1) + ") " + price + "</h2>");
		tot += price;
	}
}
%>
<h2>총 계 : <%=tot %></h2>
</body>
</html>