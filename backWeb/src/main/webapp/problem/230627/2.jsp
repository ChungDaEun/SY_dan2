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
 2. ajax로 [화면호출]로 서버에 있는 <h3>반가워요</h3> 처리 
 --%>
<script type="text/javascript">
function getSyn(page){
	var xhr = new XMLHttpRequest();
	xhr.open("get",page,false);
	xhr.send()
	return xhr.responseText;
} 


function callAjax(){
	var show = document.querySelector("#show")
	show.innerHTML = getSyn("2data.jsp");
}
</script>
<body>
	<h2>2. ajax로 [화면호출]로 서버에 있는 반가워요 처리 </h2>
	<button type = "button" onclick = "callAjax()">화면호출</button>
	<h3 id = "show"></h3>
</body>
</html>