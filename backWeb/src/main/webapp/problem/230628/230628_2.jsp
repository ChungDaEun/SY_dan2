<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"    
    import="com.google.gson.Gson"
    import="java.util.List"
    import="backWeb.z01_vo.Dept"
	import="backWeb.a01_dao.A04_PreparedDao" %>
<%
String dname = request.getParameter("dname");
if(dname == null) dname = "";
String loc = request.getParameter("loc");
if(loc == null) loc = "";

A04_PreparedDao dao = new A04_PreparedDao();
//List<Dept> DeptList = dao.getDeptList(dname, loc);
Gson gson = new Gson();
%>
<%--<%=gson.toJson(DeptList)--%>