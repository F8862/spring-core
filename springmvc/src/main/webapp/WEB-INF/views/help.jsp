<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.LocalDateTime"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>Hello My name is Furquan Ansari</h1>

<!-- print data coming from controller using model and view  object -->
<%-- 
<%
String name=(String) request.getAttribute("name");
Integer rollNumber=(Integer) request.getAttribute("rollNumber");
LocalDateTime time=(LocalDateTime) request.getAttribute("time");

%>

<h1>My name is <%=name %></h1>
<h1>My rollNumber is <%=rollNumber %></h1>
<h1>Date and Time is <%=time.toString() %></h1>
 --%>
 
 <!--get and print data using spel coming from controller using model and view  object  -->
 <h1>My name is ${name}</h1>
<h1>My rollNumber is ${rollNumber}</h1>
<h1>Date and Time is ${time.toString()}</h1>

<hr> <!-- it will add horizontal divider -->
<!-- print list data using jstl -->
<c:forEach var="item" items="${marks}">

<h1>${item}</h1>

</c:forEach>
 
 </body>
</html>