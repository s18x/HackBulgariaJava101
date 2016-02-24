package com.hackbulgaria.database;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class InitDB {
	public static void initDataBase() throws SQLException{
		MysqlDataSource ds = null;
		Connection connect = null;
		Statement statement = null;

		// Create a new DataSource (MySQL specifically)
        ds = new MysqlDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/");
        ds.setUser("root");
        ds.setPassword("");
        connect = ds.getConnection();
        
        statement = connect.createStatement();
        String query = "CREATE DATABASE IF NOT EXISTS warehouse";
	}
}
