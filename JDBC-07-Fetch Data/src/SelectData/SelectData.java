package SelectData;

import java.sql.*;

public class SelectData 
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Nik@2001");
			
			PreparedStatement ps = con.prepareStatement("Select * from register");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				String name1 = rs.getString("name");
				System.out.print("Name: "+ name1);
				
				String email1 = rs.getString("email");
				System.out.print(",  Email: " + email1);
				
				String pass1 = rs.getString("password");
				System.out.print(",  Password: " + pass1);
				
				String gender1 = rs.getString("gender");
				System.out.print(",  Gender: " + gender1);
				
				String city1 = rs.getString("city");
				System.out.print(",  City: " + city1);
				
				System.out.println();
				System.out.println();
			}
			
			con.close();
		}
		catch(Exception ex)
		{
			
		}
	}
}