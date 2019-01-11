package com.common.api.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.common.api.propertymanager.PropertyManager;

public class DbRepository {
	private static final DbRepository instance=new DbRepository();
	private DbRepository() {
		try {
			Class.forName(PropertyManager.get().getProperty("app.database.driver"));
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	public static DbRepository getInstance() {
		return instance;
	}
	
	public boolean insert(String query, String[] args) {
		boolean retVal = false;
		Connection con = null;
	try {
		
		con=DriverManager.getConnection(
		PropertyManager.get().getProperty("app.database.url"),PropertyManager.get().getProperty("app.database.user"),PropertyManager.get().getProperty("app.database.pwd"));
		PreparedStatement stmt=con.prepareStatement(query,args);  
		retVal = stmt.execute();
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	return retVal;


	}
}
