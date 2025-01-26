package conn;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnect {

	static Connection conn = null;

	public static Connection getConn() throws ClassNotFoundException {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","prashant074");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static boolean isDbConnected() {
	    try {
	        return conn!=null && !conn.isClosed();


	    } catch (SQLException ignored) {}

	    return false;
	}
}
