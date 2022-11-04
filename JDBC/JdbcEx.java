package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	public static void main(String args[]) {
		try
		{
	//	Class.forName("com.mysql.jdbc.Driver"); //deprecated
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		//step 2: ask SQL Connection from Driver Manager class, providing connction url,username,password
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?useSSL=false","root","aditya123");)
		{
			
			
			//step 3: get statement object from Connection
			  Statement st = con.createStatement();
			  
			  
			  //step 4: fire/execute query on Statement object and collect the ResultSet object 
			  ResultSet rs = st.executeQuery("Select empid,empname,empdept from employee");
			  
			//step 5: Iterate through the ResultSet top fetch the rows  
			  while(rs.next())
			  {
				  //step 6: Use Resultset- getxxxx(column no) tpo fetch particular column value
				  int empid = rs.getInt(1);
				  
				  String empname = rs.getString(2);
				  
				  String empdept = rs.getString(3);
				  
				  System.out.println("empid="+empid+", empname="+empname+", empdept="+empdept);
			  }
			  
			  rs.close();
			  st.close();
			
			  //step 6: connection is auto closed as u r using try with resource.
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
