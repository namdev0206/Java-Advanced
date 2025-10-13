package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String myemail = (String) request.getParameter("name1");
		String mypass = (String) request.getParameter("pass1");
		
		if(myemail.equals("deepak@gmail.com") && mypass.equals("deepak123"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
