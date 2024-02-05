
package com.jsp.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");	
	EntityManager em = emf.createEntityManager();
	

	Student student = em.find(Student.class, 1);
	if(student!=null) {
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}
	else {
		System.out.println("invalid id");
}
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");	
	//EntityManager em = emf.createEntityManager();
	//EntityManager em1= emf.createEntityManager();
	
	//em.find(Student.class,1);
	//em.find(Student.class,2);
//	em.find(Student.class,1);
  //  em.find(Student.class,2);

	
}
}