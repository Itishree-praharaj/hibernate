package com.jsp.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");	
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
public void saveStudent(Student student) {
et.begin();
em.persist(student);
et.commit();;
	
}
public Student findById(int id) {
	Student s = em.find(Student.class,id);
	return s;
}
public void deleteById(int id) {
	Student s = em.find(Student.class, id);
	et.begin();
	em.remove(s);
	et.commit();
	
}
}

