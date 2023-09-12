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
<%--
# 조별 토론 및 실습과제
[1단계:개념확인] 1. 조별로 el 태를 활용한 session scope범위와 실제 코드에 대하여 알고 있는지 확인
            ajax를 처리하기 위해 필요한 기본 형식과 기본 데이터와 json데이터 가져오는 처리형식을 아는지 확인
            
            1) session scope 범위 
               브라우저 단위이며 모든 브라우저를 끄지 않는 이상 계속 데이터가 남아 있다.
               session.setAttribute("age",25);
               ${age}
            
            2) ajax
               var xhr = new XMLHttpRequest()
               xhr.open("get/post","이동할 jsp","동기/비동기 여부 boolean")
               xhr.send()
               var data = xhr.responseText
               ==> 가져온 문자열을 json 객체로 변환
               var obj = JSON.parse(data)
               json 데이터 ==> {"속성":"값"}
            
[1단계:코드] 2. el 태그를 이용하여 4가지 session scope의 범위를 기본 변수로 설정하여 호출해보자.
[1단계:코드] 3. el을 이용하여 클래스 Person을 객체로 session scope로 설정하고 호출해 보자.
[1단계:코드] 4. el을 이용하여 form으로 물품명과 가격과 갯수을 입력해서 해당 내용을 출력처리하자.
[1단계:코드] 5. ajax처리 순서를 기술하고, 서버에 선언된 데이터(하나데이터,배열데이터, json 데이터)를 동기적으로 가져오는 처리를 하여 화면에 할당하세요.
--%>
<body>
<%
// 문제2
request.setAttribute("name", "홍길동");
session.setAttribute("age",25);
pageContext.setAttribute("loc","서울");
application.setAttribute("email", "a123@gmail.com");

// 문제3
session.setAttribute("per", new Person("표지훈",31,"상암"));
%>
    <div class="container mt-3">
    	<h1>문제2</h1>
    	<h3>이름(request):${name}</h3>
    	<h3>나이(session):${age}</h3>
    	<h3>사는 곳(page):${loc}</h3>
    	<h3>이메일(application):${email}</h3><br>
    
    	<h1>문제3</h1>
    	<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr class="text-center">
				    <th>이름</th>
				    <th>나이</th>
				    <th>사는 곳</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr class="text-center">
			        <td>${per.name }</td>
			        <td>${per.age }</td>
			        <td>${per.loc }</td>
			   	</tr>
		 	</tbody>
		</table>
    	
    	<h1>문제 4</h1>
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
         	<div class="mb-3 mt-3">
	            <label for="cnt">갯수:</label>
	            <input type="number" class="form-control" 
	      	     id="cnt" placeholder="갯수 입력" name="cnt">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr class="text-center">
				    <th>물건명</th>
				    <th>가격</th>
				    <th>갯수</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr class="text-center">
			        <td>${param.pname }</td>
			        <td>${param.price }</td>
			        <td>${param.cnt }</td>
			   	</tr>
		 	</tbody>
		</table> 
		
		<h1>문제5</h1>     
		
    	<h2>ajax / 하나의 데이터 / 동기식</h2>
    	<h2 onclick = "call01()">클릭하세요</h2>
    	<h3 id = "show"></h3><br>
    	
	    <div class="container mt-3">
	    	<h2>ajax / 배열 데이터 / 동기식</h2>
	    	<h2 onclick = "call02()">클릭하세요</h2>
	
			<table class="table table-striped table-hover">
				<thead class="table-success">
			      	<tr class="text-center">
					    <th>이름</th>
					    <th>나이</th>
					    <th>사는곳</th>
			      	</tr>
			    </thead>
			    <tbody>
				   	<tr class="text-center">
				        <td></td>
				        <td></td>
				        <td></td>
				   	</tr>
			 	</tbody>
			</table>      	
	    </div>
    	
	    <div class="container mt-3">
	    	<h2>ajax / Json 데이터 / 동기식</h2>
	    	<form action="" method="post">
	         	<button onclick="call03()" type="button" class="btn btn-primary">
	         		데이터 호출</button>
	     	</form>
			<table class="table table-striped table-hover">
				<thead class="table-success">
			      	<tr class="text-center">
					    <th>이름</th>
					    <th>나이</th>
					    <th>사는 곳</th>
			      	</tr>
			    </thead>
			    <tbody>
				   	<tr class="text-center">
				        <td></td>
				        <td></td>
				        <td></td>
				   	</tr>
			 	</tbody>
			</table>      	
	    </div>
    		
    </div>
</body>
<script type = "text/javascript">
	// 단기 데이터
	function call01(){
		var xhr = new XMLHttpRequest()
		xhr.open("get","230626_1.jsp",false); //동기방식
		xhr.send()
		document.querySelector("#show").innerText = xhr.responseText
	}
	//배열
	function call02(){
		var xhr = new XMLHttpRequest()
		xhr.open("get","230626_2.jsp",false);
		xhr.send()
		var data = xhr.responseText
		var arry = data.split(",")
		var tds = document.querySelectorAll("tbody td")
		arry.forEach(function(prod,idx){
			tds[idx].innerText = prod
		})
	}
	
	// JSON데이터
	function call03(){
		var xhr = new XMLHttpRequest();
		xhr.open("get","230626_3.jsp", false);
		xhr.send();
		var data = xhr.responseText;
		console.log(typeof data)
		var obj = JSON.parse(data) // 문자열을 json 객체로 변환
		console.log(typeof obj)
		var tds = document.querySelectorAll("tbody td")
		tds[0].innerText = obj.name
		tds[1].innerText = obj.age
		tds[2].innerText = obj.loc
	}
</script>
</html>