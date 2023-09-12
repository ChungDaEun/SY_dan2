<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%--
사원 정보 등록 form을 만들고
문자열
숫자
날짜 형태로 요청값을 a13_insertEmp.jsp에 
VO에 입력되어 vo의 getXXX로 출력되게 하세요.
ex) 직책명, 관리자명 ==> select,
	부서명 ==> radio,
	급여 ==> number
	입사일 ==> date
--%>
<div class = "container mt-3">
	<h2>사원 정보</h2>
	<form action="a13_insertEmp.jsp">
	  <div class="mb-3 mt-3">
	    <label for="empno">사원명</label>
	    <input type="number" class="form-control" id="empno" placeholder="사원명 입력" name="empno">
	  </div>
	  <div class="mb-3">
	    <label for="ename">직책명</label>
	    <select class="form-control" name="job">
	    	<option value = "0000">=직책명선택=</option>
	    	<option>ANALYST</option>
	    	<option>CLERK</option>
	    	<option>MANAGER</option>
	    	<option>PRESIDENT</option>
	    	<option>SALESMAN</option>
	    </select>
	  </div>
	  <div class="mb-3">
	    <label for="mgr">관리자명</label>
	    <select class="form-control" name="job">
	    	<option value = "0000">=관리자선택=</option>
	    	<option value = "7698">BLAKE</option>
	    	<option value = "7782">CLARK</option>
	    	<option value = "7902">FORD</option>
	    	<option value = "7566">JONES</option>
	    	<option value = "7839">KING</option>
	    </select>
	  </div>
	  <div class="mb-3 mt-3">
	    <label for = "hiredateS">입사일:</label>
	      <input type="date" calss = "form-control" id = "hiredateS"
	       placeholder="입사일 선택" name="hiredateS">
	    </label>
	  </div>
	  <div class="mb-3 mt-3">
	    <label for = "sal">급여:</label>
	      <input type="number" calss = "form-control" id = "sal"
	       placeholder="사원명 입력" name="empnoㄴ">
	    </label>
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>

</body>
</html>