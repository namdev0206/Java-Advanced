package Intro;
import java.sql.*;


public class InsertData03 
{
	public static void main(String[] args) 
	{
		String name = "Raju";
		String email = "raju@gmail.com";
		String pass = "raju@123";
		String gender = "Male";
		String city = "Mumbai";
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?CreateDatabaseIfNotExist=true", "root", "Nik@2001");
			
			PreparedStatement ps = con.prepareStatement("Insert into register values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pass);
			ps.setString(4, gender);
			ps.setString(5, city);
						
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