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
ex) 
fruit01 : 사과 (page범위 설정)
fruit02 : 바나나 (request범위 설정)
fruit03 : 딸기 (session범위 설정)
fruit04 : 수박 (application	범위 설정)
--%>
    <div class="container mt-3">
    	<h2>예제1</h2>
    	<%
    	pageContext.setAttribute("fruit01", "사과");
    	request.setAttribute("fruit02", "바나나");
    	session.setAttribute("fruit03", "딸기");
    	application.setAttribute("fruit04", "수박");
    	%>
    	
		<table class="table table-striped table-hover">
			<thead>
			<tr class="text-center">
				<th>page</th>
				<th>request</th>
				<th>session</th>
				<th>application</th>
			</tr>
			</thead>
		    <tbody>
			   	<tr class="text-center">
			        <td><%=pageContext.getAttribute("fruit01")%></td>
			        <td><%=request.getAttribute("fruit02")%></td>
			        <td><%=session.getAttribute("fruit03")%></td>
			        <td><%=application.getAttribute("fruit04")%></td>
			   	</tr>		   				   				   	
		 	</tbody>
		</table>      	
    </div>
</body>
</html>