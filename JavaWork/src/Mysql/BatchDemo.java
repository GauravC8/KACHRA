package Mysql;

import java.sql.*;

public class BatchDemo {

	Connection conn;
	ResultSet rs;
	Statement smt;

	// creating the connection
	void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "root");
			smt = conn.createStatement();
			conn.setAutoCommit(false);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void createBatch() throws SQLException {
		// calling the procedure

		smt.addBatch("insert into skills(name) values ('DevOps')");
		smt.addBatch("UPDATE skills SET name = 'Web_App' where id=4");
		// smt.addBatch("delete from skills where id=4");
		conn.setAutoCommit(false);
		try {
			int i[] = smt.executeBatch(); // array of batch statements
			conn.commit();
			System.out.println("Batch is successfully executed");
		} catch (Exception e) {
			conn.rollback();
			System.out.println("Batch file is failed");
		}
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BatchDemo bd = new BatchDemo();
		bd.createConnection();
		bd.createBatch();
	}

}
