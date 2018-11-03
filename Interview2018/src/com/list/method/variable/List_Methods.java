package com.list.method.variable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class List_Methods {
	public static List<Object> listCheck() throws Exception{
		List <Object>result=null;
		Statement stmt = null;
		ResultSet rs = null;
		Connection connection = null;
		
		try{
			connection = MySqlConnection.mycon();
		String sql ="select id,salary,name from manisaschema.user";
		System.out.println(sql);
		stmt=connection.createStatement();
		rs=stmt.executeQuery(sql);
		//stmt.setInt(1, 1001);
		System.out.println(sql);
		while (rs.next()) {
			result = new ArrayList<>();
			result.add(rs.getInt(1));
			result.add(rs.getString(2));
			result.add(rs.getString(3));
			
			//result.add(result);
			System.out.println(result);
			
			System.out.println("Result1 Size " + result.size());
			
		}}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}}

