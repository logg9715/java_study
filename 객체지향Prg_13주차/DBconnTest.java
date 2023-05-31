package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnTest {
	public DBconnTest() {

	}

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "dongyang");
			System.out.println("connected");

			String id = "2020111", name = "ㅇㅇ", dept = "컴공과";
			
//			Statement stmt = conn.createStatement();
//			String sql1 = "insert into studenttbl" 
//			+ " values('" + id + "', '" + name + "', '" + dept + "');";
//
//			stmt.executeUpdate(sql1);
			
			String sql2 = "insert into studenttbl values(?, ?, ?);";
			PreparedStatement pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, dept);
			pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
