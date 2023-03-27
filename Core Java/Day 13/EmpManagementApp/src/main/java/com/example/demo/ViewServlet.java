package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Employee List</h1>");
		List<Employee> list=EmployeeDao.getAllEmployees();
		out.println("<table border='1' width='100%'>");
		out.println("<tr><th>Eno</th><th>Name</th><th>Dept</th><th>Salary</th><th>Update</th><th>Delete</th></tr>");
		for(Employee e:list)
		{
			out.println("<tr><td>"+e.getEno()+"</td><td>"
								  +e.getEname()+"</td><td>"
								  +e.getDept()+"</td><td>"
								  +e.getSalary()+"</td><td>"
								  + "<a href='updateServlet?eno="+e.getEno()+">Update</a></td><td>"
								  + "<a href='deleteServlet?eno="+e.getEno()+">delete</a></td></tr>");
		}
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
