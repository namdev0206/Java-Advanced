import java.sql.*;
import java.util.*;

public class InsertQuery {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc10?createDAtabaseIfNotExists=true", "root", "Nik@2001");
			
			PreparedStatement ps = cn.prepareStatement("insert into productinfo values(?,?,?,?)");
			
			System.out.print("Enter Product ID : ");
			int pid = Integer.valueOf(sc.nextLine());
			ps.setInt(1, pid);
			
			System.out.print("Enter Product Name : ");
			String name = sc.nextLine();
			ps.setString(2, name);
			
			System.out.print("Enter Product Brand : ");
			String brand = sc.nextLine();
			ps.setString(3, brand);
			
			System.out.print("Enter Product Price : ");
			int price = Integer.valueOf(sc.nextLine());
			ps.setInt(4, price);
			
			
			int success = ps.executeUpdate();
			
			if(success >= 1)
			{
				System.out.println("Record has been inserted");
			}
			else
			{
				System.out.println("Record does not Exists");
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