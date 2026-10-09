<%@ page import = "com.servlets.Employee" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Employee Details</h1>

<%
Employee emp = new Employee();

emp.setEid(Integer.parseInt(request.getParameter("eid")));
emp.setEname(request.getParameter("name"));
emp.setAge(Integer.parseInt(request.getParameter("age")));

out.println(emp.getEid());
out.println(emp.getEname());
out.println(emp.getAge());


%>

</body>
</html>