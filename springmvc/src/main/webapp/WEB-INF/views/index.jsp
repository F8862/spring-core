<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>This is home page</h1>
<h1>Called by home controller</h1>
<h1>url /home</h1>
<!-- print data coming from controller using model object -->
<%
   String name=(String)request.getAttribute("name");
    Integer id=(Integer)request.getAttribute("id");
    List<String> friends=(List<String>) request.getAttribute("f");

%>
<h1>Name is <%=name %></h1>
<h1>ID is <%=id %></h1>

<%
 for(String s:friends){
	 %>
	 
	 <h1><%=s %>
	 <% 
 }

%>
</body>
</html>