package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person person=new Person();
person.setName("Itishree");
person.setAge(34);
person.setLoc("banglore");


Identity identity=new Identity();
identity.setName("aadhar");
identity.setNumber(1234567890);
		
		person.setIdentity(identity);
identity.setperson(person);
EntityManagerFactory emf=Persistence.createEntityManagerFactory("itishree");
EntityManager em=emf.createEntityManager();
EntityTransaction et= em.getTransaction();
et.begin();
	}

}
