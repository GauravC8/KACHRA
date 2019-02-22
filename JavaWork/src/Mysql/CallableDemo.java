package Mysql;

import java.sql.*;

public class CallableDemo {

	Connection conn;
	ResultSet rs;

	//creating the connection
	void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "root");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	//getting dataset using procedure
	public void getSkills(int candidateId) {
		String query = "{call get_candidate_skill(?)}";  //Initializing the query for procedure
		ResultSet rs;
		try {
			CallableStatement smt = conn.prepareCall(query);  //calling the procedure
			smt.setInt(1, candidateId);
			rs = smt.executeQuery();
			while (rs.next()) {
				System.out.println(String.format("%s - %s",
						rs.getString("first_name") + " " + rs.getString("last_name"), rs.getString("skill")));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CallableDemo cd = new CallableDemo();
		cd.createConnection();
		cd.getSkills(133);
	}
}