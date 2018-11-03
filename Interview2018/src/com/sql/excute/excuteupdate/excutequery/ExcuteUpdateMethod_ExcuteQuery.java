package com.sql.excute.excuteupdate.excutequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcuteUpdateMethod_ExcuteQuery {
	public static void main(String a[]) {

		Connection con = null;
		Statement stmt;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manisaschema", "root", "root");
			 stmt = con.createStatement();

			 String sql = "UPDATE manisaschema.user set name='manisa' WHERE id=1003";
		      
		      // Let us check if it returns a true Result Set or not.
		      Boolean ret = stmt.execute(sql);
		      System.out.println("Return value is : " + ret.toString() );

		      // How many row affcted
		      int rows = stmt.executeUpdate(sql);
		      System.out.println("Rows impacted : " + rows );

		      // Let us select all the records and display them.
		      sql = "SELECT * FROM manisaschema.user";
		   // Excute only Select Query
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		        System.out.println(rs.getInt(1) + " name : "+ rs.getString(2));
		         
		       // System.out.println();
		        System.out.println(rs.getString(3));

		         //Display values
		        
		      }
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      con.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		  
		   } 
		   System.out.println("Goodbye!");
		
	
		}
}