package com.jsp.hibernatedemo;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDataDynamically {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	//Student s = new Student();
//	s.setId(3);
	//s.setName("puchunu");
	
	Scanner scn = new Scanner(System.in);
	
	System.out.println("enter id to update");
	int id = scn.nextInt();
	
	Student s = em.find(Student.class, id);
	
	System.out.println("enter new name");
	String name = scn.next();
	 
	s.setName(name);
			
	et.begin();
	em.merge(s);
	et.commit();
}
}
