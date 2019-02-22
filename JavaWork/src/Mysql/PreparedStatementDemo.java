package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "root");
			String query= "Update employees "+"set jobTitle = ? "+"where employeeNumber = ?";
			PreparedStatement st = conn.prepareStatement(query);
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Employee Id ");
			int eid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Job title ");
			String jobt = sc.next();
			
			st.setString(1, jobt);
			st.setInt(2,eid);
			
			int rowAffected = st.executeUpdate();
			System.out.println("Row Affected " + rowAffected);
			
			jobt ="Sales Head";
			eid =1370;
			st.setString(1, jobt);
			st.setInt(2, eid);
			rowAffected = st.executeUpdate();
			System.out.println("Row Affected " + rowAffected);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
