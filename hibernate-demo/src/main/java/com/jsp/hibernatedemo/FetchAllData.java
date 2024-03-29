package com.jsp.hibernatedemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FetchAllData {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	
	Query query = em.createQuery("select s from Student s");
	List<Student> student = query.getResultList();
	
	
	for(Student s: student) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println("---------------");
	}
	
	
}
}
