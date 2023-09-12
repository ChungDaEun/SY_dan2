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
실습과제
[1단계:코드] 2. java로 임의의 구구단을 만들어 html의 form에 출력하고, [ @@] x [@@   ]  정답입력[  ][정답확인]
              정답입력이 맞을시, 정답 그렇지 않을시 오답이 처리되게 하세요. java+js 연동
--%>
<%
int ran01 = (int)(Math.random() * 9 + 1);
int ran02 = (int)(Math.random() * 9 + 1);
%>

<script type="text/javascript">
var num01 = "<%=ran01 %>"	
var num02 = "<%=ran02 %>"	
var tot = num01 * num02
var obj = document.querySelector("#ans");

function call(){
	if(tot == obj.value){
		alert("정답")
	}else{
		alert("오답")
	}
}
/*
# front vs back 연결 코드
1. jsp로 html이 만들어진 결과로
2. 화면단에서 처리된다는 내용 기억
*/
</script> 

    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
    	<h2>[<%=ran01 %>] X [<%=ran02 %>]</h2>
    	<form method="post">
         	<div class="mb-3 mt-3">
            <label for="ans">정답 입력 : </label>
            <input type="number" class="form-control" 
      	     id="ans" placeholder="정답을 입력하세요" name="ans">
         	</div>
         	<button onclick = "call()">정답 확인</button>
     	</form>     	
    </div>
</body>
</html>