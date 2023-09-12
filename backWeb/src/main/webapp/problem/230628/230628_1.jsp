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
# 실습과제
[1단계:개념] 1. ajax처리시 서버단 처리와 프런트 처리의 내용을 순차별 기술하고, 핵심 코드를 정리하세요


2) backend (z12_empList.jsp?ename=A&job=A)
   요청값 : 사원명(ename), 직책(job)
   import : Dao, Vo, Gson
   List<Emp> empList = dao.getEmpList(ename, job)
   <%=gson.toJson(empList)%>
   
3) frontend (a12_Gson_Sch_Post.jsp)
   대상객체 지정
   <input onkeyup = "schEmp()
   <Button type = "button" onclick="shcEmp()"
   이벤트핸들러함수 schEmp()
   - 입력 DOM 객체
     var enameVal = document.querySelector("#ename").value
     var jobVal = document.querySelector("#job").value
     var qurStr = "ename = " + enameVal + "&job = " + jobVal
     var xhr = new XMLHttpRequest()
     xhr.open("post","z12_empList.jsp",true)
     xhr.setRequestHeader("Content-Type","application/x-www.form-urlenxoded");
     xhr.send(qurStr)
     xhr.onreadystatechange = function(){
	      if(xhr.readyState == 4 && xhr.status == 200){
	      	var empList = JSON.parse(xhr.responseText)
	      	console.log(empList)
	      	var show = ""
	      	empList.forEach(function(emp){
	      		show += "<tr>
	      	    show += "<td>" +emp.empno+ "</td>"
	      	 	show += "<td>" +emp.ename+ "</td>"
	      	 	show += "<td>" +emp.job+ "</td>"
	      	 	show += "<td>" +emp.sal+ "</td>"
	      	 	...
	      	 	show +="</tr>
	      	 })
	      	 document.querySelector("tbody").innerHTML = show
	      }
}


[1단계:코드] 2. 부서정보를 ajax로 (부서명,부서위치)키워드 검색하여 리스트 처리하세요.
--%>
<script type="text/javascript">
// enter key 입력시 검색
function schDept13(){
	if(event.keyCode == 13){
		schDept();
	}
}

function schDept(){
	var dnameVal = document.querySelector("#dname").value
	var locVal = document.querySelector("#loc").value
	var qrStr="dname="+dnameVal+"&loc="+locVal
	var xhr = new XMLHttpRequest()
	xhr.open("post","230628_2.jsp",true)
	xhr.setRequestHeader("Content-Type",
			"application/x-www-form-urlencoded")
	xhr.send(qrStr)
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4 && xhr.status==200){
			console.log(xhr.responseText)
			var DeptList = JSON.parse(xhr.responseText)
			var DeptShow = document.querySelector("#DeptShow")
			var show = ""
				DeptList.forEach(function(Dept){
				show+="<tr  class='text-center'>"
				show+="<td>"+Dept.deptno+"</td>"
				show+="<td>"+Dept.dname+"</td>"
				show+="<td>"+Dept.loc+"</td>"
				show+="</tr>"
				
			})
			DeptShow.innerHTML = show
		}
	}
}
</script>
<body>
    <div class="container mt-3">
    	<h2>사원정보 조회</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="dname">부서명:</label>
            <input   onkeyup="schDept()"  type="text" class="form-control" 
      	     id="dname" placeholder="부서명 입력" name="dname">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="loc">부서위치:</label>
            <input  onkeyup="schDept()"  type="text" class="form-control" 
      	     id="loc" placeholder="부서위치 입력" name="loc">
         	</div>
         	<button onclick="schDept()" type="button" class="btn btn-primary">조회</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>부서번호</th>
				    <th>부서명</th>
				    <th>부서위치</th>
		      	</tr>
		    </thead>
		    <tbody id="DeptShow">
		 	</tbody>
		</table>      	
    </div>
</body>
</html>