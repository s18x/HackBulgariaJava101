package com.hackbulgaria.database;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DatabaseManager {
	public static void initDataBase() throws SQLException{
		MysqlDataSource ds = null;
		Connection connect = null;
		Statement statement = null;

		// Create a new DataSource (MySQL specifically)
        ds = new MysqlDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306?allowMultiQueries=true");
        ds.setUser("root");
        ds.setPassword("");
        connect = ds.getConnection();     
        statement = connect.createStatement();
        
        String path = "resources" + File.separator + "warehouse.sql";
        //String dbQuery = Files.toString(new File(path));
        String dbQuery = "";
		try {
			dbQuery = String.join("\n", Files.readAllLines(Paths.get(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
        // Execute the query and get the result set.
        boolean result = statement.execute(dbQuery);

        System.out.println(result);
        //String query = "CREATE DATABASE IF NOT EXISTS warehouse";
	}
}
