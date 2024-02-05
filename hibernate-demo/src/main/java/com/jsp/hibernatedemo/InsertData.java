package com.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");	
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner scn = new Scanner(System.in);
		
		for(int i =0;i<2;i++) {
			Student s = new Student();
			System.out.println("enter id");
			int id = scn.nextInt();
			
			System.out.println("enter name");
		     String name = scn.next();
			
			System.out.println("enter age");
			int age = scn.nextInt();
			
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			
			et.begin();
			em.persist(s);
			et.commit();
			
		}
	}
}
