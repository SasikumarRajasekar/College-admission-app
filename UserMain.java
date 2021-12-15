package ca.dao;

import java.sql.SQLException;
import java.util.Scanner;

import caclass.RegisterUser;

public class UserMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the user name: ");
	String userName=scan.nextLine();
	System.out.println("Enter the user email ");
	String userEmail=scan.nextLine();
	System.out.println("Enter the user mobilenumber ");
	long userMobilenumber=Long.parseLong(scan.nextLine());
	System.out.println("Enter the user password: ");
	String userPassword=scan.nextLine();
	UserDao ud = new UserDao();
	RegisterUser registeruser1=new RegisterUser(userName,userEmail,userMobilenumber,userPassword);
	ud.insert(registeruser1);

	}

	

}
