import java.sql.*;

public class OdbcAccessInsertRows{
	public static void main(String args[]){
		Connection con = null;
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:student");
			System.out.println("connection ok");
			Statement sta= con.createStatement();
			 int count=0;
			 
			 int c = sta.executeUpdate("INSERT INTO HY_Address"+"(ID, StreetName, City)"+"VALUES(1,'Wilson Garden','Bangalore')");
			 count= count+c;
			System.out.println("value-->1 Inserted Successfully....");
			
			c = sta.executeUpdate("INSERT INTO HY_Address"+"(ID, StreetName, City)"+"VALUES(2,'Giri Nagar','Bangalore')");
			 count= count+c;
			System.out.println("value-->2 Inserted Successfully....");
			
			c = sta.executeUpdate("INSERT INTO HY_Address"+"(ID, StreetName, City)"+"VALUES(3,'Siddapur','Uttara Kannada')");
			 count= count+c;
			System.out.println("value-->3 Inserted Successfully....");
			System.out.println("No. of Rows Inserted::"+count);
			
			sta.close();			
			con.close();
		}catch(Exception e){
			System.out.println("Exception :" + e.getMessage());
		}
	}
}