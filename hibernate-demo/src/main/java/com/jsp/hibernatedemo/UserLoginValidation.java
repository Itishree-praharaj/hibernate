package com.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserLoginValidation {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	
	Scanner scn = new Scanner(System.in);
	System.out.println("enter email");
	String email= scn.next();
	
	System.out.println("enter password");
	String password= scn.next();
	
     UserDao dao = new UserDao();
     User u = dao.findByEmailAndPassword(email, password);
		 
		
		if(u!=null) {
			System.out.println("welcome");
		}else {
			System.out.println("invalid creadientials");
	}
	
}
}
