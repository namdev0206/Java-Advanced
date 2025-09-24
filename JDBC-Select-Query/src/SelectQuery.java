import java.sql.*;
import java.util.*;

public class SelectQuery 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10?createDatabseIfNotExists=true", "root", "Nik@2001");
			
			Statement st=cn.createStatement();
			ResultSet rst = st.executeQuery("select * from productinfo");
				
			rst.next();
			
			int pid = rst.getInt(1);
			String name = rst.getString(2);
			String brand = rst.getString(3);
			int price = rst.getInt("print");
			
			System.out.println("Producr ID = " + pid);
			System.out.println("Producr Name = " + name);
			System.out.println("Producr Brand = " + brand);
			System.out.println("Producr Price = " + price);
			System.out.println("==================================");
			
			
			
			cn.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		sc.close();
	}
}