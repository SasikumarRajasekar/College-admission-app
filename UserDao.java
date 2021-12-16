package ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import caclass.ConnectionUtil;
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

	
		public String loginUser(String UserName,String UserPassword)
		{
			String loginQuery="select * from User_Table where User_Name='"+UserName+"' and  User_Password='"+UserPassword+"'" ;
			//String loginQuery1="select * from user_cafe where User_Password="+UserPassword;
			RegisterUser user=null;	
			
			try {
				Connection con=ConnectionUtil.getDBConnect();
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(loginQuery);
				//ResultSet rs1=stmt.executeQuery(loginQuery1);
				if(rs.next())
				{
				
				return rs.getString(2);
				}
				else
				{
					System.out.println("username and password not valid");
				}
				
			} 
			
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
				
			
		}
	}

		
		



	