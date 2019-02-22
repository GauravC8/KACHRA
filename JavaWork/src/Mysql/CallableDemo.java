package Mysql;

import java.sql.*;

public class CallableDemo {

		static Connection conn;
		ResultSet rs;
		CallableDemo()
			{
				
			}
			void createConnection()
			{
				try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "root");
				}catch(Exception ex){
				ex.printStackTrace();
				}
			}
			public void getSkills(int candidateId)
			{
				String query = "{call get_candidate_skill(?)}";
				ResultSet rs;
				try
				{
					CallableStatement smt = conn.prepareCall(query);
					smt.setInt(1, candidateId);
					rs =smt.executeQuery();
					while(rs.next())
					{
						System.out.println(String.format("%s - %s",rs.getString("first_name") + " "+ rs.getString("last_name"),rs.getString("skill")));
					}
				}catch(Exception ex) {ex.printStackTrace();}
			}
			public static void main(String[] args) {
				CallableDemo cd =new CallableDemo();
				cd.createConnection();
				cd.getSkills(133);
			}
}