package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcEx_PreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			
			//step 3: get PreparedStatement object from Connection and pass sql statement to it for pre-compilation
			PreparedStatement st = 
			con.prepareStatement("Select empid,empname,empdept from employee where empid=? and empname=?"); //pre-compiled
			
	
	        int ct=2;
	        Scanner sc = new Scanner(System.in);
	        ResultSet rs=null;
	        
	        while(ct>0)
	        {
			  
	          System.out.println("Enter employee id:");
	          int id = sc.nextInt();
			  st.setInt(1,id);
			  
			  System.out.println("Enter employee name:");
			  String n = sc.next();
			  st.setString(2, n);
			  
			  //step 4: fire/execute query on PreparedStatement object and collect the ResultSet object 
			   rs = st.executeQuery();
			  
			//step 5: Iterate through the ResultSet top fetch the rows  
			  while(rs.next())
			  {
				  //step 6: Use Resultset- getxxxx(column no) tpo fetch particular column value
				  int id1 = rs.getInt(1);
				  
				  String empname1 = rs.getString(2);
				  
				  String empdept1 = rs.getString(3);
				  
				  System.out.println("empid="+id1+", empname="+empname1+", empdept="+empdept1);
			  }
			 
			  ct--;
	        }				  
			
	          sc.close();
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
