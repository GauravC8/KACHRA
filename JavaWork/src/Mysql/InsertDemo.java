package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "root");
			Statement s1 = conn.createStatement();

			// String query = "insert into offices values('9','Delhi','+91 20 7877
			// 5252','Greater Noida','Flat 6','India','EC2N AAA12','EMEA12')";
			String query1 = "delete from offices where city = 'London'";
			// String query1 = "UPDATE offices SET city = 'Italy' WHERE officeCode = 8 ;

			int rowcount = s1.executeUpdate(query1);
			if (rowcount > 0) {
				System.out.println("Record inserted sucessfully");
			}

			String query2 = "Select count(officeCode) from offices";
			ResultSet rs = s1.executeQuery(query2);
			int cnt = 0;
			while (rs.next()) {
				cnt = rs.getInt(1);
			}
			System.out.println("Total number of records is:" + cnt);
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}