package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Statement smt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "root");
			System.out.println("Registering the driver");
			smt = conn.createStatement();
			conn.setAutoCommit(false);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {

			int i1 = smt.executeUpdate("insert into candidate_skills values(105,5)");
			int i2 = smt.executeUpdate("Update skills set name='Ruby' where id = 7");
			conn.commit();
			int i3 = smt.executeUpdate("delete from candidates where id=0");
			System.out.println("Transaction successfull");
		} catch (Exception e) {
			// TODO: handle exception
			conn.rollback();
			System.out.println("Transaction failed");
			e.printStackTrace();
		}
	}
}
