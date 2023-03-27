<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

%>
<%!
String n=request.getParameter("name");
String p=request.getParameter("password");
	void checkLogin()
	{
	if((n.equals("arthi"))&&(p.equals("arthi")))
	{
		Cookie c=new Cookie("loggedIn","true");
		response.addCookie(c);
		RequestDispatcher rd=request.getRequestDispatcher("home");//mentioning the servlet name
		rd.forward(request, response);//pass the request from one servlet to another
	}
	}
%>
</body>
</html>