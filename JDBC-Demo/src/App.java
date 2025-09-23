import java.sql.*;

public class App 
{
	public static void main(String args[])
	{
		try
		{
			//Statement to load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded");
			
			//Statement to create connection statement
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10", "root", "Nik@2001");
			System.out.println("Connection Object Created");
			
			Statement st = cn.createStatement();
			System.out.println("Selection Object is Created");
			
			st.execute("create table productInfo(pid int primary key, name varchar(20), price int)");
			System.out.println("SQL Query is Executed");
			
			cn.close();
			
			System.out.println("Connection is Closed");;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}