
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scroll {

	public static void main(String[] args) throws Exception {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "root");
		Statement s1 =  conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE ,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = s1.executeQuery("Select * from training");
		
		rs.afterLast();
		
		while(rs.next())
		{
			System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3));
		}
		conn.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}