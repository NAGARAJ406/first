package collections.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Select {
	public static void main(String[] args) {
		String sql="select * from car";
		Connection con = null;
		Statement st = null;
		ResultSet rs= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","nani123");
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(1));
				 rs.getString(2);
				 rs.getString(3);
				 }
			
			
		}catch(Exception e) {
			
		}
	}

}
