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
[1단계:코드] 2. form형식으로 다중 처리하는 예제를 아래 3가지 형식으로 선언하고 다음 페이지에 출력하세요
   1) 구매할 물건명 입력(type=text)
   2) 결재할 물건의 가격(type=checkbox) : 선택된 것만
   3) select로 구매할 물건의 가격 : ctrl로 선택된 것만
--%>
    <div class="container mt-3">
    <h2>영수증</h2>
    <form action="230619_2-2.jsp">
         <div class="mb-3 mt-3">
            <label for="pname">물건명:</label>
            <input type="text" class="form-control" 
              id="pname" placeholder="물건명 입력" name="pname">
         </div>
         
         
         <%
			String prices[] = {"1만원", "2만원","3만원","4만원","5만원"};
		 %>
         <div class="mb-3 mt-3">
            <label for="price01">물건 가격1</label><br>
            <%for(String price:prices){ %>
            <input type="checkbox"
              id="price01" placeholder="<%=price%>" name="price01"/><%=price%><br>
              <%} %>
         </div>
         
         
        <div class="mb-3">
	    <label for="price02">물건 가격2:</label>
	    <select class="form-control" name="price02" multiple>
	    	<option>=물건가격 입력2=</option>
	    	<option>1만원</option>
	    	<option>2만원</option>
	    	<option>3만원</option>
	    	<option>4만원</option>
	    	<option>5만원</option>
	    </select>
        </div>
        
	    <button type="submit" class="btn btn-primary">등록</button>
    </form>
    </div>


</body>
</html>