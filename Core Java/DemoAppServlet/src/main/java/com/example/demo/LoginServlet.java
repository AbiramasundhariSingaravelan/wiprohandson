package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n=request.getParameter("userName");
		String p=request.getParameter("password");
		if((n.equals("arthi"))&&(p.equals("arthi")))
		{
			RequestDispatcher rd=request.getRequestDispatcher("welcome");//mentioning the servlet name
			rd.forward(request, response);//pass the request from one servlet to another
		}
		else
		{
			out.println("Sorry Try Again");
			RequestDispatcher rd=request.getRequestDispatcher("./index.html");//mentioning the servlet name
			rd.include(request, response);
			
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
