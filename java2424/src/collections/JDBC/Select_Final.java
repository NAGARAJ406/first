package collections.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_Final {
	
	 private final static String Sql="SELECT * FROM CAR";
	 
	public static void main(String[] args) {
		 Connection con = null;
		 Statement st = null;
		 ResultSet rs= null;
		
				
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if(con==null)
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","nani123");
			if(st==null)
			st=con.createStatement();
			if(rs==null)
			rs=st.executeQuery(Sql);
			while(rs.next()) {
				String name = rs.getString("name");
				int max_speed=rs.getInt("maxspeed");
				String brand = rs.getString("brand");
				System.out.println("name::..."+name+", max speed::.."+max_speed+", Brand::..."+brand);
			}
			
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			 
				try {
					if(con==null)
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
					try {
						if(st==null)
						st.close();
					    }
					catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				     	}
					 
						try {
							if(rs==null)
							rs.close();
					     	} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						    }
		   }//finally
		}//main
	 }//class
		
	
	 



