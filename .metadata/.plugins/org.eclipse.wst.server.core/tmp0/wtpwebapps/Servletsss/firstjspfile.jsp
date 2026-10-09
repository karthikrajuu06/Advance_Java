<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "java.util.Date" %>
    
    <%!
    int a = 20;
    int b= 30;
    int c = 20;
    public int add(){
    return a+b-c;
    }
 %>
    
    <%
    String s = "Rajuuu";
    String res = "";
    if(s.length()%2==0){
          res ="even";
    }   else{
            res="odd";
            }%>
    
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP FILE</title>
</head>
<h1> this is my First jsp file</h1>
<h2> result is <%= add() %></h2>
<h2> res is <%=res %></h2>
<h2>current Date and time <%= new Date() %> </h2>
<body>

</body>
</html>