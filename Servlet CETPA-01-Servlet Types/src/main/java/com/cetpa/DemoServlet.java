package com.cetpa;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

//URL of this Servlet is --> http://localhost:8080/Servlet-001-Servlet_Types/demo
@WebServlet("/demo")
public class DemoServlet implements Servlet
{
	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{
		System.out.println("Init method Invoked......");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Service method Invoked......");
	}
	
	@Override
	public void destroy() 
	{
		System.out.println("Destroy method Invoked......");
	}

	@Override
	public ServletConfig getServletConfig() 
	{
		System.out.println("getServletConfig method Invoked......");
		return null;
	}

	@Override
	public String getServletInfo() 
	{
		System.out.println("getServletInfo method Invoked......");
		return null;
	}
}