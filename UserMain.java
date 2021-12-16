package ca.dao;

import java.sql.SQLException;
import java.util.Scanner;

import caclass.RegisterUser;

public class UserMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println("\n1.Register\n2.Login\nEnter your choice");
	int choice=Integer.parseInt(scan.nextLine());
	UserDao UserDao=null;
	
	switch(choice)
	{
	case 1:
		String UserName=null;
		String email = null;
		long MobileNumber=0;
		String UserPassword = null;
		UserDao=new UserDao();
		do
		{
		System.out.println("Enter user Name:");
		UserName=scan.nextLine();
		if(UserName.isEmpty())
		{
			System.out.println("name can't be empty");
		}
		else if (!UserName.matches("[A-Za-z]{3,}")) {
			System.out.println("invalid name");
		}
		}while(!UserName.matches("[A-Za-z]{3,}"));
		
		do
		{
		System.out.println("Enter user Email:");
		email=scan.nextLine();
		if(email.isEmpty())
		{
			System.out.println("email can't be empty");
		}
		else if (!email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")) {
			System.out.println("invalid email id");
		}
		}while(!email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+"));
		
		String tempMobile=null;
		do
		{
		System.out.println("Enter mobile number:");
		tempMobile=scan.nextLine();
		if(!tempMobile.matches("[6-9][0-9]{9}")) 
		{
			System.out.println("Invalid Mobile Number");
		}
		if(tempMobile.isEmpty())
		{
			System.out.println("Mobile number cant be empty");
		}
		}while(!tempMobile.matches("[6-9][0-9]{9}"));
		
		do
		{
		System.out.println("Enter user Password:");
		UserPassword=scan.nextLine();
		if(UserPassword.isEmpty())
		{
			System.out.println("password can't be empty");
		}
		else if (!UserPassword.matches("[A-Za-z0-9@#$%!^&*]{8,10}")) {
			System.out.println("invalid password");
		}
		}while(!UserPassword.matches("[A-Za-z0-9@#$%!^&*]{8,10}"));
		
		RegisterUser RegisterUser=new RegisterUser(UserName, email, MobileNumber,UserPassword);
		UserDao.insert(RegisterUser);
		
	case 2:
		UserDao=new UserDao();
		System.out.println("User Login");
		System.out.println("Enter the registered user name");
		UserName=scan.nextLine();
		System.out.println("Enter the registered password");
		UserPassword=scan.nextLine();
		String String1=UserDao.loginUser(UserName,UserPassword);
		if(String1!=null)
		{
	    System.out.println("Login Successful");
		System.out.println("Welcome "+String1);
		}
	

	}

	
	}
}
	

