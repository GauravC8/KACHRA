package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scrol {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");// method for class name..........
			// creating Connection....................
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "root");

			// statement creation.....................
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("select * from customers  limit 10");
			rs.afterLast();
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			System.out.println("**********absolute************");
			rs.absolute(7);

			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			System.out.println("***********absolute***********");
			rs.relative(3);

			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			System.out.println("***********absolute***********");
			int i = rs.getRow();
			System.out.println("cursor position=" + i);

			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}