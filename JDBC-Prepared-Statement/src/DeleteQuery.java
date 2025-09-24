import java.sql.*;
import java.util.*;

public class DeleteQuery 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10?createDatabseIfNotExists=true", "root", "Nik@2001");
			
			PreparedStatement ps = cn.prepareStatement("delete from productinfo where pid=?");
			System.out.println("Enter product ID : ");
			int pid = sc.nextInt();
			
			ps.setInt(1, pid);
			
			int success = ps.executeUpdate();
			
			if(success >= 1)
			{
				System.out.println("Record has been deleted");
			}
			else
			{
				System.out.println("Record does not exists");
			}
			
			cn.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		sc.close();
	}
}