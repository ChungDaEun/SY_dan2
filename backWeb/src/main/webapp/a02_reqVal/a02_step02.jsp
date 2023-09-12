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
ex) 국어, 영어, 수학 점수를 받아서 총점/평균 처리
1) 요청형식 설정
2) 변수 지정(문자형-요청값)
3) 숫자형 변수 초기 0
4) 조건문 null이 아닐때 형변환
5) 총합 처리
6) 평균처리
?korK=90&engK=20&mathK=40
--%>
<%
String korS = request.getParameter("korK");
int kor = 0;
if(korS != null) kor = Integer.parseInt(korS);

String engS = request.getParameter("engK");
int eng = 0;
if(engS != null) eng = Integer.parseInt(engS);

String mathS = request.getParameter("mathK");
int math = 0;
if(mathS != null) math = Integer.parseInt(mathS);

int tot = kor + eng + math;
int avg = tot / 3;
%>
	<h2>숫자형 데이터 요청값 처리</h2>
	<h3>국어 점수 = <%=kor %>점</h3>
	<h3>영어 점수 = <%=eng %>점</h3>
	<h3>수학 점수 = <%=math %>점</h3>
	<h3>총 점 = <%=tot %>점</h3>
	<h3>평균 = <%=avg %>점</h3>
</body>
</html>