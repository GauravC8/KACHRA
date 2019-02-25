package Mysql;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobDemo {

	static Connection conn;
	PreparedStatement psmt;

	public void writeBlob(int candicateId, String filename) {
		String updateSQL = "Update candidates SET resume = ? WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(updateSQL);

			File file = new File(filename);
			FileInputStream input = new FileInputStream(file);

			psmt.setBinaryStream(1, input);
			psmt.setInt(2, candicateId);
			System.out.println("Reading file " + file.getAbsolutePath());
			System.out.println("Store file in the database ");
			psmt.executeUpdate();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BlobDemo bd = new BlobDemo();
		bd.writeBlob(133, "D:\\KACHRA\\JavaWork\\src\\Mysql\\johndoe_resume.pdf");
	}

}
