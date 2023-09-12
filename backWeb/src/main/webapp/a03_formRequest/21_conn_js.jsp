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
# front단과 backend 연결처리
1. 프로그램이 처리되는 흐름
   1) 요청(요청값) url로 프론트 ==> 서브단에 특정 자원(jsp) 요청값 받아서
      ==> java + html 코드 처리해서 html만들어서 ==> 클라이언트에 html(html + css + js)를 전달
      ==> html을 받아서 브라우저 프로그램이 랜더링(해석) 출력
      
   2) 위 흐름을 감안해 jsp 구현한다.
--%>
<%
String name = "홍길동";
int age = 25;
boolean isAult = age >= 18;
%>
<script type = "text/javascript">
	var name = "<%=name%>"
	var aeg = <%=age%>
	var isAult = <%=isAult%>
	
	alert("이름은 : " + name)
	alert("age : " + age)
	if(idAult){
		alert('성년')
	}else{
		alert('미성년')
	}
	// 다시 서버 넘기는 방법?
	
</script>

<body>
    <div class="container mt-3">
    	<h2 onclick = "call()">사원정보 등록</h2>
    	<script type = "text/javascript">
    	function call(){
    		alert("서버단에서 온 이름 : " + name)
    	}
    	</script>
    	
    	
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="empno">사원번호:</label>
            <input type="number" class="form-control" 
      	     id="empno" placeholder="사원번호 입력" name="empno">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="ename">사원명:</label>
            <input type="text" class="form-control" 
      	     id="ename" placeholder="사원명 입력" name="ename">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>Firstname</th>
				    <th>Lastname</th>
				    <th>Email</th>
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