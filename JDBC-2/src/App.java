import java.sql.*;

public class App 
{
	public static void main(String[] args)
	{
		try
		{
			//Loading MySQL Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class is Loaded");
			
			//Creating Connection Object
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10?createDatabaseIfNotExist=true", "root", "Nik@2001");
			System.out.println("Connection Object is created");
			
			//Creating Statement
			Statement st = cn.createStatement();
			
			//Executing SQL Query
			st.execute("create  table if not exists productinfo(pid int primary key, name varchar(20), brand varchar(20), print int)");
			System.out.println("SQL Query is executed");
			
			//Connection Close
			cn.close();
			System.out.println("Connection is closed");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}