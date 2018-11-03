package com.desginpattern.singleton;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.DriverManager;

public final class SingletonDatabase {
	
	public Connection conn;
	private Statement statement;
	
	public static SingletonDatabase db;

	private SingletonDatabase() {
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String dbName = "manisaschema";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		try {
			Class.forName(driver).newInstance();
			this.conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
		} catch (Exception sqle) {
			sqle.printStackTrace();
		}
	}
	
	/**
	 *
	 * @return SingletonDatabase Database connection object
	 */
	public static synchronized SingletonDatabase getDbCon() {
		System.out.println();
		if (db == null) {
			db = new SingletonDatabase();
			System.out.println(db);
		}
		return db;

	}

	/**
	 *
	 * @param query
	 *            String The query to be executed
	 * @return a ResultSet object containing the results or null if not
	 *         available
	 * @throws SQLException
	 */
	public ResultSet query(String query) throws SQLException {
		statement = db.conn.createStatement();
		ResultSet res = statement.executeQuery(query);
		return res;
	}

	/**
	 * @desc Method to insert data to a table
	 * @param insertQuery
	 *            String The Insert query
	 * @return boolean
	 * @throws SQLException
	 */
	public int insert(String insertQuery) throws SQLException {
		statement = db.conn.createStatement();
		int result = statement.executeUpdate(insertQuery);
		return result;

	}

}
