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
# 배열 데이터 처리
1. 배열을 이용하면 for문과 if문을 통해서 다양한 형식의 웹화면을 처리할 수 있다.

 --%>
 <ol>
 <%
String [] fruits = {"apple","banana","strawberry"};
for(String fruit:fruits){
%>
	<li><%=fruit %></li>
<%} %>
 </ol>

<%-- ex) select의 option내용에 맞는 부서정보를 배열로 선언하고 출력하세요.
         select 인사/회계/재무/기획 --%>
<h2>부서정보</h2>
<%
String [] parts = {"인사","회계","재무","기획"};
int [] code = {10,20,30,40};
%>
부서 : <select onchange = "alert('선택값 = ' + this.value)">
<option value ='00'>부서 선택하세요.</option>
<%for(int i = 0; i < parts.length; i++){%>
	<option value = "<%=code[i]%>" ><%=parts[i]%></option>
<%}%>
}
</select>

</body>
</html>