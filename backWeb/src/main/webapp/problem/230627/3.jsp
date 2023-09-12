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
    <script>
		function getSyn(page){
			var xhr = new XMLHttpRequest();
			xhr.open("get",page,false);
			xhr.send()
			return xhr.responseText;
		} 
	
	
		function callAjax(){
			// name=오길동&fruit=바나나
			// 입력된값을 할당해서 문자열을 만들면 변경이 된다.
			// 입력된 값으로 서버에 요청데이터를 전송
			var name=document.querySelector("#pname").value
			var fruit=document.querySelector("#price").value
			var show = document.querySelector("#show")
			show.innerHTML = 
				getSyn("3data.jsp?pname="+pname+"&price="+price);
		}
    </script>
</head>
<%--
 3. ajax로 물건명[  ]가격[   ][전송 및 화면호출]로 서버에 있는 <h3>@@는 @@@원입니다.</h3> 
 --%>
<body>
    <div class="container mt-3">
    	<h2>3. ajax로 물건명[  ]가격[   ][전송 및 화면호출]로 서버에 있는 @@는 @@@원입니다.호출</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
	            <label for="pname">물건명:</label>
	            <input type="text" class="form-control" 
	      	     id="pname" placeholder="물건명 입력" name="pname">
         	</div>
         	<div class="mb-3 mt-3">
	            <label for="price">가격:</label>
	            <input type="number" class="form-control" 
	      	     id="price" placeholder="가격 입력" name="price">
         	</div>
         	<button type="button" onclick = "callAjax()" class="btn btn-primary">
         	전송 및 화면 호출</button>
         	<div id = "show"></div>
     	</form>    	
    </div>
</body>
</html>