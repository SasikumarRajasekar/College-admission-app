package ca.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionutil {
  public static Connection getDBconnect() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","oracle");
		
		return con;
		
	}

}
