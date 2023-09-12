<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String pname = request.getParameter("pname");
if(pname == null) pname = "";
%>

<h3>${param.pname }은 ${param.price}원입니다.</h3>