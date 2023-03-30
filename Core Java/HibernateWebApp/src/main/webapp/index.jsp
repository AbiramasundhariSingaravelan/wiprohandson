<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="register.jsp" method="post">
<fieldset>
	Name: <input type="text" name="userName"/><br><br>
	Email Id: <input type="email" name="email"/><br><br>
	Password: <input type="password" name="password"><br><br>
	<input type="submit" value="Register"/>
</fieldset>
</form>
</body>
</html>