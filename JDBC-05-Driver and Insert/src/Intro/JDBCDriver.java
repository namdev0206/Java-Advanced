package Intro;

import java.sql.*;

public class JDBCDriver
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc7?createDatabaseIfNotExist=true", "root", "Nik@2001");
			
			PreparedStatement ps = con.prepareStatement("Select * from jdbc7");
			ps.executeQuery();			//Select Query
			ps.executeUpdate();			//insert, update, delete query
			
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}