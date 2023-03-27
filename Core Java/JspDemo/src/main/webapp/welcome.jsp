<%@ page errorPage="error.jsp" isErrorPage="false" isELIgnored="true" import ="java.util.Date" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="index.html" %>
    <%@taglib uri="http://javatpoint.com/tags"  prefix="mytag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="name.jsp"/>
<jsp:include page="name.jsp"/>
<mytag:currentDate/>
<jsp:setProperty name="eno" value="100"/>
<jsp:getProperty name="eno" />
<!-- Scriptlet Tag -->
<%
 String username=request.getParameter("userName");
 out.println("Welcome "+username);
 out.println("Today is" +new Date());
%>
<!-- Expression Tag -->
<%=
"Today is "+new Date()
%>
<%=
 "Welcome" +request.getParameter("userName")
%>
<!-- Declaration Tag -->
<%!
	int value=100;
	int cube(int n)
	{
		return n*n*n;
	}
%>
<%= "Value Initialiazed : "+value %>
<%= "Cube of 25 is: "+cube(25) %>
</body>
</html>