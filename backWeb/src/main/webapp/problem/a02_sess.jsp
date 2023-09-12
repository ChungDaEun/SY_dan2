<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backWeb.z01_vo.Person"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<%
HttpSession session02 = request.getSession();
Integer num01 = (Integer) session02.getAttribute("num01");
if (num01 == null) {
    num01 = 0;
} else {
    num01++;
}
session02.setAttribute("num01", num01);
%>
<body>
    <div class="container mt-3">
    	<h2>2페이지</h2>
		<table class="table table-striped table-hover">
		    <tbody>
		    	<tr class="text-center">
			        <td><%=session.getAttribute("num01") %></td>
			   	</tr>
			   	<tr class="text-center">
			        <td onclick="location.href='a01_sess.jsp'">(클릭)</td>
			   	</tr>
		 	</tbody>
		</table> 
</body>
</html>