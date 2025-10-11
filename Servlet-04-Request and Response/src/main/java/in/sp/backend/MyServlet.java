package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		
		System.out.println("Name 1 : " + myname);
		System.out.println("Email 1 : " + myemail);
		
		PrintWriter out = resp.getWriter();
		out.print("Name : " + myname);
		out.print("Email : " + myemail);
	}
}