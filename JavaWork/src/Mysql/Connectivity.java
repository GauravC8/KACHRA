package Mysql;
import java.sql.*;

public class Connectivity {

	public static void main(String[] args) throws Exception {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "root");
		Statement s1 =  conn.createStatement();
		//String display ="Select * from people";
		
		ResultSet result = s1.executeQuery("Select * from customers where country='Germany'");
		while(result.next())
		{
			System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3));
		}
		conn.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}