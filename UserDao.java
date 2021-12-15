package ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import caclass.RegisterUser;


	public class UserDao {
		
		public void insert(RegisterUser RegisterUser) throws ClassNotFoundException, SQLException {
			
			String insertQuery = "insert into User_Table(User_Name,Email,Mobile_Number,User_Password) values(?,?,?,?)";

			Connection con = Connectionutil.getDBconnect();
			
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			
			pstmt.setString(1,RegisterUser.getUserName());
			pstmt.setString(2,RegisterUser.getEmail());
			pstmt.setLong(3,RegisterUser.getMobileNumber());
			pstmt.setString(4,RegisterUser.getUserPassword());
			

				
				int result=pstmt.executeUpdate();
				System.out.println(result+ " is updated !!");
				pstmt.close();
				con.close();
		    }
			
			
	}

		
		



	