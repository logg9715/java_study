package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class DBConnEx {

	public static void main(String[] args) {
		Connection conn;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("connection successful");
			st = conn.createStatement();
			st.executeUpdate("insert into student values('20007', '아무개', '경영학과');");
//			st.executeUpdate("insert into student values('20008', '리사', '스포츠학과');");
			st.executeUpdate("update student set id = '21007' where name = '제임스본드'");
			
			st.executeUpdate("delete from student where name = '제임스본드';");
			ResultSet results = st.executeQuery("select * from student");
			while(results.next()) {
				System.out.println(results.getString("id")+results.getString(2)+results.getString(3));
			}
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("SQL Error");
			e1.printStackTrace();
		}
		
		
	}

}
