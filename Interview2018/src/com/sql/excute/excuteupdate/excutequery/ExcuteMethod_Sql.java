package com.sql.excute.excuteupdate.excutequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcuteMethod_Sql {
	/*Description:
The Statement.execute() method allows us to execute any kind of query like select, update. 
It returns boolean. If the return value is true, then it executed select query, 
get the ResultSet object and read the resulted records. If it returns false, then it can be update query, 
call getUpdateCount() method to get total records updated. Check the below sample code:*/
	
	public static void main(String a[]) {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manisaschema", "root", "root");
			Statement stmt = con.createStatement();
			// The query can be update query or can be select query
			String query = "select * from manisaschema.user";
			boolean status = stmt.execute(query);
			if (status) {
				// query is a select query.
				ResultSet rs = stmt.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
				}
				rs.close();
			} else {
				// query can be update or any query apart from select query
				int count = stmt.getUpdateCount();
				System.out.println("Total records updated: " + count);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception ex) {
			}
		}
	}

}
