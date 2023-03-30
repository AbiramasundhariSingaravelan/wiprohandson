<%@ page import="com.example.demo.UserDao" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="obj" class="com.example.demo.User"></jsp:useBean>
    <jsp:setProperty property="*" name="obj"></jsp:setProperty>
	<%
		int i=UserDao.register(obj);
		if(i>0)
		out.print("Succesfully Registered");
	%>