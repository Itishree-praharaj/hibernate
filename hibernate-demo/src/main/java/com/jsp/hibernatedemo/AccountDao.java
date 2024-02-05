package com.jsp.hibernatedemo;
	import java.util.List;
import java.util.Scanner;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;
import javax.persistence.Query;

	public class AccountDao {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner scn = new Scanner(System.in);
		
		public void saveaccount(Account a) {
			et.begin();
			em.persist(a);
			et.commit();
			
		}
		public Account findById(int id) {
			Account a = em.find(Account.class, id);
			return a;
			
		}
		public void deleteById(int id) {
			Account a = em.find(Account.class, id);
			et.begin();
			em.remove(a);
			et.commit();
		}
		public void updateByName(int id) {
			Account a = em.find(Account.class, id);
			System.out.println("enter new name");
			String name = scn.next();
			
			a.setName(name);
			
			et.begin();
			em.merge(a);
			et.commit();	
		}
		public void updateByMobilenumber(int id) {
			Account a = em.find(Account.class, id);
			System.out.println("enter new mobilenum");
			Long Mobilenumber = scn.nextLong();
			
			a.setMobilenum(Mobilenumber);
			
			et.begin();
			em.merge(a);
			et.commit();	
		}
		public void updateByaccountnumber(int id) {
			Account a = em.find(Account.class, id);
			System.out.println("enter new accountnumber");
			Long accountnumber = scn.nextLong();
			
			a.setAccountnum(accountnumber);
			
			et.begin();
			em.merge(a);
			et.commit();	

		}
		public Account findByAccountnumAndPincode(long accountnum, int pincode) {
			Query query= em.createQuery("select a from Account a where a.accountnum=?1 and a.pincode=?2");
			 query.setParameter(1, accountnum);
			 query.setParameter(2, pincode);
			 
			 List<Account> acc = query.getResultList();
			 if(acc.size()>0) {
				 return acc.get(0);
			 }
			 else {
				 
			 }
			return null;
		}
		



	}

