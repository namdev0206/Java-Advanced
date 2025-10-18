package com.cetpa;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

//URL of this Servlet is --> http://localhost:8080/Servlet-001-Servlet_Types/demo
@WebServlet("/hello")
public class GenerateResponse implements Servlet
{
	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		String name = "Amit";
		String message = "Hello " + name;
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<div style='text-align:center'>");
		pw.println("<h1>" +message+ "</h1>");
		pw.println("</div>");
		pw.println("</body>");
		pw.println("</html>");
	}
	
	@Override
	public void destroy() 
	{}

	@Override
	public ServletConfig getServletConfig() 
	{
		return null;
	}

	@Override
	public String getServletInfo() 
	{
		return null;
	}
}