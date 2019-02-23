package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPreparedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "root");
			String query = "insert  into `candidates`(`id`,`first_name`,`last_name`,`dob`,`phone`,`email`) values (116,'Anita','Katherine','1970-11-01','(555) 225-3625','anitakarri@gmail.com')";
			PreparedStatement st = conn.prepareStatement(query);
			boolean rowAffected = st.execute();
			System.out.println("Row Affected " + rowAffected);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
