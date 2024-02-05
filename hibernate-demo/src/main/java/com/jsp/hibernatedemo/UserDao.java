package com.jsp.hibernatedemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void saveUser(User u) {
		et.begin();
		em.persist(u);
		et.commit();
	}
		public User findByEmailAndPassword(String email, String password) {
			Query query= em.createQuery("select u from User u where u.email=?1 and u.password=?2");
			 query.setParameter(1, email);
			 query.setParameter(2, password);
			 
			 List<User> user = query.getResultList();
			 if(user.size()>0) {
				 return user.get(0);
			 }
			 else {
				 
			 }
			 return null;  
		
	}
}
