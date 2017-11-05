import java.sql.*;

public class OdbcAccessCreateTable{
	public static void main(String args[]){
		Connection con = null;
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:data");
			System.out.println("connection ok");
			Statement sta= con.createStatement();
			 int count= sta.executeUpdate("CREATE TABLE HY_Address(ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
			System.out.println("Table Created Successfully....");
			sta.close();			
			con.close();
		}catch(Exception e){
			System.out.println("Exception :" + e.getMessage());
		}
	}
}