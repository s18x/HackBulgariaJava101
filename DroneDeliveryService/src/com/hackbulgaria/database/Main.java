package com.hackbulgaria.database;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class Main {
	public static void main(String[] args) throws SQLException{
		 MysqlDataSource ds = null;
		 Connection connect = null;
		 Statement statement = null;

		  // Create a new DataSource (MySQL specifically)
          ds = new MysqlDataSource();
          ds.setUrl("jdbc:mysql://localhost:3306/OurCompany");
          ds.setUser("root");
          ds.setPassword("");
          connect = ds.getConnection();
          
          statement = connect.createStatement();
          String query = "SELECT * FROM employees";
          // Execute the query and get the result set.
          ResultSet resultSet = statement.executeQuery(query);
          while(resultSet.next()){
        	  String employeeName = resultSet.getString("first_name");
        	  System.out.println(employeeName);
          }
          System.out.println("Finished.");
	}

}
