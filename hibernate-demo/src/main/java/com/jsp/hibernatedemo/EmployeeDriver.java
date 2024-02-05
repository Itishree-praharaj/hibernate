package com.jsp.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
    employee employee1 = new employee();
	employee1.setId(1);
	employee1.setName("A");
	employee1.setRole("devloper");
	
	et.begin();//allocate block of memory from persistence context.this process is called begining the transaction
	em.persist(employee1);
	et.commit();//save the change in db
}
}
