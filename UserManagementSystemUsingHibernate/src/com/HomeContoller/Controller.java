package com.HomeContoller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Service.UserService;
import com.Service.UserServiceImpl;
import com.Util.HibernateUtil;

public class Controller {

	public static void main(String[] args) {
	
	boolean flag=true;
	while(flag) {
	System.out.println("enter the choice");
	System.out.println("1.create user");
	System.out.println("2.Update user");
	System.out.println("3.Delete user");
	System.out.println("4. Get user");
	System.out.println("5.Exit");
	
	Scanner sc=new Scanner(System.in);
	UserService obj=new UserServiceImpl();
	int choice=sc.nextInt(); 
	
	switch (choice) {
	case 1:
		obj.createUser();
		break;
	case 2:
		obj.UpdateUser();;
		break;
	case 3:
		obj.DeleteUser();
		break;

	case 4:
		obj.GetUserInfo();
		break;
	case 5:
		flag=false;
		System.out.println("THANK YOU");
		break;

	default:
		System.out.println("Enter the valid choise");
		break;
	}
	
	}
	}
}
