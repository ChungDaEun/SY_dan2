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
<%
int ran01 = (int)(Math.random() * 9 + 1);
int ran02 = (int)(Math.random() * 9 + 1);

int tot = ran01 * ran02;
%>
<body>
    	<form action=""  method="post">
    	<h1>랜덤 구구단 맞추기</h1>
    	<h2><%=ran01 %> X <%=ran02 %></h2>
         	<div class="mb-3 mt-3">
            <label for="ans">정답:</label>
            <input type="number" class="form-control" 
      	     id="ans" placeholder="정답 입력" name="ans">
         	</div>
         	<button>정답 확인</button>
     	</form>
     	<h3><%=tot %></h3>
</body>
<%
String ansS = request.getParameter("ans");
if(ansS != null){
	int ans = Integer.parseInt(ansS);
	if(ans == tot){%>
		<jsp:forward page="230622_3-1.jsp"/> 
  <%}else if(ans != tot){%>
		<script type="text/javascript">
			alert('틀렸습니다. 다시 풀어보세요');
		</script>
  <%}
}
%>
<script type="text/javascript">
var num01 = "<%=ran01 %>"	
var num02 = "<%=ran02 %>"	
var tot = num01 * num02
var obj = document.querySelector("#ans");

function call(){
	if(tot == obj.value){
		
	}else{
		alert("오답")
	}
}
</script>

</html>