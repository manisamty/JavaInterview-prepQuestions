package com.list.method.variable;

import java.sql.*;

public class MySqlConnection {

	public static Connection mycon() throws Exception{
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manisaschema", "root", "root");
		} catch (SQLException e) {
			System.out.println("could not get connection to mysql db==" + e.getMessage());
		}
		return connection;
		}
		}
