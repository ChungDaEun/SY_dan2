<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
	// window.onload와 동일한 메서드
	$(document).ready( function(){
		
		$("#job_id").on('keyup',function(){
			if(event.keyCode == 13){
				$.ajax({
					url:"${path}/job.do",
					type:"post",
					data:"job_id="+$(this).val(),
					dataType:"json",
					success:function(jlist){
						console.log(jlist)
						var add = ""
						jlist.forEach(function(job){
							add += "<tr class='text-center'>"
							add += "<td>"+job.job_id+"</td>"
							add += "<td>"+job.job_title+"</td>"
							add += "<td>"+job.min_sal+"</td>"
							add += "<td>"+job.max_sal+"</td>"
							add += "</tr>"
						})
						$("#show").html(add)
					},
					error:function(err){
						console.log(err)
					}
				})
			}
		})
	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>부서정보검색</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	            <input type="text" class="form-control me-2" 
	      	     id="job_id" placeholder="job_id 입력"  aria-label="Search">
	 	    </div>
	 	</nav>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>job_id</th>
				    <th>job_title</th>
				    <th>min_sal</th>
				    <th>max_sal</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr id="show"  class="text-center">
			        <td></td>
			        <td></td>
			        <td></td>
			        <td></td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>