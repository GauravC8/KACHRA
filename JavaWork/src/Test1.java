import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Records
{
	Connection conn;
	PreparedStatement pst;
	void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "root");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void operation() throws SQLException
	{
		String query = "Update candidates set first_name = ? where id = ?";
		PreparedStatement pst = conn.prepareStatement(query);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name to be updated ");
		String name = sc.next();

		pst.setString(1, name);
		pst.setInt(2, id);

		int rowAffected = pst.executeUpdate();
		System.out.println("Row Affected " + rowAffected);
	}
}
public class Test1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Records r=new Records();
		r.createConnection();	
		r.operation();
	}

}
