import java.sql.*;

public class OdbcAccessConnection{
	public static void main(String args[]){
		Connection con = null;
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:student");
			System.out.println("connection ok");
			con.close();
		}catch(Exception e){
			System.out.println("Exception :" + e.getMessage());
		}
	}
}