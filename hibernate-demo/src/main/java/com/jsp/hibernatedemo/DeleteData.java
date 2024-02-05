package com.jsp.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");	
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s = em.find(Student.class, 4);
	
	et.begin();
	em.remove(s);
	et.commit();
}
}
