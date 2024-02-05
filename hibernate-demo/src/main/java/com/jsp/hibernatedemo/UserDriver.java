 package com.jsp.hibernatedemo;

import java.util.Scanner;

public class UserDriver {
public static void main(String[] args) {
	UserDao dao = new UserDao();
	
	Scanner scn = new Scanner(System.in);
	User user = new User();
	System.out.println("enter id");
	user.setId(scn.nextInt());
	System.out.println("enter name");
	user.setName(scn.next());
	System.out.println("enter email");
	user.setEmail(scn.next());
	System.out.println("enter password");
	user.setPassword(scn.next());
	System.out.println("enter age");
	user.setAge(scn.nextInt());
	
	dao.saveUser(user);
	System.out.println("Data inserted sucessfully");
}
}
