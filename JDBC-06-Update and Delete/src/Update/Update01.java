package Update;
import java.sql.*;

public class Update01 
{
	public static void main(String args[])
	{
		String city = "Pune";
		String email = "kamal@gmail.com";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Nik@2001");
			
			PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
			ps.setString(1, city);
			ps.setString(2, email);
			
			int count = ps.executeUpdate();
			
			if(count > 0)
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