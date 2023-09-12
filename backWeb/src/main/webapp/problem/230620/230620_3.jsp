<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backWeb.z01_vo.Salgrade"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
<%--
[1단계:코드] 3. salgrade 테이블을 확인하여, 해당 항목에 맞는 속성으로 form 화면을 구성하고, 입력 후, 확인시, 요청값 처리후,
      Salgrade 객체에 등록이 되어 출력되게 처리하세요.
--%>
<%
String gradeS = request.getParameter("grade");
String losalS = request.getParameter("losal");
String hisalS = request.getParameter("hisal");

String regYN="F";
if(gradeS == null){
	int grade = Integer.parseInt(gradeS);
	int losal = Integer.parseInt(losalS);
	int hisal = Integer.parseInt(hisalS);
}
%>
</head>
<body>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="grade">순위:</label>
            <input type="number" class="form-control" 
      	     id="grade" placeholder="순위 입력" name="grade">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="losal">손실:</label>
            <input type="number" class="form-control" 
      	     id="losal" placeholder="손실 금액 입력" name="losal">
         	</div>
            <div class="mb-3 mt-3">
            <label for="hisal">소득:</label>
            <input type="number" class="form-control" 
      	     id="hisal" placeholder="소득 금액 입력" name="hisal">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>순위</th>
				    <th>손실</th>
				    <th>소득</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>John</td>
			        <td>Doe</td>
			        <td>john@example.com</td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>