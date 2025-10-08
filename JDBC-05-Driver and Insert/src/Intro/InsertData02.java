package Intro;

import java.sql.*;

public class InsertData02 
{
	public static void main(String[] args) 
	{
		String name = "Kamal";
		String email = "kamal@gmail.com";
		String pass = "kamal@123";
		String gender = "Male";
		String city = "Dehradun";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?CreateDatabaseIfNotExist=true", "root", "Nik@2001");
			
			PreparedStatement ps = con.prepareStatement("Insert into register values('"+name+"', '"+email+"', '"+pass+"', '"+gender+"', '"+city+"')");
			
			int i = ps.executeUpdate();
			
			if(i > 0)
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Fail");
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}