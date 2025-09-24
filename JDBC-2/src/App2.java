import java.sql.*;

public class App2 
{
	public static void main(String[] args)
	{
		try
		{
			//Loading MySQL Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating Connection Object
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10?createDatabaseIfNotExist=true", "root", "Nik@2001");
			
			//Creating Statement
			Statement st = cn.createStatement();
			
			//Executing SQL Query
			st.executeUpdate("insert into productinfo values(101,'Mouse', 'Logitech', 700)");
			//st.execute("insert into productinfo values(102,'Mouse', 'Logitech', 700)");
			
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