package webProject.myproject.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webProject.myproject.entity.Employee;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		response.sendRedirect("http://localhost:8080/webProject/registrationForm.html");
		pw.close();
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("NAME");
		
		String email = request.getParameter("EMAIL");
		
		String password = request.getParameter("PASSWORD");
	
		String repassword = request.getParameter("REPASSWORD");
		
		System.out.println(password==repassword);
	
		String mobile = request.getParameter("MOBILE");
		int mobi = Integer.parseInt(mobile);
		
		String nic = request.getParameter("NIC");
	
		String gender = request.getParameter("GENDER");

		
		
		Employee emp = new Employee(uname, email, password, mobi, nic, gender);
		
		System.out.println(emp.getFirstName());
		
	}

}
