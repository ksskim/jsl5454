package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//track-7:1521/xe", "jsl54", "1234");
			if (con == null) {
				System.out.println("DB 접속 오퓨~~~");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeDB(Connection con,
								PreparedStatement stmt,
								ResultSet rs){
		try {
			con.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
	
}




















