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
<%--
3. forward 액션을 이용하여, 로딩된 구구단의 임의의 문제가 맞으면 정답페이지로 이동 그렇지 않으면 다시 문제풀이 페이지로 처리되게 하세요.
--%>
<body>
	<h2>정답입니다~!</h2>
	<h2>정답은 <%=request.getParameter("ans")%> 입니다.</h2>
</body>
</html>