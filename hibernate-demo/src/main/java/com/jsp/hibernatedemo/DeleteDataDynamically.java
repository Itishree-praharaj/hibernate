package com.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDataDynamically {
public static void main(String[] args) {
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");	
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Scanner scn = new Scanner(System.in);
	System.out.println("enter id");
	int id = scn.nextInt();
	
	Student s = em.find(Student.class, id);
	
	et.begin();
	em.remove(s);
	et.commit(); 
	
	}
}
