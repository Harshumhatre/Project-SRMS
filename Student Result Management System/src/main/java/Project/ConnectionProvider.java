package Project;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ConnectionProvider {
	public static Connection getCon() {
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "Har@1234");
			return con;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
}
