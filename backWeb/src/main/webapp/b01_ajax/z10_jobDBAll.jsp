<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="backWeb.z01_vo.Job"
	import="backWeb.a01_dao.A04_PreparedDao"           
    import="java.util.Map"
    import="java.util.HashMap"
	%>
<%
// ex) a10_DBAjax.jsp 처리하세요
A04_PreparedDao dao = new A04_PreparedDao();
Map<String, String> map = new HashMap<String, String>();
map.put("title","");
map.put("min_sal1","0");
map.put("min_sla2","999999");
%>
<%for(Job job:dao.getJobs()){ %>
<tr class="text-center">
	<td><%=job.getJob_id() %></td>
	<td><%=job.getJob_title() %></td>
	<td><%=job.getMin_salary()%></td>
	<td><%=job.getMax_salary()%></td>
</tr>
<%} %>
</html>