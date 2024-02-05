package com.jsp.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s = new Student();
	s.setId(4);
	s.setName("gelhu");
	s.setAge(21);
	
	et.begin();
	em.merge(s);
	et.commit();
}
}
